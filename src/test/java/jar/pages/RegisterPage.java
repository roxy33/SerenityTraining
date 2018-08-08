package jar.pages;

import utils.Constants;

	import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
	import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(utils.Constants.BASE_URL + "/customer/account/create/")
	
public class RegisterPage extends PageObject {		
	
	    @FindBy(css = "#firstname")
	    private WebElementFacade firstNameField;
	    @FindBy(css = "#lastname")
	    private WebElementFacade lastNameField;
	    @FindBy(css = "#email_address")
	    private WebElementFacade emailField;
	    @FindBy(css = "#password")
	    private WebElementFacade passwordField;
	    @FindBy(css = "#confirmation")
	    private WebElementFacade confirmationField;
	    @FindBy(css = ".buttons-set button")
	    private WebElementFacade registerButton;

	    public void setFirstNameField(String firstName) {
	        firstNameField.sendKeys(firstName);
	        
	    }

	    public void setLastNameField(String lastName) {
	    	lastNameField.sendKeys(lastName);
	    }

	    public void setEmailField(String email) {
	    	emailField.sendKeys(email);
	    }

	    public void setPasswordField(String password) {
	    	passwordField.sendKeys(password);
	    }

	    public void setConfirmationField(String confirmation) {
	    	confirmationField.sendKeys(confirmation);
	    }

	    public void register(){
	        registerButton.click();
	    }
}

