package amazon.ui.pages;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

@Slf4j
public class BuyOptionPage extends AmazonBasePage {

    @FindBy(xpath = "//*[@id='huc-v2-order-row-confirm-text']/*[contains(text(),'Added to Cart')]")
    private WebElementFacade checkAddedToCart;

    @FindBy(css = "#hlb-view-cart-announce")
    private WebElementFacade goToCart;

    public boolean checkAddedToCart(){
        log.info("Verifying if product was added to cart");
        return checkAddedToCart.isCurrentlyVisible();
    }

    public void goToCart(){
        log.info("Navigating to cart page");
        goToCart.click();
    }
}
