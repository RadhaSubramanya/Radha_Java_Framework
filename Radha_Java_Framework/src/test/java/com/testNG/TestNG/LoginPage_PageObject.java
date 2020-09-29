package com.testNG.TestNG;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage_PageObject 
{
	public static Logger log = Logger.getLogger(LoginPage_PageObject.class);
	public static WebElement userNameTextField(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@id='username']"));
	}
	public static WebElement passwordTextField(WebDriver driver)
	{
		return driver.findElement(By.xpath("//input[@id='password']"));
	}
	public static WebElement signInButton(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[text()='Sign in']"));
	}
}
