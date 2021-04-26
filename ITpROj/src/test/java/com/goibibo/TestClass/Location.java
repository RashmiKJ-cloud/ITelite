package com.goibibo.TestClass;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.goibibo.generic.BaseClass;
import com.goibio.POM.HomePage;

public class Location extends BaseClass{
	
	@Test
	public void FromToLoc() throws Throwable {
		String FROM = elib.getExcelData("Sheet1", 4, 0)+ jLib.generateRandomNum();
		String TO= elib.getExcelData("Sheet1", 4, 1)+ jLib.generateRandomNum();
		
		HomePage hp=new HomePage(staticDriver);
		hp.getRoundTrip().click();
		hp.FromPoint(staticDriver,FROM);
		//hp.getFromsend().click();
		hp.DestnationPoint(staticDriver, TO);
		//hp.getDestinationAdd().click();
		hp.getDepart().click();
		hp.getNextArro().click();
		//hp.getFromsend().click();
	hp.getDepartsend().click();
	//	Thread.sleep(5000);
	    hp.getReturn().click();
		hp.getReturnsend().click();
		hp.getEconomy().click();
		hp.getEconomyDrop().click();
		hp.getSearchBtn(staticDriver);
		
		
	}
}
