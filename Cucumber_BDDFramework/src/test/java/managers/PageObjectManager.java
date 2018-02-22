package managers;



import org.openqa.selenium.WebDriver;

import pageObjects.LoginPageObjects;

public class PageObjectManager {

	private WebDriver driver;

	private LoginPageObjects loginPageObjects;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;

	}
	
	public LoginPageObjects getLoginPageObjects(){

		return (loginPageObjects == null) ? loginPageObjects = new LoginPageObjects(driver) : loginPageObjects;

	}
}