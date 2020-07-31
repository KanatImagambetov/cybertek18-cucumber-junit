package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.List;

public class GoogleStepDefinitions {
    GoogleSearchPage googleSearchPage=new GoogleSearchPage();


    @Given("User is on the google search page")
    public void user_is_on_the_google_search_page() {
 //       Assert.fail("eqaaeae");
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Google";
//Assert.fail("eqaaeae");
        Assert.assertEquals("Actual title doesnt match expected title!", actualTitle,expectedTitle);
    }

    @When("User search apple")
    public void user_search_apple() {
        GoogleSearchPage googleSearchPage=new GoogleSearchPage();
        googleSearchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }
    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        String actual=Driver.getDriver().getTitle();
        String expected="apple - Google Search";
        Assert.assertEquals(actual,expected);

     }

    @When("User search {string}")
    public void userSearch(String searchValue) {
        GoogleSearchPage googleSearchPage=new GoogleSearchPage();
        googleSearchPage.searchBox.sendKeys(searchValue+ Keys.ENTER);

    }

    @Then("User should see {string} in the title")
    public void userShouldSeeInTheTitle(String searchValue) {
        String actual=Driver.getDriver().getTitle();
        String expected=searchValue+" - Google Search";
        Assert.assertEquals(actual,expected);
    }


    @Then("User should see About link")
    public void userShouldSeeAboutLink() {
        GoogleSearchPage googleSearchPage=new GoogleSearchPage();
        Assert.assertTrue(googleSearchPage.AboutLink.isDisplayed());
    }

    @And("User clicks to About link")
    public void userClicksToAboutLink() {
        GoogleSearchPage googleSearchPage=new GoogleSearchPage();
          googleSearchPage.AboutLink.click();
    }

    @Then("User should see title Google - About Google, Our Culture & Company News")
    public void userShouldSeeTitleGoogleAboutGoogleOurCultureCompanyNews() {
   String expectedTitle = "Google - About Google, Our Culture & Company News";
   String actual=Driver.getDriver().getTitle();
   Assert.assertEquals(actual,expectedTitle);
    }

    @Then("User should see six links in the footer")
    public void user_should_see_six_links_in_the_footer(List<String> linkStrings) {
        int expectedSize=linkStrings.size();
        int actualSize=googleSearchPage.footerLinks.size();
        System.out.println("linkStrings = " + linkStrings);
        Assert.assertEquals(actualSize,expectedSize);
    }
}
