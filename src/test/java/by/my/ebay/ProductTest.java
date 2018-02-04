package by.my.ebay;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ProductTest extends BaseTest {
	Product product = new Product(driver);
	
	
	@BeforeMethod
	public void navigate() {
		MainPageEbay mainPageEbay = new MainPageEbay(driver);
		
		Object handles[] = driver.getWindowHandles().toArray();
		driver.switchTo().window(handles[1].toString());
		
		mainPageEbay.navigate(MainPageEbay.URL);
		product = mainPageEbay.searchGuitars();
	}
	
	@AfterMethod
	public void clear() {
		
		
	}
	
	@Test
	public void getPriceGuitare() {
		System.out.print("The Price of first guitare is " + product.getPriceGuitare());
	}
	

}
