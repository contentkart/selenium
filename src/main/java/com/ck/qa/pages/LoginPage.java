package com.ck.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ck.qa.base.TestBase;

public class LoginPage extends TestBase{
	// //a[@id="tdb3"]/span[@class="ui-button-text"]
	
	@FindBy(xpath="//*[@id='myNavbar']/ul/li[6]/a")
	
	WebElement login;
	
	@FindBy(name="login_email")

    WebElement username;
	
	@FindBy(name="login_password")

    WebElement password;
	
	@FindBy(name="submit")
	
    WebElement loginBtn;


	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	

	
	public Dashboard login(String un, String pwd){
		
		login.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
	
		return new Dashboard();
	}
	public String validateLoginPageTitle() {
		// TODO Auto-generated method stub
		
		return driver.getTitle();
		
		}
}
