package tests;

import jar.steps.serenity.AdminSteps;
import jar.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import utils.Constants;
import utils.FieldGenerator;

@Narrative(title = "Admin Magento Test", text = { "Admin test" })

@RunWith(SerenityRunner.class)
//@DefaultUrl(value = constants.Constants.BASE_URL)

public class AdminTest {

    //private String adminUser = "admin", adminPassword = "parola11", categoryName = "Altele";

	@Managed(uniqueSession = true)
	WebDriver driver;
	
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private AdminSteps adminSteps;

    //login and add a new category
    @Test
    public void addNewCategoryFromAdmin() throws InterruptedException {
    	adminSteps.loginInAdmin(utils.Constants.ADMIN_USERNAME, utils.Constants.ADMIN_PASSWORD);
        adminSteps.addNewCategory("CustomCategory" + FieldGenerator.generateRandom(10, 100));
        //TODO assert(The category has been saved.);
        
        
        //loginSteps.logoutFromAdmin();
    }
    
  //login -> add a new category -> delete the category
    /*
    @Test
    public void deleteCategoryFromAdmin() throws InterruptedException {
    	adminSteps.loginInAdmin(utils.Constants.ADMIN_USERNAME, utils.Constants.ADMIN_PASSWORD);
        adminSteps.addNewCategory("CustomCategory" + FieldGenerator.generateRandom(10, 100));
        //TODO assert(The category has been saved.);
        //TODO adminSteps.deleteCategory("CustomCategory" + FieldGenerator.generateRandom(10, 100));
        
        //loginSteps.logoutFromAdmin();
    }
	*/
//    @Test
//    public void logoutFromAdmin() throws InterruptedException {
//        loginSteps.loginInAdmin(adminUser,adminPassword);
//        adminSteps.closePopUp();
//        loginSteps.logoutFromAdmin();
//    }
    
}
