package uk.co.cartaxcheck.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static uk.co.cartaxcheck.base.DriverContext.driver;

public class CarTaxCheckPage {

    private By enterRegistrationField = By.id("vrm-input");
    private By freeCarCheckButton = By.className("jsx-3655351943");
    private static By registrationText = By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[1]/dd");
    private static By makeText = By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[2]/dd");
    private static By modelText = By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[3]/dd");
    private static By colourText = By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[4]/dd");
    private static By yearText = By.xpath("//*[@id=\"m\"]/div/div[3]/div[1]/div/span/div[2]/dl[5]/dd");

    public CarTaxCheckPage enterEnterRegistrationField ( String vehicleRegistration ) {
        driver.findElement(enterRegistrationField).sendKeys(vehicleRegistration);
        return this;
    }

    public CarTaxCheckPage clickFreeCarCheckButton () {
        driver.findElement(freeCarCheckButton).click();
        return this;
    }

    public String getRegistrationText () {
        new WebDriverWait(driver, 100).until(ExpectedConditions.presenceOfElementLocated(registrationText));
        WebElement registration = driver.findElement(registrationText);
        return registration.getText();
    }

    public String getMakeText () {
        WebElement make = driver.findElement(makeText);
        return make.getText();
    }

    public String getModelText () {
        WebElement model = driver.findElement(modelText);
        return model.getText();
    }

    public String getColourText () {
        WebElement colour = driver.findElement(colourText);
        return colour.getText();
    }

    public String getYearText () {
        WebElement year = driver.findElement(yearText);
        return year.getText();
    }
}