package stepdefinitions.productsteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.productpages.ProductLoginPage;
import pages.productpages.ProductMainPage;
import pages.productpages.ProductOrderPage;
import utils.ConfigReader;
import utils.DriverHelper;


public class ProductOrderSteps {
    WebDriver driver = DriverHelper.getDriver();
    ProductLoginPage productLoginPage = new ProductLoginPage(driver);
    ProductMainPage productMainPage = new ProductMainPage(driver);
    ProductOrderPage productOrderPage= new ProductOrderPage(driver);

    @Given("the user navigates to product website homepage and the user click orderButton")
    public void the_user_navigates_to_product_website_homepage_and_the_user_click_order_button() {
        productLoginPage.login(ConfigReader.readProperty("productusername"), ConfigReader.readProperty("productpassword"));
        productMainPage.clickOrderButton();
    }

    @When("the user enters the product information {string} and {string}")
    public void the_user_enters_the_product_information_and(String productName, String quantity) {
        productOrderPage.sendProductInfo(productName, quantity);
    }

    @When("the user enters the address information {string}, {string},{string},{string},{string}")
    public void the_user_enters_the_address_information(String customerName, String street, String city, String state, String zipCode) {
        productOrderPage.sendAddressInformation(customerName, street, city, state, zipCode);
    }

    @When("teh user enters the card information {string}, {string}, {string}")
    public void teh_user_enters_the_card_information(String carType, String cardNumber, String expireDate) {
        productOrderPage.selectCard(carType);
        productOrderPage.sendPaymentInformation(cardNumber, expireDate);

    }

    @Then("the user validates success message")
    public void the_user_validates_success_message() throws InterruptedException {
       productOrderPage.clickProcessButton();
       Thread.sleep(500);
       Assert.assertEquals("New order has been successfully added.", productOrderPage.getSuccessMessage());
    }

    @Then("the user validates product details {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void the_user_validates_product_details(String customerName, String productName, String quantity, String street, String city, String state, String zipCode, String cardType, String cardNumber, String expireDate) {
        productMainPage.clickViewAllOrdersButton();
        productOrderPage.getinfo(customerName, productName, quantity, street, city, state, zipCode, cardType, cardNumber, expireDate);

    }
}
