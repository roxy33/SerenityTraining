package tests;

import jar.steps.serenity.CartSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import tests.LoginTest;

@RunWith(SerenityRunner.class)

public class CartTest extends BaseTest {
	@Managed(uniqueSession = true)
	WebDriver driver;
	
	LoginTest loginTest;
	
    @Steps
    private CartSteps cartSteps;

    @Test
    public void testAddToCart()
    {
        //loginTest.loginTest();
    	//cartSteps.login();
        cartSteps.addToCart("AVIATOR SUNGLASSES".toUpperCase());
        assert(cartSteps.checkIfPresent("AVIATOR SUNGLASSES".toUpperCase()));
    }

    @Test
    public void testEmptyCart()
    {
    	//loginTest.loginTest();
    	//cartSteps.login();
        cartSteps.addToCart("AVIATOR SUNGLASSES".toUpperCase());
        assert(cartSteps.emptyCart());
    }
}
