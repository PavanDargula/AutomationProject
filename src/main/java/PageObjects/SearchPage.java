package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    public static final By PRINTED_SUMMER_DRESS_IDENTIFIER = By.xpath("//img[@src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']");
    public static final By PRINTED_DRESS = By.xpath("//img[@src='http://automationpractice.com/img/p/1/0/10-home_default.jpg']");
    public static final By ADD_TO_CART_BUTTON_IDENTIFIER = By.xpath("//span[text()='Add to cart']");
    public static final By PROCEED_TO_CHECKOUT_IDENTIFIER = By.xpath("//span[contains(text(),'Proceed to checkout')]");
    public static final By CONTINUE_SHOPPING_IDENTIFIER = By.xpath("//span[@title='Continue shopping']");
    public static final By ADD_TO_CART_2_IDENTIFIER = By.xpath("//a[contains(@title,'Add to cart')and @data-id-product='4']");



    public YourShoppingCartPage addDressToCart() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement Element = driver.findElement(PRINTED_SUMMER_DRESS_IDENTIFIER);
        action.moveToElement(Element).build().perform();
        driver.findElement(ADD_TO_CART_BUTTON_IDENTIFIER).click();
        Thread.sleep(2000);
        driver.findElement(CONTINUE_SHOPPING_IDENTIFIER).click();
        Thread.sleep(1000);
        WebElement Element1 = driver.findElement(PRINTED_DRESS);
        action.moveToElement(Element1).build().perform();
        driver.findElement(ADD_TO_CART_2_IDENTIFIER).click();
        Thread.sleep(1000);
        driver.findElement(PROCEED_TO_CHECKOUT_IDENTIFIER).click();
        return new YourShoppingCartPage(driver);
    }

}
