package com.cybertek.step_definitions;

import com.cybertek.pages.WikiSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class WikiStepDefinitions {
WikiSearchPage wikiSearchPage=new WikiSearchPage();
    @Given("User is on the Wikipedia page")
    public void user_is_on_the_wikipedia_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
     }

    @When("User search {string} in wiki search page")
    public void user_search_in_wiki_search_page(String string) {
wikiSearchPage.searchWiki.sendKeys(string+ Keys.ENTER);
    }

    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String expected) {
String actual=Driver.getDriver().getTitle();
        Assert.assertTrue(actual.contains(expected));
    }

    @When("User search {string} in the wiki search page")
    public void userSearchInTheWikiSearchPage(String string) {
        wikiSearchPage.searchWiki.sendKeys(string+ Keys.ENTER);

    }
    @Then("User should see {string} the main header")
    public void userShouldSeeTheMainHeader(String expectedIm) {
        String actual=wikiSearchPage.imageHeader.getText();
        Assert.assertEquals(actual,expectedIm);

    }

    @Then("User should see {string} in the image header")
    public void userShouldSeeInTheImageHeader(String expectedHeader) {
    String actual_header=wikiSearchPage.imageHeader.getText();
    Assert.assertEquals(actual_header,expectedHeader);
    }


//    @When("User search {string} in the wiki {int} search page")
//    public void userSearchInTheWikiSearchPage(String arg0, int arg1) {

//    }
}
