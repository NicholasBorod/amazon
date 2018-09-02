package amazon.ui.pages;

import amazon.ui.config.Config;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

@Slf4j
public class AmazonHomePage extends AmazonBasePage {

    @FindBy(css = "#twotabsearchtextbox")
    private WebElementFacade searchInputField;

    @FindBy(css = "input[type='submit']")
    private WebElementFacade searchButton;

    @FindBy(css = "[id='desktop-banner']")
    private WebElementFacade homePageIndication;

    private WebElementFacade productByNumber(int number){
        return find(By.cssSelector(String.format("[id='result_%d'] img",number-1)));
    }

    public void searchByText(String searchValue){
        log.info("Searching for : {}",searchValue);
        searchInputField.sendKeys(searchValue);
        searchButton.click();
        waitABit(3000);
    }

    public boolean isOpen() {
        return homePageIndication.withTimeoutOf(1, TimeUnit.SECONDS).isPresent();
    }

    public void selectProductByNumber(int number){
        log.info("Selecting product number {} from search result",number);
        scrollTo(productByNumber(number)).click();
    }

}
