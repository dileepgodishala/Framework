package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LandingPage2;
import resources.BaseClass;

public class HomePage2 extends BaseClass{
	WebDriver driver;
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeBrowser();
	}
	@Test(dataProvider = "getData")
	public void basePageNaviGationSelenium(String name) throws IOException {
		driver.get(properties.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.input().sendKeys(name);
		lp.submit().click();
		LandingPage2 lp2 = new LandingPage2(driver);
		lp2.testNG().click();
		Assert.assertEquals(lp2.seleniumTitle().getText(), "TestNG");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][1];
		data[0][0] = "selenium";
		data[1][0] = "testNG";
		return data;
	}
}
