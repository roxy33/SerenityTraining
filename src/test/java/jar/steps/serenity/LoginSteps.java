package jar.steps.serenity;

import org.openqa.selenium.WebDriver;
import constants.Constants;
import jar.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
	private LoginPage loginPage;

	private String url = Constants.BASE_URL + "customer/account/";

	public WebDriver webdriver;

	@Step
	public void openPage() {
		webdriver.get(url);
	}

	@Step
	public void performLogin(String username, String password) {
		System.out.println(username, password);
		loginPage.signIn(username, password);
	}

	@Step
	public boolean verifyIfDashboardDisplayed(String dashboardName) {
		return loginPage.isDashboardDisplayed(dashboardName);
	}

	/*
	@Step
	public void clickLogout() {
		headerPage.clickOnAccountDropdown();
		headerPage.clickOnLogout();
	}
	*/
}