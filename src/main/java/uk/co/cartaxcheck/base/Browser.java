package uk.co.cartaxcheck.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import uk.co.cartaxcheck.config.ConfigReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import static uk.co.cartaxcheck.base.DriverContext.driver;

public class Browser extends Base {

    private static final String CHROME_EXECUTABLE_PATH = "src//main//resources//executable//chromedriver.exe";
    private static final String GLOBAL_PROPERTIES_PATH = "src//main//java//uk//co//cartaxcheck//config//global.properties";

    @Before
    public static void startBrowserSession () throws IOException {

        ConfigReader.populateSettings();

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream(GLOBAL_PROPERTIES_PATH);
        prop.load(fis);
        prop.getProperty("browser");

        System.setProperty("webdriver.chrome.driver", CHROME_EXECUTABLE_PATH);
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver();
    }
    @After
    public void closeBrowserSession () {
        driver.quit();
    }
}