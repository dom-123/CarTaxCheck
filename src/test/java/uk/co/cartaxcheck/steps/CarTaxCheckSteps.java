package uk.co.cartaxcheck.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.cartaxcheck.domain.CarTaxCheckDomain;
import uk.co.cartaxcheck.page.HomePage;

import java.io.IOException;

public class CarTaxCheckSteps {

    HomePage homePage = new HomePage();
    CarTaxCheckDomain carTaxCheckDomain = new CarTaxCheckDomain();

    @Given("I am on cartaxcheck home page")
    public void iAmOnCartaxcheckHomePage () throws IOException {
        homePage.visit();
    }

    @When("I enter {string} on enter registration field and click free car check button")
    public void iEnterOnEnterRegistrationFieldAndClickFreeCarCheckButton ( String vehicleRegistration ) {
        carTaxCheckDomain.enterRegistration(vehicleRegistration);
    }

    @Then("the following vehicle identity {string} {string} {string} {string} {string} are displayed")
    public void theFollowingVehicleIdentityAreDisplayed ( String registration, String make, String model, String colour, String year ) {
        carTaxCheckDomain.verifyRegistration(registration);
        carTaxCheckDomain.verifyMake(make);
        carTaxCheckDomain.verifyModel(model);
        carTaxCheckDomain.verifyColour(colour);
        carTaxCheckDomain.verifyYear(year);
    }
}