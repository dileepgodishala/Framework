package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By input = By.id("query");
	public WebElement input() {
		return driver.findElement(input);
	}
	
	private By submit = By.xpath("//input[@class='button']");
	public WebElement submit() {
		return driver.findElement(submit);
	}
}
