package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Library_Step_Definitions {
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("user on login page");
    }
    @When("User logs in as librarian")
    public void user_logs_in_as_librarian() {
        System.out.println("user log in as librirain");
    }
    @Then("User should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("user is on dashboard");
    }
    @When("User logs in as student")
    public void user_logs_in_as_student() {
        System.out.println("login as student");
    }
    @When("User logs in as admin")
    public void user_logs_in_as_admin() {
        System.out.println("login as admin");
    }
}
