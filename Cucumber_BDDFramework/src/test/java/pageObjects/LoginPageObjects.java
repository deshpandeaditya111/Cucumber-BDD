package pageObjects;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	
	public LoginPageObjects(WebDriver driver) {
	    PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "login_field") 
	private WebElement txtbx_Username;
	
	@FindBy(how = How.ID, using = "password") 
	private WebElement txtbx_Password;
	
	@FindBy(how = How.NAME, using = "commit") 
	private WebElement btn_Signin;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/header/div/div[2]/div/span/div/a[1]") 
	private WebElement btn_LoginMyAccount;
	
	@FindBy(how = How.XPATH, using = "//*[@id='user-links']/li[3]/details/summary/img") 
	private WebElement btn_LogoutMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id='user-links']/li[3]/details/ul/li[9]/form/button") 
	private WebElement btn_Logout;
	
	
	public void click_MyAccount() {
		btn_LoginMyAccount.click();
	}
	public void enter_Username(String name) {
		txtbx_Username.sendKeys(name);
	}
	
	public void enter_Password(String password) {
		txtbx_Password.sendKeys(password);
	}

	public void click_Signin() {
		btn_Signin.click();
	}
	
//	public void click_LogoutMenu() {
//		btn_LogoutMenu.click();
//	}
	
	public void click_LogoutButton(WebDriver driver) throws InterruptedException {
		Actions builder = new Actions(driver);
		builder.moveToElement(btn_LogoutMenu).click().perform();
		TimeUnit.SECONDS.sleep(2);
		btn_Logout.click();  
	}
	
	
}