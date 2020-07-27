package stepDefenition;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resources.BaseClass;

public class StepDefenition extends BaseClass{
	@Given("^Initialize Chrome Browser$")
	public void initialize_Chrome_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver = initializeBrowser();
	}

	@Given("^navigate to maven site$")
	public void navigate_to_maven_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^selenium is entered in input file and clicked on submit$")
	public void selenium_is_entered_in_input_file_and_clicked_on_submit() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^Selenium Maven dependency should be opened$")
	public void selenium_Maven_dependency_should_be_opened() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^Clicked on selenium java$")
	public void clicked_on_selenium_java() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^Selenium title is displayed$")
	public void selenium_title_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
