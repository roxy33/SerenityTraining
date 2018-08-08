package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import jar.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

@Narrative(title = "Login Test", text = { "Login Test" })

@RunWith(SerenityRunner.class)
@DefaultUrl(value = utils.Constants.BASE_URL)

public class LoginTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	@ManagedPages(defaultUrl = utils.Constants.BASE_URL + "/customer/account/login/")
	public Pages pages;
	@Steps
	LoginSteps loginSteps;

	@Test
	public void loginTest() {
		webdriver.manage().window().maximize();
		//loginSteps.openPage();
		webdriver.get(utils.Constants.BASE_URL + "/customer/account/login/");
		loginSteps.performLogin(utils.Constants.TEST_USER_NAME, utils.Constants.TEST_USER_PASSWORD);
		
		 assert(loginSteps.verifyIfDashboardDisplayed("My dashboard".toUpperCase()));
	}
	
}
