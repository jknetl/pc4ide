/*
 *-----------------------------------------------------------------------------
 * pc4ide
 *
 * Copyright 2017 Jakub Knetl
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *-----------------------------------------------------------------------------
 */

package org.perfcake.ide.editor.controller.impl;

import java.util.List;
import org.perfcake.ide.core.model.Model;
import org.perfcake.ide.core.model.Property;
import org.perfcake.ide.core.model.components.ReporterModel;
import org.perfcake.ide.core.model.properties.Value;
import org.perfcake.ide.editor.controller.AbstractController;
import org.perfcake.ide.editor.view.factory.ViewFactory;
import org.perfcake.ide.editor.view.impl.ReporterView;

/**
 * Controller of reporter.
 * @author Jakub Knetl
 */
public class ReporterController extends AbstractController {

    /**
     * Creates new view.
     *
     * @param senderModel model of sender
     * @param viewFactory view factory
     */
    public ReporterController(Model senderModel, ViewFactory viewFactory) {
        super(senderModel, viewFactory);
        view = viewFactory.createView(senderModel);
        updateViewData();

        List<Property> destinations = model.getProperties(ReporterModel.PropertyNames.DESTINATION.toString());

        for (Property p : destinations) {
            Model destination = p.cast(Model.class);
            addChild(new DestinationController(destination, viewFactory));
        }
    }

    @Override
    public boolean updateViewData() {
        ReporterView view = (ReporterView) this.view;
        boolean modified = false; // was view modified during execution of this method?

        Value implementation = model.getSingleProperty(ReporterModel.PropertyNames.IMPLEMENTATION.toString(), Value.class);

        if (implementation != null && !implementation.getValue().equals(view.getHeader())) {
            view.setHeader(implementation.getValue());
            modified = true;
        }


        return modified;
    }

}
