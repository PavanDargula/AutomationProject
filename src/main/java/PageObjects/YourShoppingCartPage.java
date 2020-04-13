package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourShoppingCartPage extends BasePage {


    public YourShoppingCartPage(WebDriver driver) {super(driver); }
        public static final By PROCEED_TO_CHECKOUT_IDENTIFIER = By.xpath("//span[text()='Proceed to checkout']");

    public AuthenticationPage proceedToCheckout() throws InterruptedException {
        driver.findElement(PROCEED_TO_CHECKOUT_IDENTIFIER).click();
        Thread.sleep(1000);
        return new AuthenticationPage(driver);

    }

}
