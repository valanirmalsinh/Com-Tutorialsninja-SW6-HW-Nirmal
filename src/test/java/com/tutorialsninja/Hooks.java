package com.tutorialsninja;

import com.cucumber.listener.Reporter;
import com.tutorialsninja.propertyreader.PropertyReader;
import com.tutorialsninja.utilities.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import org.junit.After;

import java.io.IOException;


public class Hooks extends Utility {

    @Before
    public void setUp(){
      selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }


    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()){
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
       closeBrowser();
    }

}
