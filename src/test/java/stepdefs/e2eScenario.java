package stepdefs;

import PageObjects.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import TestClass.BaseTest;
import static org.assertj.core.api.Assertions.*;


public class e2eScenario  {

    WebDriver driver = new ChromeDriver();
    String url = "http://automationpractice.com/index.php";
    @Given("^User logs into website$")
    public void user_logs_into_website() throws Exception {
        driver.get(url);

    }

    @When("^User searches for the dress with search word \"([^\"]*)\"$")
    public void user_searches_for_the_dress_with_search_word(String searchKeyword) throws Exception {
        MainPage mainPage = new MainPage(driver);
        SearchPage searchPage = mainPage.searchProduct(searchKeyword);
        YourShoppingCartPage yourShoppingCartPage = searchPage.addDressToCart();
        AuthenticationPage authenticationPage = yourShoppingCartPage.proceedToCheckout();
        authenticationPage.createNewAccount();

    }

    @Then("^Completes the checkout$")
    public void completes_the_checkout() throws Exception {
        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        String Message = AuthenticationPage.authenticateMconfirmationMessage();
        assertThat(Message.equalsIgnoreCase("Your order on My Store is complete."));


    }

}
