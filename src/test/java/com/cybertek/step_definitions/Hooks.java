package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before(order = 1)
    public void setUpScenario(){
        System.out.println("=>Before annotation setting up browser");
    }
    @Before(value = "@db", order = 2)
    public void setUpDatabaseConnection(){
        System.out.println("----Before annotation: DB connection created<========");
    }
    @After(order = 1)
    public void tearDownScenario(Scenario scenario){
      /*  System.out.println("=>After annotation setting up browser");
        System.out.println("scenario.getName() = " + scenario.getName());
        System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
        System.out.println("scenario.isFailed() = " + scenario.isFailed());

       */
      //we need to take a screenshot
        //#1 we need to take a screen shot using SELENIUM -->
        // getScreenshotAs: to be able to use this method we have to cast our driver type to TakesScreenshot
        //#2 we are going to attach it into our report: using attach method
        //attach method accepts 3 arguments. #1: Screenshot itself #2: image type #3 current scenario's name
        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        }

    @After(value = "@db", order = 2)
    public void tearDownDatabaseConnection(){
        System.out.println("----After annotation: DB connection created<========");
    }
    @BeforeStep
    public void setUp(){
        System.out.println("-----------------BeforeStep");
    }
    @AfterStep
    public void tearDownStep(){
        System.out.println(">>>>>>>>>>>>>>>>>>>AfterStep");
    }
}
