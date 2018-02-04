package by.my.gmail;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NegativeTest extends BaseTest {
	private LoginPage loginPage;
	private PasswordPage passwordPage;
	
	@BeforeMethod
	public void navigate() {
		MainPageGoogle mainPageGoogle = new MainPageGoogle(driver);
		Object handles[] = driver.getWindowHandles().toArray();
		driver.switchTo().window(handles[1].toString());
		mainPageGoogle.navigate(MainPageGoogle.URL);
		loginPage = mainPageGoogle.goGmail();
	}
	
	@Test
	public void uncorrectLogin() {
		assertEquals(loginPage.uncorrectLogins(), true);
	}
	
	@Test
	public void checkUncorrectPassword() {
		passwordPage = loginPage.sendLogin();
		assertEquals(passwordPage.checkUncorrectPassword(), true);
	}

}
