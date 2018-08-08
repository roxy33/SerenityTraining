package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import entity.User;
import factory.Factory;
import jar.steps.serenity.RegisterSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;

@Narrative(title = "Register New User Test", text = { "Register New User Test" })

@RunWith(SerenityRunner.class)

public class RegisterTest  {

	// private String firstName = "Andreea", lastName = "Maier" , email =
	// "andreea.7@gmail.com";
	// private String password = "parola";
	
	@Managed(uniqueSession = true)
	WebDriver driver;
	
	User user = null;
	
	@Steps
	RegisterSteps registerSteps;

	@Test
	public void createAccount() {
		driver.get(utils.Constants.BASE_URL + "/customer/account/create/");
		//registerSteps.openRegisterPage();
		// TODO click on register
		user = Factory.generateUser();
		registerSteps.enterUserDetails();
		
	}
}
