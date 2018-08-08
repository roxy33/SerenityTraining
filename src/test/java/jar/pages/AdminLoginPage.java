package jar.pages;

import utils.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(utils.Constants.BASE_URL + "index.php/admin/dashboard/index/key/2bf407779c786c083173da55572e0e69/")

public class AdminLoginPage extends PageObject {

    @FindBy(css = "#username")
    private WebElementFacade usernameField;
    @FindBy(css = "#login")
    private WebElementFacade passwordField;
    @FindBy(css = ".form-button")
    private WebElementFacade loginButton;

    public void setUsernameField(String user) {
    	usernameField.sendKeys(user);
    }

    public void setPasswordField(String pass) {
    	passwordField.sendKeys(pass);
    }

    public void login(){
        evaluateJavascript("jQuery.noConflict();");
        loginButton.click();
    }
}
