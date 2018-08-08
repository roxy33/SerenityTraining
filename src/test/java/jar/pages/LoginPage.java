package jar.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;

//@DefaultUrl(Constants.BASE_URL + "/customer/account/login/")

public class LoginPage extends PageObject {

	@FindBy(id = "email")
	private WebElement emailField;
	@FindBy(id = "pass")
	private WebElement passwordField;
	@FindBy(css = "button[title='Login']")
	private WebElement signInButton;
	@FindBy(css = ".page-title > h1")
	private WebElement myDashboard;

	public void signIn(String username, String password) {
        emailField.sendKeys(username);
        passwordField.sendKeys(password);
        signInButton.click();
    }
	
	public boolean isDashboardDisplayed(String dashboard) {

		try {

			if (myDashboard.isDisplayed())
				return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
}