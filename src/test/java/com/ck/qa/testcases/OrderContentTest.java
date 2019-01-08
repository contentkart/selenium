package com.ck.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ck.qa.base.TestBase;
import com.ck.qa.pages.Dashboard;
import com.ck.qa.pages.LoginPage;
import com.ck.qa.pages.OrderContent;
import com.ck.qa.util.TestUtil;

public class OrderContentTest extends TestBase {
	 LoginPage loginPage;
		Dashboard homePage;
		TestUtil testUtil;
		String sheetname="ckorder";
		
		 OrderContent ordercontent;
		public OrderContentTest() {
			super();
		}
		
		@BeforeMethod
		public void setUP() {
			initialization();
			loginPage=new LoginPage();
			homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			ordercontent=homePage.order();
			
		}
		@DataProvider
		public Object[][] getCkTestData() {
			Object data[][]=TestUtil.getTestData(sheetname);
			return data;
		}
		
	
		@Test(dataProvider="getCkTestData")
		public void testformfill(String projecttitle,String contenttype,String servicetype,String rating,String category,String subcat,String length,String language,String writertone,String noofarticles,String Keywords,String writingsy) throws InterruptedException
		{
			
			
			ordercontent.fillform(projecttitle, contenttype, servicetype, rating, category, subcat, length, language, writertone, noofarticles, Keywords, writingsy);
			
		
		}
		
		
}
