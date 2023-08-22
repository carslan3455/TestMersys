package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.logging.Level;
import java.util.logging.Logger;

public class gwd {

    public static WebDriver driver;

    public static WebDriver getDriver() {



        if (driver == null) {

            Logger.getLogger("").setLevel(Level.SEVERE);
            System.setProperty(org.slf4j.simple.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");


            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);

            /** Todo
            Selenium 4.11.0 öncesi versionlar icin gerekli
            https://stackoverflow.com/questions/75674124/can-i-set-remote-allow-origins-without-using-a-wildcard-in-selenium
             */

//            WebDriverManager.firefoxdriver().setup();
//            driver = new FirefoxDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
