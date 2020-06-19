package uk.co.cartaxcheck.page;

import uk.co.cartaxcheck.base.Base;
import uk.co.cartaxcheck.config.Settings;

import java.io.IOException;
import static uk.co.cartaxcheck.base.DriverContext.driver;

public class HomePage extends Base {

    public HomePage visit () throws IOException {
        driver.manage().window().maximize();
        driver.get(Settings.siteUrl);
        return this;
    }
}