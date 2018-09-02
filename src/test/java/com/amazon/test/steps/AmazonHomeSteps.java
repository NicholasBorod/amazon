package com.amazon.test.steps;

import amazon.ui.pages.AmazonHomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import static org.assertj.core.api.Assertions.assertThat;


public class AmazonHomeSteps {

    @Page
    AmazonHomePage amazonHomePage;

    @Step
    public AmazonHomeSteps searchForText(String searchValue){
        amazonHomePage.searchByText(searchValue);
        return this;
    }

    @Step
    public AmazonHomeSteps naviagateToHomePage(){
        amazonHomePage.navigateToHomePage();
        return this;
    }

    @Step
    public AmazonHomeSteps selectProductByNumber(int number){
        amazonHomePage.selectProductByNumber(number);
        return this;
    }

    @Step
    public AmazonHomeSteps isOpen(){
        assertThat(amazonHomePage.isOpen())
                .as("")
                .isTrue();
        return this;
    }



}