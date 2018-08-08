package jar.steps.serenity;

import org.openqa.selenium.WebDriver;
import constants.Constants;
import jar.pages.LoginPage;
import jar.pages.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchSteps {
	private LoginPage loginPage;
    private SearchPage searchPage;

    @Step
    public void login()
    {
        loginPage.open();
        loginPage.setEmailField("roxana.borhidi@gmail.com");
        loginPage.setPasswordField("donkey32");
        loginPage.clickLogin();
    }

    @Step
    public boolean sort()
    {
        searchPage.sortByPrice();
        return searchPage.checkDescendingPrices();
    }

    @Step
    public void searchTerm(String productName)
    {
    	searchPage.setSearchBar(productName);
    }

    @Step
    public boolean verifyIfDisplayed(String productName)
    {
    	return searchPage.isSearchPageDisplayed(productName);
    }
}
