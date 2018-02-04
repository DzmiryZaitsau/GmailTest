package by.my.gmail;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PositiveLoginTest extends BaseTest {
	private InboxPage inboxPage;
	private LoginPage loginPage;
	private PasswordPage passwordPage;

	@BeforeMethod
	public void navigate() {
		MainPageGoogle mainPageGoogle = new MainPageGoogle(driver);
		Object handles[] = driver.getWindowHandles().toArray();
		driver.switchTo().window(handles[1].toString());
		mainPageGoogle.navigate(MainPageGoogle.URL);
		loginPage = mainPageGoogle.goGmail();
		passwordPage = loginPage.sendLogin();
		inboxPage = passwordPage.goTestMail();
	}

	@Test
	public void confirmAccount() {
		assertEquals(inboxPage.confirmAccount(), true);
	}

}
