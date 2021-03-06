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

import java.util.Objects;
import org.perfcake.ide.core.model.AbstractProperty;
import org.perfcake.ide.core.model.PropertyInfo;
import org.perfcake.ide.core.model.PropertyType;
import org.perfcake.ide.core.model.validation.error.CompoundError;
import org.perfcake.ide.core.model.validation.error.ValidationError;

/**
 * Represents a key-value object.
 *
 * @author Jakub Knetl
 */
public class KeyValueImpl extends AbstractProperty implements KeyValue {

    public static final String KEY_EVENT_SUFFIX = "key";
    public static final String VALUE_EVENT_SUFFIX = "value";
    public static final String ANY_EVENT_SUFFIX = "any";
    private String key;
    private String value;
    private String any;

    /**
     * Constructs new key-value instance.
     *
     * @param key   key of the instance
     * @param value value of the instance
     */
    public KeyValueImpl(String key, String value) {
        super(PropertyType.KEY_VALUE);
        this.key = key;
        this.value = value;

    }

    /**
     * Constructs new key-value instance.
     *
     * @param key   key of the instance
     * @param value value of the instance
     * @param any   arbitrary value associated with key-value store
     */
    public KeyValueImpl(String key, String value, String any) {
        super(PropertyType.KEY_VALUE);
        this.key = key;
        this.value = value;
        this.any = any;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public void setKey(String key) {
        String oldKey = this.key;
        this.key = key;
        fireChangeEvent(KEY_EVENT_SUFFIX, oldKey, key);
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        String oldValue = this.value;
        this.value = value;

        fireChangeEvent(VALUE_EVENT_SUFFIX, oldValue, value);
    }

    @Override
    public String getAny() {
        return any;
    }

    @Override
    public void setAny(String any) {
        String oldAny = this.any;
        this.any = any;
        fireChangeEvent(ANY_EVENT_SUFFIX, oldAny, any);
    }

    @Override
    public boolean isValid() {
        boolean isKeyValid = true;
        boolean isValueValid = true;

        if (getPropertyInfo() != null) {
            PropertyInfo info = getPropertyInfo();
            isKeyValid = info.getKeyValidator().validate(this, getKey()) == null;
            isValueValid = info.getValueValidator().validate(this, getValue()) == null;
        }
        return isKeyValid && isValueValid;
    }

    @Override
    public ValidationError getValidationError() {
        ValidationError keyError = null;
        ValidationError valueError = null;

        if (getPropertyInfo() != null) {
            PropertyInfo info = getPropertyInfo();
            keyError = info.getKeyValidator().validate(this, getKey());
            valueError = info.getValueValidator().validate(this, getValue());
        }

        ValidationError result = null;
        if (keyError != null && valueError != null) {
            result = new CompoundError(this, null, keyError, valueError);
        } else if (keyError != null) {
            result = keyError;
        } else if (valueError != null) {
            result = valueError;
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyValueImpl keyValue = (KeyValueImpl) o;
        return Objects.equals(key, keyValue.key)
                && Objects.equals(value, keyValue.value)
                && Objects.equals(any, keyValue.any);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, any);
    }

    @Override
    public String toString() {
        return "KeyValueImpl{"
                + "key='" + key + '\''
                + ", value='" + value + '\''
                + ", any='" + any + '\''
                + '}';
    }
}
