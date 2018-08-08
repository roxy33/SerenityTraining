package tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import jar.steps.serenity.LoginSteps;
import jar.steps.serenity.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Narrative;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

@Narrative(title = "Search Test", text = { "Search test" })

@RunWith(SerenityRunner.class)
//@DefaultUrl(value = constants.Constants.BASE_URL)

public class SearchTest extends BaseTest {

	@Managed(uniqueSession = true)
	WebDriver driver;
	
    @Steps
    private SearchSteps searchSteps;

    //test1 against a successful search
    @Test
    public void testSearch()
    {
        //searchSteps.login();
        searchSteps.searchTerm("dress");
        assert(searchSteps.verifyIfDisplayed("dress".toUpperCase()));
    }
    
    //test2 against an invalid non-results search
    @Test
    public void testInvalidSearch()
    {
        //searchSteps.login();
        searchSteps.searchTerm("dwehgdhj");
        assert(!searchSteps.verifyIfDisplayed("dwehgdhj".toUpperCase()));
    }
    //test3 against a successful sort
    @Test
    public void testSort()
    {
        //searchSteps.login();
        searchSteps.searchTerm("dress");
        assert(searchSteps.sort());
    }
}
