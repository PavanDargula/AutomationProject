package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class addProductToCart {
    String url = "http://automationpractice.com/index.php";
    WebDriver driver = new ChromeDriver();
    @Given("^User navigates to the webpage$")
    public void user_navigates_to_the_webpage() throws Exception {
        // Write code here that turns the phrase above into concrete actions

        driver.get(url);
        WebElement TShirt = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]//img"));
        System.out.println("Faded Short Sleeve T-Shirt is found");

        Actions action = new Actions(driver);
        action.moveToElement(TShirt).build().perform();
        WebElement ADD_TO_CART_BUTTON_IDENTIFIER = driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span"));
        ADD_TO_CART_BUTTON_IDENTIFIER.click();


    }

    @When("^User clicks and adds product to cart$")
    public void user_clicks_and_adds_product_to_cart() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(1000);
        WebElement PROCEED_TO_CHECKOUT_IDENTIFIER = driver.findElement(By.xpath("//*[contains(text(),'Proceed to checkout')]"));
        PROCEED_TO_CHECKOUT_IDENTIFIER.click();
        WebElement PROCEED_TO_CHECKOUT_2_IDENTIFIER = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
        PROCEED_TO_CHECKOUT_2_IDENTIFIER.click();

    }

    @Then("^Product is visible in the basket$")
    public void product_is_visible_in_the_basket() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

}
