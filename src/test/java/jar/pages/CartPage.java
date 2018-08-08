package jar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import constants.Constants;
import net.serenitybdd.core.pages.PageObject;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;

import org.openqa.selenium.By;

import java.util.List;

@DefaultUrl(Constants.BASE_URL + "/checkout/cart/")

public class CartPage extends PageObject {

	@FindBy(css = ".product-cart-info")
	private List<WebElement> products;

	public WebElement getProduct(String productName) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getText().contains(productName))
				return products.get(i);
		}
		return null;
	}

	public boolean isProductPresent(String productName) {
		return getProduct(productName) != null;
	}

	public void emptyCart() {
		WebElement emptyCartButton = getDriver().findElement(By.cssSelector("#empty_cart_button"));
		emptyCartButton.click();
	}

	public boolean checkEmptyCartSuccessful() {
		WebElement cartEmptyMessage = getDriver().findElement(By.cssSelector(".page-title"));
		return cartEmptyMessage.getText().contains("Shopping Cart is Empty".toUpperCase());
	}

}
