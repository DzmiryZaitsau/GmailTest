package by.my.ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product extends MainPageEbay {

	@FindBy(xpath = "//ul[@id='ListViewInner']/li[1]/ul[1]/li[1]/span[1]")
	WebElement firstGuitare;
	
	@FindBy(xpath = "//input[@id='gh-btn']")
	WebElement searchButton;

	public Product(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		}
	
	public String getPriceGuitare() {
		String price = null;
		price = firstGuitare.getText();
		return price;
		
	}
	
	

}
