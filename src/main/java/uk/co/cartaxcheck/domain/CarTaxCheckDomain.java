package uk.co.cartaxcheck.domain;

import uk.co.cartaxcheck.page.CarTaxCheckPage;

import static org.junit.Assert.assertEquals;

public class CarTaxCheckDomain {

    CarTaxCheckPage carTaxCheckPage = new CarTaxCheckPage();

    public CarTaxCheckDomain enterRegistration ( String vehicleRegistration ) {
        carTaxCheckPage.enterEnterRegistrationField(vehicleRegistration)
                .clickFreeCarCheckButton();
        return this;
    }

    public void verifyRegistration ( String registration ) {
        String actual = carTaxCheckPage.getRegistrationText();
        assertEquals(registration, actual);
        System.out.println(carTaxCheckPage.getRegistrationText());
    }

    public void verifyMake ( String make ) {
        String actual = carTaxCheckPage.getMakeText();
        assertEquals(make, actual);
        System.out.println(carTaxCheckPage.getMakeText());
    }

    public void verifyModel ( String model ) {
        String actual = carTaxCheckPage.getModelText();
        assertEquals(model, actual);
        System.out.println(carTaxCheckPage.getModelText());
    }

    public void verifyColour ( String colour ) {
        String actual = carTaxCheckPage.getColourText();
        assertEquals(colour, actual);
        System.out.println(carTaxCheckPage.getColourText());
    }

    public void verifyYear ( String year ) {
        String actual = carTaxCheckPage.getYearText();
        assertEquals(year, actual);
        System.out.println(carTaxCheckPage.getYearText());
    }
}