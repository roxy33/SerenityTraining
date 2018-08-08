package jar.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AdminHeaderPage extends PageObject {

    @FindBy(css = "a[title='close']")
    private WebElementFacade closePopUp;
    @FindBy(css = "a.link-logout")
    private WebElementFacade logoutLink;

    @FindBy(css = "li:nth-child(3).parent.level0")
    private WebElementFacade catalogOption;
    @FindBy(css = "a[href*='/catalog_category/']")
    private WebElementFacade manageCategories;

    @FindBy(css = "li:nth-child(9).parent.level0")
    private WebElementFacade systemOprion;
    @FindBy(css = "li:nth-child(12)")
    private WebElementFacade cacheManagement;
    @FindBy(css = "button[title='Flush Magento Cache']")
    private WebElementFacade flushMagentoCache;

    @FindBy(css = "#group_4name")
    private WebElementFacade categoryNameField;
    @FindBy(css = "#group_4is_active")
    private WebElementFacade isActiveField;
    @FindBy(css = "#group_4is_active option:nth-child(1)")
    private WebElementFacade isActiveFieldYes;
    @FindBy(css = "#group_4include_in_menu")
    private WebElementFacade includeInNavigationMenu;
    @FindBy(css = "#group_4include_in_menu option:nth-child(1)")
    private WebElementFacade includeInNavigationMenuYes;
    @FindBy(css = "button[title='Save Category']")
    private WebElementFacade saveCategoryButton;

    public void setClosePopUp(){
        closePopUp.click();
    }

    public void logout(){
        logoutLink.click();
    }

    public void clickOnCatalog(){
        catalogOption.click();
    }

    public void clickOnCategories(){
        manageCategories.click();
    }

    public void setCategoryNameField(String name){
        categoryNameField.sendKeys(name);
    }

    public void clickOnIsActiveDropdown(){
        //isActiveField.click();
        isActiveField.selectByVisibleText("Yes");
    	
    	//Select isActiveField = new Select(getDriver().findElement(By.cssSelector("#group_4is_active option:nth-child(1)")));
    	//isActiveField.selectByVisibleText("Yes");
    }

    public void chooseYesIsActive(){
        isActiveFieldYes.click();
    }

    public void clickOnIncludeDropdown(){
        includeInNavigationMenu.click();
    }

    public void chooseYesInclude(){
    	//includeInNavigationMenuYes.click();
        includeInNavigationMenuYes.selectByVisibleText("Yes");
    }

    public void submitNewCategory(){
        saveCategoryButton.click();
    }

    public void clickOnSystem(){
        systemOprion.click();
    }

    public void clickOnCacheManagement(){
        cacheManagement.click();
    }

    public void setFlushMagentoCache(){
        flushMagentoCache.click();
    }

}
