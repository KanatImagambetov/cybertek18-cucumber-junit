package com.cybertek.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                  "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/cybertek/step_definitions",
        dryRun = false,
       // tags="@employee and @sunday and not @librarian"
//tags = "@loginWithBackground and @db"
 //       tags = "@wip"
 //       tags="@etsyWip"
        tags="@wiki"
   //     tags="@scenarioOutline"
)
public class CukesRunner {
}
//press ctrl -/+ to zoom in or out
