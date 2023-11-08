package com.qa.pages;

import com.qa.basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class ProductDetailPage extends BasePage {

    private By productListItem = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a");
    private By addToCartId = By.id("add-to-cart-button");
    private By cartquantity = By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[4]/div[5]/div/div[1]/div/div/div/form/div/div/div/div/div[4]/div/div[21]/div/div/span/div/div/span/span");
    private WebElement driver;
    private By productprice = By.id("price");
    private By getProductprice1 = By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[4]/div[5]/div/div[1]/div/div[1]/div/div/div[1]/div/div[1]/h5/div[2]/div/div[1]/div/div/span[1]/span[2]");
    private By paperbackPrice = By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[7]/div[7]/div[2]/div[2]/ul/li[3]/span/span[1]");
    private By selectQuantityValue = By.xpath("/html/body/div[7]/div/div/ul/li[2]");
    private By productTitle = By.id("productTitle");
    private By cartItemxpath = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");
    private By clickQuantityDropMenu = By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[4]/div[5]/div/div[1]/div/div[1]/div/div/div[1]/div/div[2]/div/form/div/div/div[21]/div/div/span/div/div/span/span");


    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public double getBookPrice(){
        // Fetch the price
        WebElement element = getElement(productprice);
        //WebElement element = getElement(getProductprice1);
        //Fetch its price by using getText method
        String price = element.getText();
        if(element.isDisplayed()){
            System.out.println("Product Unit Price is" + price);
            return Double.parseDouble(price);
        }
        return 0;
    }

    public String getProductName(){
        //product detail page
        //return getElement(By.id("productTitle")).getText();
        return getElement(productTitle).getText();
    }

    public String getCartItemName(){
        //cart page
        return getElement(cartItemxpath).getText();

    }

    /*public int getQuantity() {
        getElement(cartquantity).click();
        Select quantity = new Select(getElement(cartquantity));
        quantity.selectByVisibleText("2");return 2;
        //return Integer.getInteger(getElement(cartquantity).getText());
    }*/

    public void clickQuantity()
    {
        getElement(clickQuantityDropMenu).click();
    }
    public void  selectQuantity(){

        getElement(selectQuantityValue).click();
    }

    public void clickAddToCart(){

        getElement(addToCartId).click();
    }

    public void clickedPaperbackPrice(){

        getElement(paperbackPrice).click();
    }

}

