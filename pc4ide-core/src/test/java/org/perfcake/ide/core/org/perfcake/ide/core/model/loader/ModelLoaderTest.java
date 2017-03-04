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

package org.perfcake.ide.core.org.perfcake.ide.core.model.loader;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.perfcake.PerfCakeException;
import org.perfcake.ide.core.exception.ModelConversionException;
import org.perfcake.ide.core.model.loader.ModelLoader;
import org.perfcake.model.Scenario;

/**
 * Tests for {@link org.perfcake.ide.core.model.loader.ModelLoader}.
 * @author Jakub Knetl
 */
public class ModelLoaderTest {

    private ModelLoader loader = new ModelLoader();

    @Test
    public void testParsing() throws ModelConversionException, PerfCakeException, MalformedURLException {

        String[] scenarios = new String[] {
                "bob.xml",
                "john.xml",
                "maria.xml"
        };
        for (String scenario : scenarios) {
            URL scenarioUrl = Paths.get("src/test/resources/users/scenarios/" + scenario).toUri().toURL();
            Scenario xmlScenario =  loader.parse(scenarioUrl);
            assertThat(xmlScenario, not(nullValue()));
        }
    }
}