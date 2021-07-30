package com.qa.stepDefination;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AmazonLogin extends BaseClass {
	LoginPage login;
    HomePage page = new HomePage();
	
	@Given("^User is on sign in page$")
	public void user_is_on_sign_in_page(){
	   BaseClass.intialization();
	}

	@When("^title of the page is amazon$")
	public void title_of_the_page_is_amazon(){
		login=new LoginPage();
		String title= page.getTitle();
		Assert.assertEquals("Amazon Sign In", title);
		
	}

	@Then("^enter username and password$")
	public void enter_username_and_password(){
		  
	      login.AmazonLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^Check if user is navigated to home page$")
	public void check_if_user_is_navigated_to_home_page() {
	
	}

}
