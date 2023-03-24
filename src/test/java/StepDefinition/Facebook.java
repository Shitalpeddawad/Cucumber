package StepDefinition;

import BaseLayerPackage.BaseClass;
import PageLayerPackage.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebook extends BaseClass
{
	@Given("user is on Register Page")
	public void user_is_on_register_page() 
	{
		BaseClass.softTech();
	   
	}
	@When("user enter {string}, {string}, {string} and {string}")
	public void user_enter_and(String fname, String lname, String mob , String pwd) 
	{
        RegistrationPage registerpage =new RegistrationPage();
		
		registerpage.register(fname,lname, mob, pwd);
	}
	@Then("user will be created in system")
	public void user_will_be_created_in_system() throws InterruptedException 
	{
		Thread.sleep(2000);
	    System.out.println(driver.getTitle());
	}
	@Then("enter the date of birth")
	public void enter_the_date_of_birth() 
	{
	   System.out.println(driver.getCurrentUrl());
	}


}
