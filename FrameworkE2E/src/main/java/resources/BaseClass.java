package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	public WebDriver driver;
	public Properties properties;
	public WebDriver initializeBrowser() throws IOException {
		properties = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\FrameworkE2E\\src\\main\\java\\resources\\data.properties");
		properties.load(fis);
		String browserName = properties.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Documents\\Selenium\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			driver = new ChromeDriver(options);
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Documents\\Selenium\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\USER\\Documents\\Selenium\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
}






