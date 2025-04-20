package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.BaseClass;

public class LoginTest extends BaseClass {
	
	@Test
	public void validLogintest() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("Anjumansheikh132@gmail.com", "Anjuman$132");
		
	}
	
	

}
