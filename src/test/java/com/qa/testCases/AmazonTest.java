package com.qa.testCases;

import com.qa.pages.CartPage;
import com.qa.pages.ProductDetailPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.qa.baseTest.BaseTest;
import com.qa.pages.HomePage;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


public class AmazonTest extends BaseTest{

	HomePage home;
	ProductDetailPage productDetail;
	CartPage cart;


	@Test
	public void goToHomePage() {
		home = page.getInstance(HomePage.class);
		productDetail = page.getInstance(ProductDetailPage.class);
		cart = page.getInstance(CartPage.class);

		//WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Click Category list
		home.clickCategoryBox();

		// Select "Books" from category list
		home.selectCategory("Books");

		// Enter keyword as "Automation" to search field
		home.enterTextInSearchField("Automation");

		// Select ratings (4 & up)
		home.selectRatings(); // Select ratings (4 & up)

		// Select language as English
		home.selectLanguage();

		// Select Product from list (2nd product in search result page)
		String clickedProductName = home.productList();

		// Navigate to product detail page and verify product title
		String productTitle = productDetail.getProductName();
		System.out.println(clickedProductName);
		System.out.println(productTitle);
		Assert.assertEquals(clickedProductName, productTitle, "Clicked product name and product detail page product title are equal.");
		//Assert.assertNotEquals(clickedProductName, productTitle, "Clicked product name and product detail page product title are NOT equal.");

		// Click quantity drop menu
		productDetail.clickQuantity();

		// Set Quantity as 2
		productDetail.selectQuantity();

		// Click add to cart button
		productDetail.clickAddToCart();

		// Click Go to Cart button
		cart.clickGotoCart();

		// Assert Item name
		String itemTitle = cart.getItemTitle();
		Assert.assertEquals(itemTitle, productTitle, "Product name matches in the cart."); // Assert item name

		// Assert Quantity
		String cartQty = cart.getQuantity();
		String expectedQuantity = "2";
		Assert.assertEquals(cartQty, expectedQuantity, "Cart qty is 2, correct"); // Assert quantity

		// Assert total price
		String cartTotalPrice = cart.getTotalPrice();
		String expectedTotalPrice = " $37.52";
		Assert.assertEquals(cartTotalPrice, expectedTotalPrice, "Cart price is correct"); // Assert total price



		// Clear the cart
		cart.clearCart();

		cartTotalPrice = cart.getTotalPrice();
		expectedTotalPrice = " $0.00";
		Assert.assertEquals(cartTotalPrice, expectedTotalPrice, "Cart value is $0."); // Assert total price

		try {
			Thread.sleep(100000);
		} catch (Exception e) {

		}

	}
}

	

