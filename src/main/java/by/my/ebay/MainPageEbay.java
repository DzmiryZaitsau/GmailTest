package by.my.ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPageEbay extends BasePage{
public static final String URL = "https://www.ebay.com/";
	
	@FindBy(xpath = "//input[@id='gh-ac']")
	WebElement searchField;
	
	@FindBy(xpath = "//input[@id='gh-btn']")
	WebElement searchButton;

	public MainPageEbay(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		}
	
	public MainPageEbay navigate(String url) {
		driver.get(url);
		return new MainPageEbay(driver);
	}
		
	public Product searchGuitars() {
		searchField.sendKeys("Electric Guitar");
		searchButton.click();
		return new Product(driver);
		
	}
	

}


