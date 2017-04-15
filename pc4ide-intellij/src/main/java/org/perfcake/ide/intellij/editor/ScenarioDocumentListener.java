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

package org.perfcake.ide.intellij.editor;

import com.intellij.openapi.editor.event.DocumentAdapter;
import com.intellij.openapi.editor.event.DocumentEvent;
import org.perfcake.ide.core.exception.Pc4ideException;
import org.perfcake.ide.editor.swing.editor.Pc4ideEditor;

/**
 * Manages updating scenario editor content on document change.
 * @author Jakub Knetl
 */
class ScenarioDocumentListener extends DocumentAdapter {

    private boolean enabled;
    private Pc4ideEditor editor;

    public ScenarioDocumentListener(Pc4ideEditor editor) {
        this.editor = editor;
        enabled = true;
    }

    @Override
    public void documentChanged(DocumentEvent e) {
        if (!enabled) {
            // ignore event if listener is not enabled
            return;
        }
        try {
            //TODO: this is called too often, try to filter events which doesn't need to be handled!
            editor.load();
        } catch (Pc4ideException e1) {
            //todo: log and notify
            e1.printStackTrace();
        }
    }

    public boolean isEnabled() {
        return enabled;
    }

    public ScenarioDocumentListener setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }
}