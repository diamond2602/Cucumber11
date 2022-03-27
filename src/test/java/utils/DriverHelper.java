package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverHelper {
    private static WebDriver driver;
    // Private constructor to make sure they do not create an object
    //from this class
    private DriverHelper(){

    }
    public static WebDriver getDriver(){

        if(driver==null){// I am checking driver whether it is null or not.
            // if driver is null I am going to create a new on
            //if not, It is not going to create a new Driver.It will use the existing(current) one.
            switch (ConfigReader.readProperty("browser")){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();

                    break;
                case "firefox":  // this not working for me needs to be fixed
                    WebDriverManager.firefoxdriver().setup();
                    driver= new FirefoxDriver();

                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver= new ChromeDriver();

            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies(); // for fresh start(testing)
            //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            // this implicitlyWait will wait for the elements until 5 seconds to be loaded.

        }
        return driver;
    }
    public static void tearDown(){
     //   driver.quit();
      //  driver=null;
    }
}
