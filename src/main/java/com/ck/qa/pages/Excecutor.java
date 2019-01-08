package com.ck.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excecutor {

	
	
	@Test
	public void javascriptExecutorClickDemo() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\selenium project\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("http://www.memotome.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("html/body/form/table[2]/tbody/tr/td/font/center[2]/table/tbody/tr/td[3]/table/tbody/tr/td/table/tbody/tr[2]/td/input")).click();
	//Enter username
	driver.findElement(By.xpath("html/body/form/table[3]/tbody/tr/td/p[1]/input")).sendKeys("avinashinviul");
	//Enter password
	driver.findElement(By.xpath("html/body/form/table[3]/tbody/tr/td/p[2]/input")).sendKeys("12345");
	//Click on Login Submit button
	driver.findElement(By.xpath("html/body/form/table[5]/tbody/tr[1]/td[1]/input")).click();
	//Click on Checkbox button
	//Javascript command
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementsByName('DelId').checked=false;");
	Thread.sleep(8000);
	driver.close();
	driver.quit();
}
}