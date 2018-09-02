package com.amazon.test.definitions;

import com.amazon.test.steps.ProductPageSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class ProductPageDef {

    @Steps
    ProductPageSteps productPageSteps;

    @And("^Set selected product quantity to : (\\d+)$")
    public void setProductQuantity(int quantity){
        productPageSteps.setProductQuantity(quantity);
    }

    @Then("^Add product to Cart$")
    public void addProductToCart(){
        productPageSteps.addToCart();
    }

    @And("^Open Cart$")
    public void openCart(){
        productPageSteps.goToCart();
    }
}
