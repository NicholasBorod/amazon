package amazon.ui.utils;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class WebDriverUtils {
    public static WebElementFacade scrollIntoView(WebElementFacade element, PageObject page) {
        page.evaluateJavascript("arguments[0].scrollIntoView(arguments[1])", element, true);
        return element;
    }

    private WebDriverUtils() {
    }
}
