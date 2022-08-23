package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeWebDriver {
    private static WebDriver driver = null;

    public static final WebDriver chromeWebDriver() {
        return driver;
    }


    static void setImplicitWaitWeb(int segundos) {
        driver.manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);


    }

    public static WebDriver hisDriver() {
        System.setProperty("webdriver.chrome.driver", "Untitled2\\Users\\lina.arrieta\\Desktop\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-infoboards");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.advantageonlineshopping.com/#/");
        return driver;
    }

    public static void closeDriver() {
        try {
            driver.quit();
        } catch (Exception e) {
        }
    }
}