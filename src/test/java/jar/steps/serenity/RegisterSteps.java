package jar.steps.serenity;

import utils.Constants;
import entity.User;
import factory.Factory;
import jar.pages.RegisterPage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl(utils.Constants.BASE_URL + "/customer/account/create/")
public class RegisterSteps  {

	private static final long serialVersionUID = 1L;
	private RegisterPage registerPage;

	@Step
	public void openRegisterPage() {
		//this.open();
		
	}

	/*
	@Step
	public void setFields(String firstName, String lastName, String email, String password, String confirmation) {
		registerPage.setFirstNameField(firstName);
		registerPage.setLastNameField(lastName);
		registerPage.setEmailField(email);
		registerPage.setPasswordField(password);
		registerPage.setConfirmationField(confirmation);
		registerPage.register();
	
	*/
	@Step
	public User enterUserDetails() {
		
		User user = Factory.generateUser();
		
		registerPage.setFirstNameField(user.getFirstname());
		registerPage.setLastNameField(user.getLastname());
		registerPage.setEmailField(user.getEmail());
		registerPage.setPasswordField(user.getPassword());
		registerPage.setConfirmationField(user.getPassword());
		registerPage.register();

		return user;
	}
	
	/*
	@Step
	public User enterUserDetails(User user) {
		
		
		registerPage.setFirstNameField(user.getFirstname());
		registerPage.setLastNameField(user.getLastname());
		registerPage.setEmailField(user.getEmail());
		registerPage.setPasswordField(user.getPassword());
		registerPage.setConfirmationField(user.getPassword());
		registerPage.register();

		return user;
	}
	*/
}
