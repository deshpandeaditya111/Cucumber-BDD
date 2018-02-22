package stepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import managers.PageObjectManager;
import pageObjects.LoginPageObjects;
import utility.Constant;

public class Test_Steps {
	public static PageObjectManager pageObjectManager;
	public static LoginPageObjects loginPageObj;

	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",Constant.DriverPath);
	    driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.URL);
		}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		pageObjectManager = new PageObjectManager(driver);
		loginPageObj = pageObjectManager.getLoginPageObjects();
		loginPageObj= new LoginPageObjects(driver);
		loginPageObj.click_MyAccount();
		//driver.findElement(By.xpath(Constant.LogIn_Btn_Xpath)).click();
		}

	@When("^User enters Credentials to LogIn$")
	public void user_enters_testuser_and_Test(List<Credentials>  usercredentials) throws Throwable {
		for (Credentials credentials : usercredentials) 
		{	
			loginPageObj.enter_Username(credentials.getUsername());
			loginPageObj.enter_Password(credentials.getPassword());
			loginPageObj.click_Signin();
		}		
	}
	
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}

	@When("^User Logout from the Application$")
	public void user_Logout_from_the_Application() throws Throwable {
		loginPageObj.click_LogoutButton(driver);
	
	}
	@Then("^Message displayed Logout Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
		System.out.println("Logut Successfully");
		driver.close();
	    
	}
	

}