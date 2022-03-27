package pages.mercedespages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mercedesloginpage {
    public Mercedesloginpage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    private WebElement myAccountButton;

    @FindBy(xpath = "//li[@class=\"global-header__menu-l3-panel-item global-header__menu-l3-panel-item--profile\"]//button[contains(text(),'Log In')]")
    private WebElement loginButton;

    @FindBy(id="username")
    private WebElement email;

    @FindBy(id="continue")
    private WebElement continueButton;

    @FindBy(className = "placeholder label")
    private WebElement password;

    @FindBy(id="confirm")
    private WebElement nextButton;

    @FindBy(xpath = "//span[@class=\"global-header__menu-l1-list-button-utility-inner\"]")
    private WebElement loginStatus;


    public void login() throws InterruptedException { //String email, String password
        Thread.sleep(1000);
        myAccountButton.click();
//        Thread.sleep(1000);
//        loginButton.click();
//        Thread.sleep(1000);
//        this.email.sendKeys(email);
//        Thread.sleep(1000);
//        continueButton.click();
//        this.password.sendKeys(password);
//        nextButton.click();

    }





}
