package com.amazon.test.steps;

import amazon.ui.pages.BuyOptionPage;
import amazon.ui.pages.ProductPage;
import amazon.ui.pages.ShoppingCartPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import static org.assertj.core.api.Assertions.assertThat;

public class ProductPageSteps {
    @Page
    ProductPage productPage;

    @Page
    BuyOptionPage buyOptionPage;

    @Page
    ShoppingCartPage shoppingCartPage;

    @Step
    public ProductPageSteps setProductQuantity(int quantity){
        productPage.setQuantity(quantity);
        return this;
    }

    @Step
    public ProductPageSteps addToCart(){
        productPage.addToCart();
        assertThat(buyOptionPage.checkAddedToCart())
                .as("Product was not added to cart")
                .isTrue();
        return this;
    }

    @Step
    public ProductPageSteps goToCart(){
        buyOptionPage.goToCart();
        assertThat(shoppingCartPage.isOnCart())
                .as("Shopping Cart page is not opened")
                .isTrue();
        return this;
    }
}
