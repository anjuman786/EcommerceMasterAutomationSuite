package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	//Locators 
	By SingInLink = By.linkText("Sign In");
	By emaiField = By.id("email");
	By passwordField = By.id("pass");
	By singInButton = By.id("send2");
	
	//Actions
	public void clickSignInLink() {
		driver.findElement(SingInLink).click();
	}
	public void enterEmail(String email) {
		driver.findElement(emaiField).sendKeys(email);
		
	}

	public void enterPassword(String password) {
		driver.findElement(passwordField).sendKeys(password);
	}
	public void clickSingInButton() {
		driver.findElement(singInButton).click();
	}
	public void login(String email, String password) {
		clickSignInLink();
		enterEmail(email);
		enterPassword(password);
		clickSingInButton();
	}
}
