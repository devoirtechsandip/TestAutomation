package com.company;
import org.openqa.selenium.WebDriver;

public class FlowWrapper {

    public static String globalPrice = "";

    public static void accountCreation_start(WebDriver driver) throws Exception
    {
        UIElements.clickSignUp(driver);
        Thread.sleep(3000);
        UIElements.provideEmail(driver,Constants.EMAIL );
        Thread.sleep(3000);
        UIElements.clickCreateAccount(driver);
        Thread.sleep(6000);
    }

    public static void accountCreation_fillDetails(WebDriver driver) throws Exception
    {
        //ON NEW PAGE

        //UIElements.chooseTitle(driver);
        UIElements.provideFirstName(driver,Constants.FIRSTNAME);
        UIElements.provideLastName(driver, Constants.LASTNAME);
        //UIElements.provideEmail(driver,Constants.EMAIL);
        UIElements.providePass(driver,Constants.PASSWORD);
        //select Dates
        UIElements.selectDate(driver, Constants.DATE);
        UIElements.selectMonth(driver, Constants.MONTH);
        UIElements.selectYear(driver, Constants.YEAR);

        UIElements.provideCompany(driver,Constants.COMPANY);
        UIElements.provideAddress1(driver,Constants.ADDRESS1);
        UIElements.provideAddress2(driver, Constants.ADDRESS2);
        UIElements.provideCity(driver, Constants.CITY);
        //select state
        UIElements.selectState(driver, Constants.STATE);

        UIElements.providePostalCode(driver,Constants.ZIPCODE);
        //select country
        UIElements.selectCountry(driver, Constants.COUNTRY);

        UIElements.provideAdditionalInformation(driver,Constants.ADDITIONAlINFORMATION);
        UIElements.providehomenumber(driver,Constants.HOMEPHONE);
        UIElements.providemobileno(driver,Constants.MOBILEPHONE);
        UIElements.provideaddressalias(driver,Constants.ADDRESSALIAS);

        //click button
        UIElements.clickRegister(driver);
    }

    public static void login(WebDriver driver) throws Exception
    {
        UIElements.clickSignUp(driver);
        Thread.sleep(3000);
        UIElements.provideEmailForLogin(driver,Constants.EMAIL);
        UIElements.providePassForLogin(driver,Constants.PASSWORD);
        UIElements.clickSignIn(driver);
    }

    public static Boolean buyCheckoutAndVerifyPrice(WebDriver driver) throws Exception
    {
        boolean flag = false;
        UIElements.clickMenuWomen(driver);
        UIElements.selectQuickViewItem(driver);
        UIElements.clickToIncreaseQuantity(driver);
        UIElements.clickAddToCart(driver);
        //Store main value in global variable
        globalPrice = UIElements.getPrice(driver);

        UIElements.clickProceedToCheckout(driver);
        String firstComparePrice = UIElements.getPriceOnSummarySection(driver);
        UIElements.clickProceedToCheckoutOnSummarySection(driver);
        UIElements.clickProceedToCheckoutOnAddressSection(driver);
        UIElements.clickTermsAndConditions(driver);
        UIElements.clickProceedToCheckoutOnShippingSection(driver);
        String secondComparePrice = UIElements.getTotalPriceOnPaymentPage(driver);
        UIElements.clickToPayByWire(driver);
        UIElements.clickIConfirmMyOrder(driver);

        if (globalPrice.equalsIgnoreCase(firstComparePrice) && globalPrice.equalsIgnoreCase(secondComparePrice))
        {
            flag= true;
            System.out.println("Price is same at all the places");
        }
        return flag;
    }

    public static Boolean goToHistoryAndVerifyPrice (WebDriver driver, String fname , String lname) throws Exception
    {
        boolean flag = false;
        UIElements.clickProfile(driver,fname,lname);
        UIElements.clickToHistory(driver);
        String priceOnHistory = UIElements.getPriceOnHistory(driver);

        if (globalPrice.equalsIgnoreCase(priceOnHistory))
        {
            flag= true;
        }
        return flag;
    }


}
