package stepDefinition.Adda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjectmodel.adda.LogInPageAdda;
import resource.Base;

public class LogInPage extends LogInPageAdda{

	WebDriver driver;
	
	@Given("^Naviagte This Page \"([^\"]*)\"$")
	public void naviagte_This_Page(String url) throws Throwable {
		driver = Base.openChromeBrowser();
		Base.navigatePage(url);
	}

	@When("^Enter User Name (.*)$")
	public void enter_User_Name_soyeb_gmail_com(String username) throws Throwable {
		userNameTextBoxLogIn(driver).sendKeys(username);
	
	}

	@When("^Enter Password (.*)$")
	public void enter_Password_Dhaka_(String password) throws Throwable {	   
		passwordTextBoxLogIn(driver).sendKeys(password);
	}

	@When("^Click Submit Button$")
	public void click_Submit_Button() throws Throwable {
		submitButtonLogIn(driver).click();
	}

	@Then("^LogIn Successfull!$")
	public void login_Successfull() throws Throwable {
		String ActualValue = driver.getTitle();
		Assert.assertEquals(ActualValue, "FreeLand");
		driver.close();
	
	}
	
	@Then("^LogIn should be Unsuccess!$")
	public void login_should_be_Unsuccess() throws Throwable {
		
		//Grab text that doesn't have html taqs
		String allText = driver.findElement(By.xpath("//form[@method='POST']")).getText();

		String forgetPasswordLinkText = forgetPasswordLinkLogIn(driver).getText();
		String rigisterLinkText = registerLinkLogIn(driver).getText();
		
		allText = allText.replace(forgetPasswordLinkText, "");
		allText = allText.replace(rigisterLinkText, "");
		
		String actualText = allText.trim();
		Assert.assertEquals(actualText, "Email and Password does't mactch!");
		
		driver.close();
		
	}
	

}
