package tests;

import jar.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import constants.Constants;

public class BaseTest {
    @Managed(uniqueSession = true)
    
    public WebDriver webdriver;
    
    @Steps
    private LoginSteps loginSteps;

    @Before
    public void before() {
        webdriver.manage().window().maximize();
        webdriver.get(utils.Constants.BASE_URL);
        loginSteps.performLogin(utils.Constants.TEST_USER_NAME, utils.Constants.TEST_USER_PASSWORD);
    }
}
