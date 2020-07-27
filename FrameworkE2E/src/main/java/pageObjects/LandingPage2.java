package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage2 {
	WebDriver driver;
	public LandingPage2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	private By testNG = By.linkText("TestNG");
	public WebElement testNG() {
		return driver.findElement(testNG);
	}
	
	private By selenium = By.linkText("Selenium Java");
	public WebElement seleniumJava() {
		return driver.findElement(selenium);
	}
	
	private By seleniumTitle = By.className("im-title");
	public WebElement seleniumTitle() {
		return driver.findElement(seleniumTitle);
		
	}
}
