package amazon.ui.pages;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Slf4j
public class ShoppingCartPage extends AmazonBasePage {

    @FindBy(xpath = "//*[@id='sc-active-cart']//*[contains(text(),'Shopping Cart')]")
    private WebElementFacade shoppingCartText;

    @FindBy(xpath = "//*[@id='sc-subtotal-label-activecart']")
    private WebElementFacade subtotalLable;

    @FindBy(xpath = "//*[@id='sc-subtotal-amount-activecart']")
    private WebElementFacade subtotalPrice;

    public boolean isOnCart(){
        log.info("Verifying that user is on cart page");
        return shoppingCartText.isCurrentlyVisible();
    }

    public boolean subtotalItemsCount(String quantity){
        log.info("Verifying cart's items quantity is equal {}",quantity);
        String qty = subtotalLable.getText().replaceAll("\\D+\\(","")
                .replaceAll(" .*","");
        return qty.equals(quantity);
    }

    public boolean subtotalItemsPrice(String price)
    {
        log.info("Verifying cart's items total price is equal {}",price);
        log.info("price {}",price);
        log.info("subtotal {}",subtotalPrice.getText());
        return subtotalPrice.getText().equals(price);
    }
}
