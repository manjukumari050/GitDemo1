package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefination {
	@Given("^User is on netbanking login page$")
	public void User_is_on_netbanking_login_page()
	{
		System.out.println("Given method");
	}
	@When("^User login to application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_to_application_with_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(arg1);
	    System.out.println(arg2);
	}

	@Then("^Home page is populated$")
	public void Home_page_is_populated()
	{
		System.out.println("Then method");
	}
	@And("^Cards are displayed$")
	public void Cards_are_displayed()
	{
		System.out.println("And method");
	}

}
