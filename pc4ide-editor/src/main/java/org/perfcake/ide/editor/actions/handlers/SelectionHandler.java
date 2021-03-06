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

package org.perfcake.ide.editor.actions.handlers;

import java.awt.geom.Point2D;
import org.perfcake.ide.editor.actions.ActionType;
import org.perfcake.ide.editor.controller.visitor.UnselectVisitor;
import org.perfcake.ide.editor.form.FormManager;
import org.perfcake.ide.editor.form.impl.FormControllerImpl;

/**
 * Handles selection event on a controller.
 *
 * @author Jakub Knetl
 */
public class SelectionHandler extends AbstractHandler {

    /**
     * Creates new Selection handler.
     */
    public SelectionHandler() {
        super(ActionType.SELECT);
    }

    @Override
    public void handleAction(Point2D location) {
        UnselectVisitor visitor = new UnselectVisitor();
        controller.getRoot().accept(visitor);
        controller.getView().setSelected(true);
        FormManager formManager = controller.getRoot().getFormManger();
        //TODO: enable to obtain formManager
        formManager.removeAllPages();
        formManager.addPage(new FormControllerImpl(controller.getModel(), formManager.getModelFactory()));
        //FormPage page = new SimpleFormPage(formManager, controller.getModel());
        //formManager.addFormPage(page);
    }
}
