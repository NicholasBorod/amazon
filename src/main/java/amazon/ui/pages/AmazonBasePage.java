package amazon.ui.pages;

import amazon.ui.config.Config;
import lombok.extern.slf4j.Slf4j;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.Scroll;

@Slf4j
public class AmazonBasePage extends PageObject {

    public void navigateToHomePage() {
        log.info("Opening home Page");
        setDefaultBaseUrl(Config.getBASE_URL());
        open();
    }

    public WebElementFacade scrollTo(WebElementFacade elememt){
        Scroll.to(elememt);
        return elememt;
    }
}
