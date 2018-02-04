package by.my.gmail;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxPage extends PasswordPage {

	public InboxPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@id='gb']/div[2]/div[1]/div[2]/div[5]/div[1]/a[1]")
	WebElement account;
	
	public boolean confirmAccount() {
		return (account.getAttribute("title")).contains("lepus2017test@gmail.com");
	}

}