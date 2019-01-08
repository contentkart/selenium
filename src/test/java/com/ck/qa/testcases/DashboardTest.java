package com.ck.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ck.qa.base.TestBase;
import com.ck.qa.pages.OrderContent;
import com.ck.qa.pages.Dashboard;
import com.ck.qa.pages.LoginPage;

public class DashboardTest extends TestBase {
	 LoginPage loginPage;
	Dashboard dashboardPage;
	
	 OrderContent ordercontent;
	public DashboardTest() {
		super();
	}
	
	@BeforeMethod
	public void setUP() {
		initialization();
		loginPage=new LoginPage();
		dashboardPage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void ClickOnOrderTest(){
    
		ordercontent=dashboardPage.order();
   
		String orderTitle=dashboardPage.validatepagetitle();
		
		Assert.assertEquals(orderTitle, "Buy Unique Articles for Website & Blog – Articles Writing Services - Content-Kart");
	}
	@Test(priority=1)
	public void DashboardtitleTest()
	{
		 String dashboardTitle=dashboardPage.validatepagetitle();
			
			Assert.assertEquals(dashboardTitle, "Dashboard - Content-Kart");
	//Assert.assertEquals(hometitle, "Dashboard - Content-Kart","home page title not found");
	}

	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();

	}
}
