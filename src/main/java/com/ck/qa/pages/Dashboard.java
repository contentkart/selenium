package com.ck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ck.qa.base.TestBase;

public class Dashboard extends TestBase {

	
	@FindBy(xpath="//*[@id=\"myNavbar\"]/ul/li[7]/a/span[1]")

    WebElement name;
	
	@FindBy(xpath="//*[@id=\"myNavbar1\"]/ul/li[3]/a")
	WebElement order;
	

	
	public Dashboard(){
		PageFactory.initElements(driver, this);
	}
	
	public OrderContent order(){
	order.click();
	return new OrderContent();
		
	} 

	public String validatepagetitle() {
		return driver.getTitle();
	}
	
	
	
}
