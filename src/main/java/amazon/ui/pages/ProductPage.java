package amazon.ui.pages;

import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

@Slf4j
public class ProductPage extends AmazonBasePage {

    @FindBy(css = "select[name='quantity']")
    private WebElementFacade productQuantity;

    @FindBy(css = "#priceblock_ourprice")
    private WebElementFacade price;

    @FindBy(css = "#add-to-cart-button")
    private WebElementFacade addToCart;

    public void setQuantity(int quantity){
        log.info("Set quantity of selected product");
        productQuantity.selectByValue(String.valueOf(quantity));
        priceProcessing(quantity);
    }

    public void addToCart(){
        log.info("Adding item to cart");
        addToCart.click();
    }

    private void priceProcessing(int quantity){
        float number = Float.parseFloat(price.getText().replace("$",""));
        Serenity.setSessionVariable("TotalPrice").to("$"+String.valueOf(priceFormating().format(number*quantity)));
        Serenity.setSessionVariable("QTY").to(String.valueOf(quantity));
    }

    private DecimalFormat priceFormating(){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setDecimalSeparator('.');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat;
    }
}
