package pageobjectmodel.adda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resource.Base;

public class LogInPageAdda extends Base{
		

	public WebElement userNameTextBoxLogIn(WebDriver driver) { 
		return driver.findElement(By.xpath("(//input[@type=\"email\"])[1]"));
	}
	

	public WebElement passwordTextBoxLogIn(WebDriver driver) { 
		return driver.findElement(By.cssSelector("input[name='log_password']"));
	}
	
	public WebElement submitButtonLogIn(WebDriver driver) { 
		return driver.findElement(By.name("login_button"));
	}
	
	public WebElement forgetPasswordLinkLogIn(WebDriver driver) { 
		return driver.findElement(By.id("reset_form"));
	}
	
	public WebElement registerLinkLogIn(WebDriver driver) { 
		return driver.findElement(By.xpath("//a[contains(text(),'Need an account?')]"));
	}
}
