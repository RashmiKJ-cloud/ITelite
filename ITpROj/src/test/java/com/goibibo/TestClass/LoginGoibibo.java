package com.goibibo.TestClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import com.goibibo.generic.BaseClass;
import com.goibio.POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginGoibibo extends BaseClass{
	@Test
	public void LOgonGoibiba() throws Throwable {
		String UN = elib.getExcelData("Sheet1", 1, 0)+ jLib.generateRandomNum();
		String PWD= elib.getExcelData("Sheet1", 1, 1)+ jLib.generateRandomNum();
		 
		 
	LoginPage LP=new LoginPage(staticDriver);
	LP.getLogin().click();
LP.getUsername().sendKeys(UN);
	LP.getContinueBtn().click();
	LP.getLoginUsingpwdBtn().click();
	LP.getPassword().sendKeys(PWD);
	LP.getLoginBtn();

	}}

