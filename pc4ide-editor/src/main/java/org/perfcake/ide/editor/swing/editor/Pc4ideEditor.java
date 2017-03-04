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

package org.perfcake.ide.editor.swing.editor;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JSplitPane;
import org.perfcake.ide.core.components.ComponentCatalogue;
import org.perfcake.ide.core.components.ReflectionComponentCatalogue;
import org.perfcake.ide.core.model.components.ScenarioModel;
import org.perfcake.ide.editor.forms.FormManager;
import org.perfcake.ide.editor.forms.impl.FormManagerImpl;

/**
 * Represents an pc4ide editor as a whole. It consists of graphical editor panel and the panel with form.
 * @author jknelt
 */
public class Pc4ideEditor extends JSplitPane {

    private ScenarioModel scenario;
    private GraphicalPanel graphicalEditorPanel;
    private FormManager formManager;

    public Pc4ideEditor(ScenarioModel scenario) {
        this(scenario, null);
    }

    /**
     * Creates new editor panel.
     *
     * @param scenario         Scenario edited by editor
     * @param componentManager PerfCake inspector manager
     */
    public Pc4ideEditor(ScenarioModel scenario, ComponentCatalogue componentManager) {
        super(JSplitPane.HORIZONTAL_SPLIT);
        // final BorderLayout layout = new BorderLayout();
        // setLayout(layout);
        this.scenario = scenario;

        if (componentManager == null) {
            formManager = new FormManagerImpl(createComponentCatalogue());
        } else {
            formManager = new FormManagerImpl(componentManager);
        }
        graphicalEditorPanel = new GraphicalPanel(scenario, formManager);
        // final FormPage generatorPage = new SimpleFormPage(formManager,
        // new ReflectiveModelDirector(scenario.getGenerator(), componentManager));
        // formManager.addFormPage(generatorPage);

        setLeftComponent(graphicalEditorPanel);
        setRightComponent(formManager.getContainerPanel());

        // setDividerLocation(getWidth() - 200);
        // this.add(graphicalEditorPanel, BorderLayout.CENTER);
        // this.add(formPanel, BorderLayout.LINE_END);
        // formPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        addComponentListener(new ComponentAdapter() {

            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                setDividerLocation(0.7);
            }
        });
    }

    private ComponentCatalogue createComponentCatalogue() {
        return new ReflectionComponentCatalogue();
    }
}