package com.goibio.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//button[@class='lsPop__cta']")
	private WebElement Login;
	
	@FindBy(xpath="//input[@class='loginCont__input']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@class='loginCont__btn ']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//span[@class='gr-font12 gr-helveticaBold btn-hyperlink']")
	private WebElement LoginUsingpwdBtn;
	
	@FindBy(xpath="	//input[@class='loginCont__inputPassword']")
	private WebElement Password;
	@FindBy(xpath="//input[@class='loginCont__btn disabled']")
	private WebElement LoginBtn;

	
	 public LoginPage(WebDriver driver) {          
			PageFactory.initElements(driver, this);
		}

public WebElement getLogin() {
		return Login;
	}
public WebElement getUsername() {
		return Username;
	}
public WebElement getContinueBtn() {
		return continueBtn;
	}
public void setContinueBtn(WebElement continueBtn) {
		this.continueBtn = continueBtn;
	}


	public WebElement getLoginUsingpwdBtn() {
		return LoginUsingpwdBtn;
	}


	public void setLoginUsingpwdBtn(WebElement loginUsingpwdBtn) {
		LoginUsingpwdBtn = loginUsingpwdBtn;
	}


	public WebElement getPassword() {
		return Password;
	}
public WebElement getLoginBtn() {
		return LoginBtn;
	}


	
	 
	 
}
