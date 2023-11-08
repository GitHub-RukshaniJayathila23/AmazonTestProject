package com.qa.pages;
import com.qa.basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartPage extends BasePage {

    private By gotoCartBtn = By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div/div[1]/span/span");
    private By clearCart = By.xpath("/html/body/div[1]/div[1]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/div[1]/span[2]/span/input");
    private By cartPageItemTitle = By.xpath("/html/body/div[1]/div[1]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/ul/li/span/a/span[1]/span/span[2]");
    private By cartQuantity = By.xpath("/html/body/div[1]/div[1]/div[3]/div[4]/div/div[2]/div[1]/div/form/div[2]/div[3]/div[4]/div/div[2]/div[1]/span[1]/span/input");
    private By cartTotalPrice = By.id("sc-subtotal-amount-activecart");



    public CartPage(WebDriver driver) {
        super(driver);
    }
    //Navigate to Cart Page
    public void clickGotoCart(){
        getElement(gotoCartBtn).click();
    }

    public String getItemTitle() {
        return getElement(cartPageItemTitle).getText();
    }

    public String getQuantity() {
        //System.out.println("|" + getElement(cartQuantity).getAttribute("value") + "|");
        return getElement(cartQuantity).getAttribute("value");
    }

    public String getTotalPrice(){
        System.out.println(getElement(cartTotalPrice).getText());
        return getElement(cartTotalPrice).getText();
    }
    public void clearCart(){
        getElement(clearCart).click();
    }
}
