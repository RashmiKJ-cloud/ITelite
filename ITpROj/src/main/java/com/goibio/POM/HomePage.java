package com.goibio.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.goibibo.generic.WebDriverUtiles;

public class HomePage  extends WebDriverUtiles {

	@FindBy(xpath="//span[@id='roundTrip']")
	public WebElement roundTrip;
	@FindBy(xpath="//input[@id='gosuggest_inputSrc']")
	private WebElement FromBtn;
	
	
	
	@FindBy(xpath="//input[@value='Bengaluru (BLR)']")
	private WebElement Fromsend;

	
	@FindBy(xpath="//input[@id='gosuggest_inputDest']")
	private WebElement DestnSend;
	
	@FindBy(xpath="//input[@value='Pune (PNQ)']")
	private WebElement DestinationAdd;
	
	@FindBy(xpath="//input[@id='departureCalendar']")
	private WebElement Depart;
	
	@FindBy(xpath="//div[@aria-label='Wed May 05 2021']")
	private WebElement Departsend;

	@FindBy(xpath="	//span[@aria-label='Next Month']")
	private WebElement  NextArro;

	@FindBy(xpath="	//input[@id='returnCalendar']")
	private WebElement  Return;
	
	@FindBy(xpath="//div[@aria-label='Sat May 08 2021']")
	private WebElement Returnsend;
	
	@FindBy(xpath="//span[@class='blueGrey textOverflow']")
	private WebElement Economy;
	
	@FindBy(xpath="//option[.='Business']")
	private WebElement EconomyDrop;
	
	@FindBy(xpath="	//button[.='SEARCH']")
	private WebElement SearchBtn;

	 public WebElement getNextArro() {
		return NextArro;
	}


	public HomePage (WebDriver StaticDriver) {          
			PageFactory.initElements(StaticDriver, this);
		}

	 
	public WebElement getRoundTrip() {
		return roundTrip;
	}


	public WebElement getFromBtn() {
		return FromBtn;
	}
	
	public void FromButton(String FromLocation) {
		 FromBtn.sendKeys(FromLocation);
		 }
	public void  FromPoint(WebDriver staticDriver,String from) {
	waitforElementToBeClickable(staticDriver,   FromBtn);
		
	 FromBtn.sendKeys(from);
	}


	public WebElement getFromsend() {
		return Fromsend;
	}


	public WebElement getDestnSend() {
		return DestnSend;
	}

	public void  DestnationPoint(WebDriver staticDriver,String destnation) {
		waitforElementToBeClickable(staticDriver,   DestnSend);
			
		DestnSend.sendKeys(destnation);
		}


	public WebElement getDestinationAdd() {
		return DestinationAdd;
	}


	public WebElement getDepart() {
		return Depart;
	}


	public WebElement getDepartsend() {
		return Departsend;
	}
	
	public WebElement getReturnsend() {
		return Returnsend;
	}


	public void alert(WebDriver staticDriver) {
		staticDriver.switchTo().alert();
		
		Departsend.click();
	}


	public WebElement getReturn() {
		return Return;
	}
	
	public void alert1(WebDriver staticDriver) {
		staticDriver.switchTo().alert();
		Returnsend.click();
	}


	public WebElement getEconomy() {
		return Economy;
	}


	public WebElement getEconomyDrop() {
		return EconomyDrop;
	}
	
	public void Dropdown(WebElement EconomyDropt) {
		select(EconomyDropt, 1);
	}


	public void getSearchBtn(WebDriver staticDriver) {
		waitforElementToBeClickable(staticDriver, SearchBtn);
		SearchBtn.click();
	}
	
	
	
}
