package jar.steps.serenity;

import org.openqa.selenium.WebDriver;
import constants.Constants;
import jar.pages.LoginPage;
import jar.pages.SearchPage;
import jar.pages.SalePage;
import jar.pages.CartPage;
import net.thucydides.core.annotations.Step;

public class CartSteps {
    private CartPage cartPage;
    private SalePage salePage;
    private LoginPage loginPage;

    /*
    @Step
    public void login()
    {
        loginPage.open();
        loginPage.setEmailField("roxana.borhidi@gmail.com");
        loginPage.setPasswordField("donkey32");
        loginPage.clickLogin();
    }
    */
    
    @Step
    public void addToCart(String productName)
    {
    	System.out.println(productName);
        salePage.open();
        salePage.addToCart(productName);
    }

    @Step
    public boolean checkIfPresent(String productName)
    {
        cartPage.open();
        return cartPage.isProductPresent(productName);
    }

    @Step
    public boolean emptyCart()
    {
    	System.out.println("inside empty card");
        cartPage.emptyCart();
        return cartPage.checkEmptyCartSuccessful();
    }
}
