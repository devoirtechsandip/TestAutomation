package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverProvider {

    public static WebDriver createDriver()
    {
       
        System.setProperty("webdriver.chrome.driver",Constants.DRIVERPATH);  
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

}

//flow of the code
//Driver
//Constant
//Ui element
//Flow wrapper
//Last main class
