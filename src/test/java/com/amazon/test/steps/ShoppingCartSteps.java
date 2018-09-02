package com.amazon.test.steps;

import amazon.ui.pages.ShoppingCartPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import static org.assertj.core.api.Assertions.assertThat;

public class ShoppingCartSteps {

    @Page
    ShoppingCartPage shoppingCartPage;

    @Step
    public ShoppingCartSteps checkSubtotalQuantity(){
        assertThat(shoppingCartPage.subtotalItemsCount(Serenity.sessionVariableCalled("QTY")))
                .as("Quantity is not expected")
                .isTrue();
        return this;
    }

    @Step
    public ShoppingCartSteps checkSubtotalPrice(){
        assertThat(shoppingCartPage.subtotalItemsPrice(Serenity.sessionVariableCalled("TotalPrice")))
                .as("Total Price is not expected")
                .isTrue();
        return this;
    }
}
