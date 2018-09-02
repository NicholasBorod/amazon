package com.amazon.test.definitions;

import com.amazon.test.steps.ShoppingCartSteps;
import cucumber.api.java.en.And;
import net.thucydides.core.annotations.Steps;

public class ShoppingCartDef {

    @Steps
    ShoppingCartSteps shoppingCartSteps;

    @And("^Check cart Subtotal values$")
    public void checkCartSubtotalValues(){
        shoppingCartSteps.checkSubtotalQuantity().checkSubtotalPrice();
    }
}
