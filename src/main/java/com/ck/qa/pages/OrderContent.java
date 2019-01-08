package com.ck.qa.pages;

import java.util.concurrent.TimeUnit;

import javax.sql.rowset.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ck.qa.base.TestBase;

public class OrderContent extends TestBase {

	public OrderContent() {
		PageFactory.initElements(driver, this);
	}

	public void orderpagetitle() {
		WebElement orderpagetitle = driver.findElement(By.xpath("//div[@class=\"title_reg text-center\"]"));
		String title = orderpagetitle.getText();
		System.out.println(title);

	}
	// adding this line

	public void fillform(String projecttitle, String contenttype, String servicetype, String rating, String category,
			String subcat, String length, String language, String writertone, String noofarticles, String Keywords,
			String writingsy) throws InterruptedException {

		driver.findElement(By.id("title")).sendKeys(projecttitle);
		Select selectcontenttype = new Select(driver.findElement(By.id("content_type_id")));
		selectcontenttype.selectByVisibleText(contenttype);

		Select selectservice = new Select(driver.findElement(By.id("type")));
		selectservice.selectByVisibleText(servicetype);

		Thread.sleep(3000);
		Select selectrating = new Select(driver.findElement(By.id("submitTo")));
		selectrating.selectByVisibleText(rating);

		Select selectcategory = new Select(driver.findElement(By.id("category")));
		selectcategory.selectByVisibleText(category);

		Select selectsubcategory = new Select(driver.findElement(By.id("subcategory")));
		selectsubcategory.selectByVisibleText(subcat);

		Select selectlength = new Select(driver.findElement(By.id("articleLengthSelect")));
		selectlength.selectByVisibleText(length);

		Select selectlang = new Select(driver.findElement(By.id("articleLanguage")));
		selectlang.selectByVisibleText(language);

		Select selectwritingtone = new Select(driver.findElement(By.id("writing_tone")));
		selectwritingtone.selectByVisibleText(writertone);

		WebElement noof = driver.findElement(By.id("total_no_projects"));
		noof.sendKeys(noofarticles);

		driver.findElement(By.xpath("//*[@id=\"project_request_form\"]/div[26]/div/label\r\n")).click();

		driver.findElement(By.xpath("//*[@id=\"keywords[1]\"]")).sendKeys(Keywords);

		Select selectwritingsy = new Select(driver.findElement(By.id("writingStyle")));
		selectwritingsy.selectByVisibleText(writingsy);

		// WebElement radioBtn =
		// driver.findElement(By.xpath("//*[@id=\"project_request_form\"]/div[45]/div[1]/label"));

		// radioBtn.click();
		WebElement radioBtn = driver.findElement(By.cssSelector("#terms_condition"));

		radioBtn.click();

		// driver.findElement(By.xpath("//*[@id=\"project_request_form\"]/div[45]/div[1]/label")).click();

		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// js.executeScript("document.getElementsByName('terms_condition').click();");
	}

}
