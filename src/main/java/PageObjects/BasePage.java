package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver driver ;
    public BasePage(WebDriver driver) {this.driver = driver; }

}
