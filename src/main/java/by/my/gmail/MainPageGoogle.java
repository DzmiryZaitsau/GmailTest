package by.my.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPageGoogle extends BasePage{
	public static final String URL = "https://www.google.com/intl/ru/gmail/about/";
	
	@FindBy(xpath = "html/body/nav/div/a[2]")
	WebElement entryGmailButton;

	public MainPageGoogle(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		}
	public MainPageGoogle navigate(String url) {
		driver.get(url);
		return new MainPageGoogle(driver);
	}

		
	public LoginPage goGmail() {
		entryGmailButton.click();
		return new LoginPage(driver);
		
	}

}
