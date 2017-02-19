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

package org.perfcake.ide.core.model.properties;

import org.perfcake.ide.core.model.AbstractProperty;
import org.perfcake.ide.core.model.PropertyType;

/**
 * Represents properties value in model.
 *
 * @author Jakub Knetl
 */
public class SimpleValue extends AbstractProperty implements Value {

    private String value;

    /**
     * Creates new properties value.
     *
     * @param value value of the property
     */
    public SimpleValue(String value) {
        super(PropertyType.VALUE);
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        String oldValue = this.value;
        this.value = value;

        fireChangeEvent(oldValue, value);
    }
}