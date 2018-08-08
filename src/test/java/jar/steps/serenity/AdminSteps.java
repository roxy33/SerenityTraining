package jar.steps.serenity;

import jar.pages.AdminHeaderPage;
import jar.pages.AdminLoginPage;
import net.thucydides.core.annotations.Step;


public class AdminSteps {

    AdminHeaderPage adminHeaderPage;
    AdminLoginPage adminLoginPage;

    @Step
    public void openAdminPage(){
        adminLoginPage.open();
    }


    @Step
    public void loginInAdmin(String user, String pass) throws InterruptedException {
    	System.out.println(user);
    	System.out.println(pass);
        openAdminPage();
        adminLoginPage.setUsernameField(user);
        adminLoginPage.setPasswordField(pass);
        adminLoginPage.login();
        //TimeUnit.SECONDS.sleep(2);
    }

    @Step
    public void closePopUp(){
        adminHeaderPage.setClosePopUp();
    }

    @Step
    public void addNewCategory(String name) {
        closePopUp();
        adminHeaderPage.clickOnCatalog();
        adminHeaderPage.clickOnCategories();
        adminHeaderPage.setCategoryNameField(name);
        adminHeaderPage.clickOnIsActiveDropdown();
        adminHeaderPage.chooseYesIsActive();
        adminHeaderPage.clickOnIncludeDropdown();
        adminHeaderPage.chooseYesInclude();
        adminHeaderPage.submitNewCategory();
        adminHeaderPage.clickOnSystem();
        adminHeaderPage.clickOnCacheManagement();
        adminHeaderPage.setFlushMagentoCache();
    }
    
    @Step
    public void logoutFromAdmin(){
        adminHeaderPage.logout();
    }

}
