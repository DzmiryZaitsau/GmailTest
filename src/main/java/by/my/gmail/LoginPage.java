package by.my.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends MainPageGoogle  {

	@FindBy(xpath = "//*[@id='identifierId']")
	WebElement loginField;
	
	@FindBy(xpath = "//div[@id='identifierNext']/content/span")
	WebElement submitLoginButton;
	
	@FindBy(xpath = "//*[@id='view_container']/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]")
	WebElement loginMessage;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public PasswordPage sendLogin() {
		loginField.sendKeys("lepus2017test@gmail.com");
		submitLoginButton.click();
		return new PasswordPage(driver);
	}
	
	
	public boolean uncorrectLogins() {
		loginField.sendKeys("user@gmail.cghtgdejghfh");
		submitLoginButton.click();
		return loginMessage.getText().contains("Не удалось найти аккаунт Google");
	}

}
