package com.company;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.channels.FileLock;

public class MainTest {

    public static void main(String[] args) {
	// write your code here
    }


    @Test
    public static void registerUser()
    {
        try {
            WebDriver webdriver = DriverProvider.createDriver();
            webdriver.get(Constants.URL);
            FlowWrapper.accountCreation_start(webdriver);
            FlowWrapper.accountCreation_fillDetails(webdriver);
        }
        catch(Exception e)
            {
                System.out.println("Following Exception Occurred in register user: " + e);
            }
        finally
            {
                System.out.printf("Register User is done!!!");
            }
    }

    @Test
    public static void loginAndCheckout()
    {
        try
        {
            Boolean flag = false;
            WebDriver webdriver = DriverProvider.createDriver();
            webdriver.get(Constants.URL);
            FlowWrapper.login(webdriver);
            flag = FlowWrapper.buyCheckoutAndVerifyPrice(webdriver);
            Assert.assertTrue(flag, "Checkout Price is same at all the places.");
        }
        catch (Exception e)
        {
            System.out.println("Following Exception Occurred in loginAndCheckout : " + e);
        }
        finally {
            System.out.println("Login and checkout is successful");
        }
    }

    @Test
    public static void loginAndVerifyPriceOnHistory()
    {
        try
        {
            Boolean flag = false;
            WebDriver webdriver = DriverProvider.createDriver();
            webdriver.get(Constants.URL);
            FlowWrapper.login(webdriver);
            flag=FlowWrapper.goToHistoryAndVerifyPrice(webdriver,Constants.FIRSTNAME, Constants.LASTNAME);
            Assert.assertTrue(flag,"Checkout price is same on History Page.");
        }catch(Exception e)
        {
            System.out.println("Following Exception Occurred in loginAndVerifyPriceOnHistory : "+e);
        }
        finally {
            System.out.println("Price verified on History Page");
        }
    }


}
