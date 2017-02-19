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

package org.perfcake.ide.core.utils;

import java.util.Arrays;
import org.perfcake.ide.core.components.ComponentCatalogue;
import org.perfcake.ide.core.components.ReflectionComponentCatalogue;

/**
 * Created by jknetl on 9/30/16.
 */
public class TestUtils {

    private TestUtils() {
    }

    /**
     * Creates new inspector manager.
     *
     * @return PerfCake inspector manager
     */
    public static ComponentCatalogue createCatalogue() {
        ComponentCatalogue componentManager = null;
        componentManager = new ReflectionComponentCatalogue(Arrays.asList(new String[] {"org.perfcake"}));
        return componentManager;
    }
}
