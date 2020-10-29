package stepDefinition.Adda;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resource.Base;

public class landingAddaHomePage extends Base{
	
	public String url;
	
	@Given("^Given URL Link \"([^\"]*)\"$")
	public void given_URL_Link(String url) throws Throwable {		
		Base.openChromeBrowser();
		this.url = url;
	}

	@When("^Navigate this Page$")
	public void navigate_this_Page() throws Throwable {
		Base.navigatePage(url);
	}

	@Then("^Navigate Successfully!$")
	public void navigate_Successfully() throws Throwable {
		Base.closeBrowser();
	}

}
