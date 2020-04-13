package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MainPage extends  BasePage {

    public MainPage(WebDriver driver) { super(driver); }


    public static final By SEARCH_IDENTIFIER = By.id("search_query_top");
    public static final By SEARCH_BUTTON_IDENTIFIER = By.name("submit_search");

    public SearchPage searchProduct (String searchKeyword) {

        driver.findElement(SEARCH_IDENTIFIER).sendKeys(searchKeyword);
        driver.findElement(SEARCH_BUTTON_IDENTIFIER).click();
        return new SearchPage(driver);
    }


}
