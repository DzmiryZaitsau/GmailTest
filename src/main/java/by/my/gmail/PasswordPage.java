package by.my.gmail;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordPage extends LoginPage {
	
	@FindBy(xpath = "//*[@id='password']/div/div/div/input")
	WebElement passwordField;
	
	@FindBy(xpath = "//*[@id='passwordNext']/content/span")
	WebElement submitPasswordButton;
	
	@FindBy(xpath = "//*[@id='password']/div[2]/div[2]")
	WebElement undifined;;

	public PasswordPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public InboxPage goTestMail() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", passwordField);
		passwordField.sendKeys("123_soon");
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", submitPasswordButton);
		return new InboxPage(driver);
	}
	public boolean checkUncorrectPassword() {
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", passwordField);
		passwordField.sendKeys("123_soon123");
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", submitPasswordButton);
		 try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return undifined.getText().contains("Неверный пароль");
	}

}
