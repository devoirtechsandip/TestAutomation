package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UIElements {

	//find elements
    public static By signup = By.xpath("//a[@class='login']");
    public static By emailaddress = By.xpath("//input[@id='email_create']");
    public static By createaccount = By.xpath("//form[@id='create-account_form']//span[1]");

    //register user
    public static By title = By.xpath("//input[@id='id_gender2']");
    public static By firstname = By.xpath("//input[@id='customer_firstname']");
    public static By lastname= By.xpath("//input[@id='customer_lastname']");
    public static By repeat_email = By.xpath("//input[@id='email']");
    public static By password = By.xpath("//input[@id='passwd']");
    public static By company = By.xpath("//input[@id='company']");
    public static By address1 = By.xpath("//input[@id='address1']");
    public static By address2 = By.xpath("//input[@id='address2']");
    public static By city= By.xpath("//input[@id='city']");
    public static By postalcode =By.xpath("//input[@id='postcode']");
    public static By additionalinfor = By.xpath("//textarea[@id='other']");
    public static By homephone = By.xpath("//input[@id='phone']");
    public static By mblno = By.xpath("//input[@id='phone_mobile']");
    public static By addressalias = By.xpath("//input[@id='alias']");
    //button
    public static By buttonregister= By.xpath("//span[contains(text(),'Register')]");
    //Select elements
    public static By DOB_day = By.xpath("//select[@id='days']");
    public static By DOB_month = By.xpath("//select[@id='months']");
    public static By DOB_years =By.xpath("//select[@id='years']");
    public static By state = By.xpath("//select[@id='id_state']");
    public static By country = By.xpath("//select[@id='id_country']");

    //for select buttons
    public static void selectDate (WebDriver driver, String date) throws Exception
    {
        driver.wait(3000);
        Select drpDate = new Select(driver.findElement(DOB_day));
        drpDate.selectByValue(date);
    }
    public static void selectMonth (WebDriver driver, String month) throws Exception
    {
        driver.wait(3000);
        Select drpMonth = new Select(driver.findElement(DOB_month));
        drpMonth.selectByValue(month);
    }
    public static void selectYear (WebDriver driver, String year) throws Exception
    {
        driver.wait(3000);
        Select drpYear = new Select(driver.findElement(DOB_years));
        drpYear.selectByValue(year);
    }
    public static void selectState (WebDriver driver, String statename) throws Exception
    {
        driver.wait(3000);
        Select drpState = new Select(driver.findElement(state));
        drpState.selectByValue(statename);
    }
    public static void selectCountry (WebDriver driver, String countryname) throws Exception
    {
        driver.wait(3000);
        Select drpCompany = new Select(driver.findElement(country));
        drpCompany.selectByValue(countryname);
    }




    //use Elements by making their functions
    public static void clickSignUp (WebDriver driver) throws Exception
    {
    	driver.findElement(signup).click();
    }
    public static void provideEmail (WebDriver driver,String email ) throws Exception
    {
    	driver.findElement(emailaddress).sendKeys(email);
    }
    public static void clickCreateAccount(WebDriver driver) throws Exception
    {
    	driver.findElement(createaccount).click();
    }

    public static void chooseTitle (WebDriver driver) throws Exception
    {
        driver.wait(3000);
        driver.findElement(title).click();
    }
    public static void provideFirstName (WebDriver driver,String fname ) throws Exception
    {
    	driver.findElement(firstname).sendKeys(fname);
    }
    public static void provideLastName (WebDriver driver,String lname ) throws Exception
    {
    	driver.findElement(lastname).sendKeys(lname);
    }
    public static void provideRepeatEmail (WebDriver driver , String email) throws Exception
    {
        driver.findElement(repeat_email).sendKeys(email);
    }
    public static void providePass (WebDriver driver, String pass) throws Exception
    {
        driver.findElement(password).sendKeys(pass);
    }
    public static void provideCompany (WebDriver driver, String comp) throws Exception
    {
        driver.findElement(company).sendKeys(comp);
    }
    public static void provideAddress1 (WebDriver driver,String add1 ) throws Exception
    {
    	driver.findElement(address1).sendKeys(add1);
    }
    public static void provideAddress2 (WebDriver driver,String add2 ) throws Exception
    {
        driver.findElement(address2).sendKeys(add2);
    }
    public static void provideCity (WebDriver driver,String cityname ) throws Exception {
        driver.findElement(city).sendKeys(cityname);
    }
    public static void providePostalCode (WebDriver driver,String postal ) throws Exception
    {
    	driver.findElement(postalcode).sendKeys(postal);
    }
    public static void provideAdditionalInformation (WebDriver driver, String info) throws Exception
    {
        driver.findElement(additionalinfor).sendKeys(info);
    }
    public static void providehomenumber (WebDriver driver, String homenumber) throws Exception
    {
        driver.findElement(homephone).sendKeys(homenumber);
    }
    public static void providemobileno (WebDriver driver,String mobilenumber ) throws Exception
    {
    	driver.findElement(mblno).sendKeys(mobilenumber);
    }
    public static void provideaddressalias (WebDriver driver, String addalias) throws Exception
    {
        driver.findElement(addressalias).sendKeys(addalias);
    }
    public static void clickRegister (WebDriver driver) throws Exception
    {
    	driver.findElement(buttonregister).click();
    }


//******************************************************************************************************************************//

    public static By userEmailForLogin = By.xpath("//input[@id='email']");
    public static By userPassForLogin = By.xpath("//input[@id='passwd']");
    public static By buttonSignIn = By.xpath("//p[@class='submit']//span[1]");

    public static By menuWomen = By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]");
    public static By quickViewItem = By.xpath("//li[3]//img[@class='replace-2x img-responsive']");
    public static By increaseQuantity = By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']//span");
    public static By addToCart = By.xpath("//span[contains(text(),'Add to cart')]");
    public static By price =By.xpath("//span[@class='ajax_block_cart_total']");
    public static By proceedToCheckout = By.xpath("//span[contains(text(),'Proceed to checkout')]");
    public static By priceOnSummarySection = By.xpath("//span[@id='total_price']");
    public static By proceedToCheckoutOnSummarySection = By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");
    public static By proceedToCheckoutOnAddressSection = By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]");
    public static By agreeTermsAndConditions = By.xpath("//input[@id='cgv']");
    public static By proceedToCheckoutOnShippingSection=By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]");
    public static By totalPriceOnPaymentPage = By.xpath("//span[@id='total_price']");
    public static By toPayByWire = By.xpath("//a[@class='bankwire']");
    public static By iConfirmMyOrder = By.xpath("//span[contains(text(),'I confirm my order')]");

    public static By profilePage1 = By.xpath("//span[contains(text(),'");
    public static By profilePage2 =By.xpath("')]");
    public static By toHistory = By.xpath("//span[contains(text(),'Order history and details')]");
    public static By priceOnHistory = By.xpath("//span[@class='price']");


    public static void provideEmailForLogin(WebDriver driver, String email) throws Exception
    {
        driver.findElement(userEmailForLogin).sendKeys(email);
    }
    public static void providePassForLogin (WebDriver driver, String pass) throws Exception
    {
        driver.findElement(userPassForLogin).sendKeys(pass);
    }
    public static void clickSignIn (WebDriver driver) throws Exception
    {
        driver.findElement(buttonSignIn).click();
    }

    public static void clickMenuWomen (WebDriver driver) throws Exception
    {
        driver.findElement(menuWomen).click();
    }
    public static void selectQuickViewItem (WebDriver driver) throws Exception
    {
        driver.findElement(quickViewItem).click();
    }
    public static void clickToIncreaseQuantity (WebDriver driver) throws Exception
    {
        driver.findElement(increaseQuantity).click();
    }
    public static void clickAddToCart (WebDriver driver) throws Exception
    {
        driver.findElement(addToCart).click();
    }

    ////////// TO COMPARE PRICES ON ANOTHER PAGES
    public static String getPrice (WebDriver driver) throws Exception
    {
        return driver.findElement(price).getText();
    }
    public static void clickProceedToCheckout (WebDriver driver) throws Exception
    {
        driver.findElement(proceedToCheckout).click();
    }

    //First Time Compare with this value
    public static String getPriceOnSummarySection (WebDriver driver) throws Exception
    {
        String value= driver.findElement(priceOnSummarySection).getText();
        return value;
    }

    public static void clickProceedToCheckoutOnSummarySection (WebDriver driver) throws Exception
    {
        driver.findElement(proceedToCheckoutOnSummarySection).click();
    }
    public static void clickProceedToCheckoutOnAddressSection  (WebDriver driver) throws Exception
    {
        driver.findElement(proceedToCheckoutOnAddressSection).click();
    }
    public static void clickTermsAndConditions (WebDriver driver) throws Exception
    {
        driver.findElement(agreeTermsAndConditions).click();
    }
    public static void clickProceedToCheckoutOnShippingSection (WebDriver driver) throws Exception
    {
        driver.findElement(proceedToCheckoutOnShippingSection).click();
    }

    //Second time compare with this value
    public static String getTotalPriceOnPaymentPage (WebDriver driver) throws Exception
    {
        String value= driver.findElement(totalPriceOnPaymentPage).getText();
        return value;
    }
    public static void clickToPayByWire (WebDriver driver) throws Exception
    {
        driver.findElement(toPayByWire).click();
    }
    public static void clickIConfirmMyOrder (WebDriver driver) throws Exception
    {
        driver.findElement(iConfirmMyOrder).click();
    }

    //for HistoryCheck
    public static void clickProfile (WebDriver driver, String fname, String lname) throws Exception
    {
        driver.findElement(By.xpath(profilePage1 + fname + " " + lname + profilePage2)).click();
    }
    public static void clickToHistory (WebDriver driver) throws Exception
    {
        driver.findElement(toHistory).click();
    }
    public static String getPriceOnHistory (WebDriver driver) throws Exception
    {
        String value = driver.findElement(priceOnHistory).getText();
        return value;
    }

}
