package jar.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import constants.Constants;

import java.util.List;

@DefaultUrl(Constants.BASE_URL + "/sale.html")

public class SalePage extends PageObject {
	
    @FindBy(css="ul[class*='products-grid']>li")
    private List<WebElement> products;

    public WebElement getProduct(String productName)
    {
        for(int i=0;i<products.size();i++)
        {
            if(products.get(i).getText().contains(productName.toUpperCase()))return products.get(i);
        }
        return null;
    }

    public boolean checkIfproductExists(String productName)
    {
        return getProduct(productName)!=null;
    }

    public void addToCart(String productName)
    {
    	System.out.println("inside addToCart");
    	WebElement product = getProduct(productName);
        WebElement addToCartButton = product.findElement(By.cssSelector(".button.btn-cart"));
        addToCartButton.click();
    }
}
