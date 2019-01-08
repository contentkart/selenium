package com.ck.qa.testcases;
import com.ck.qa.pages.LoginPage;
import com.ck.qa.util.TestUtil;
import com.ck.qa.pages.Dashboard;


import java.util.Properties;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ck.qa.base.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	//Properties prop;
	Dashboard homePage;
	String sheetname="login";
String loc=	"C:\\selenium project\\TestProject\\ContentkartTest\\src\\main\\java\\com\\ck\\qa\\testdata\\CKtestdata.xlsx";
	public LoginPageTest() {
		super();
	}

	
	@BeforeMethod
	public void setUP() {
		initialization();
		loginPage=new LoginPage();
	}
	

@DataProvider
public Object[][] getLoginTestData() {
	Object data[][]=TestUtil.getTestData(sheetname);
	return data;
}

@Test(dataProvider="getLoginTestData")
public void loginTest(String username, String password){
	try {
		homePage = loginPage.login(username, password);
        driver.navigate().refresh();
        
        String title = loginPage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Dashboard - Content-Kart");
	}
	catch (Exception e)
	{
        e.printStackTrace();
	}
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
