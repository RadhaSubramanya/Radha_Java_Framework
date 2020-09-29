package com.testNG.TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{
	public static Logger log = Logger.getLogger(LoginPage.class);
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream fis;
	
public static void main(String []args) throws IOException
{
	prop = new Properties();
	fis = new FileInputStream("E:\\NEW Drive E Data\\New Radha Workspace Dec 2019\\Project\\Radha_Java_Framework\\Config.properties");
	prop.load(fis);
	log.info("Config property file is loaded");
	System.setProperty("webdriver.chrome.driver", 
			"E:\\NEW Drive E Data\\New Radha Workspace Dec 2019\\Project\\Radha_Java_Framework\\src\\resources\\drivers\\chromedriver_win32.zip");
	driver= new ChromeDriver();
	log.info("Chrome driver instance is created and browser is launched");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	log.info("Waiting for page load");
	driver.manage().window().maximize();
	log.info("Window maximized");
	driver.get(prop.getProperty("URL"));
	log.debug("Entered URL from property file");
	LoginPage_PageObject.userNameTextField(driver).sendKeys(prop.getProperty("UserName"));
	log.debug("Username entered");
	LoginPage_PageObject.passwordTextField(driver).sendKeys(prop.getProperty("Password"));
	log.debug("password entered");
	LoginPage_PageObject.signInButton(driver).click();
	log.debug("Signin button clicked");
}

}
