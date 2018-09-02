package com.amazon.test.definitions;

import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;

import com.amazon.test.steps.AmazonHomeSteps;

public class AmazoneHomeDef {

    @Steps
    AmazonHomeSteps amazonHomeSteps;

    @Given("^Amazon home page is open$")
    public void homePageIsOpen() {
        amazonHomeSteps.naviagateToHomePage().isOpen();
    }

    @And("^User search for : \"(.*)\"$")
    public void userSearchForValue(String searchValue){
        amazonHomeSteps.searchForText(searchValue);
    }

    @And("^User select product with number (\\d+)$")
    public void userSelectProducNumber(int number){
        amazonHomeSteps.selectProductByNumber(number);
    }

}
