package by.my.gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.uncommons.reportng.HTMLReporter;

@Listeners({ HTMLReporter.class })
public class BaseTest {
	protected WebDriver driver;

	@BeforeTest
	public WebDriver startBrowser() {
		System.setProperty("webdriver.chrome.driver", "c://driver1//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	@AfterTest
	public void closeChrom() {
		closeBrowser();
	}

	public WebDriver getDriver() {
		return this.driver;
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}
}
