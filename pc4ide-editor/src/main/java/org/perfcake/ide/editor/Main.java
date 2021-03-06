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
/**
 *
 */

package org.perfcake.ide.editor;

import java.awt.EventQueue;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFrame;
import org.perfcake.PerfCakeException;
import org.perfcake.ide.core.command.invoker.DefaultCommandInvoker;
import org.perfcake.ide.core.components.ReflectionComponentCatalogue;
import org.perfcake.ide.core.exception.ModelConversionException;
import org.perfcake.ide.core.manager.ScenarioManager;
import org.perfcake.ide.core.manager.ScenarioManagers;
import org.perfcake.ide.editor.controller.NoopExecutionFactory;
import org.perfcake.ide.editor.swing.editor.Pc4ideEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Main class. This class is intendet for testing purposes only. The program should
 * run inside of IDE instead.
 *
 * @author jknetl
 */
public class Main {

    static final Logger logger = LoggerFactory.getLogger(Main.class);

    /**
     * Main method for launching editor
     *
     * @param args arguments
     * @throws PerfCakeException        when scenario cannot be loaded.
     * @throws MalformedURLException    when URL to scenario file is illegal.
     * @throws ModelConversionException when model cannot be converted
     */
    public static void main(String[] args) throws PerfCakeException, MalformedURLException, ModelConversionException {

        if (args.length == 0) {
            System.out.println("No scenario file specified as argument. Exiting");
            System.exit(1);
        }

        logger.info("Application is starting. Loading scenario: {}", args[0]);

        final Path scenarioPath = Paths.get(args[0]);

        ScenarioManager scenarioManager = ScenarioManagers.createXmlManager(scenarioPath);


        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                /*
                final PerfCakeScenarioParser parser = new PerfCakeScenarioParser();
                ScenarioModel model = null;
                try {
                    final Scenario s = parser.parse(new File("src/main/resources/scenario/http.xml").toURI().toURL());
                    model = ModelConverter.getPc4ideModel(s);
                } catch (final PerfCakeException e) {
                    e.printStackTrace();
                } catch (final MalformedURLException e) {
                    e.printStackTrace();
                }
                */

                final JFrame frame = new JFrame();
                frame.setTitle("Perfcake editor");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // final GraphicalPanel editor = new GraphicalPanel(model);
                final Pc4ideEditor editor;
                try {
                    editor = new Pc4ideEditor(scenarioManager, new NoopExecutionFactory(), DefaultServiceManager.getInstance(),
                            new DefaultCommandInvoker());
                    frame.add(editor.getContentPanel());
                    frame.setVisible(true);
                } catch (PerfCakeException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
