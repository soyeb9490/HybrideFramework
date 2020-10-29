package resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Base {	
	
	static WebDriver driver;
	static String url = "https://www.facebook.com/";  
	static String browser = "firefox";
	
	@Test 
	public static void run() {
		if(browser.equals("chrome")) {
			openChromeBrowser();
			navigatePage(url);
			closeBrowser();
		}
		else if(browser.equals("firefox")) {
			openFireFoxBrowser();
			navigatePage(url);
			closeBrowser();
		}

	}
	
	
	public static void openChromeBrowser(){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Browser/chromedriver");
		
		driver = new ChromeDriver();
	}

	
	public static void openFireFoxBrowser(){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/Browser/geckodriver");
		
		driver = new FirefoxDriver();
	}
	
	public static void navigatePage(String url){
		driver.get(url);
	}

	public static void closeBrowser(){
		driver.close();
	}
	
	public static void quitBrowser(){
		driver.quit();
	}
	
	
}
