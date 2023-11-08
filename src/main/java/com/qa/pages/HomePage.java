package com.qa.pages;

import org.bson.assertions.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.qa.basePage.BasePage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class HomePage extends BasePage{

	private By categoryBox= By.id("searchDropdownBox");
	private By searchBox = By.id("twotabsearchtextbox");
	//private  By searchBox = By.id("nav-search-bar-form");
	private By searchBtn = By.id("nav-search-submit-button");
	private By starRatings = By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[3]/ul/span[1]/li/span/a");
	private By englishLanguageCheckbox = By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/span/div[1]/div/div/div[6]/ul[5]/span[1]/li/span/a");
	private By productListItem = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a");

	public HomePage(WebDriver driver) {

		super(driver);
	}

	// Click Category drop menu
	public void clickCategoryBox()
	{
		getElement(categoryBox).click();
	}

	// Select category from drop menu
	public  void selectCategory(String listItem)
	{
		Select drop = new Select(getElement(categoryBox));
		drop.selectByVisibleText(listItem);
	}

	// Enter keyword to search field
	public void enterTextInSearchField(String keyword)
	{
		WebElement searchField = getElement(searchBox);
		searchField.sendKeys(keyword);
		searchField.sendKeys(Keys.ENTER);
	}

	// Select Ratings
	public void selectRatings()
	{
		getElement(starRatings).click();
		/*// Verify that the selected option is "4 Stars & Up"
		String selectedOptionText = select.selectRatings().getText();
		Assert.assertEquals(selectedOptionText, "4 Stars & Up", "Selected option is not '4 Stars & Up'");*/
	}

	// Select Language
	public void selectLanguage(){
		getElement(englishLanguageCheckbox).click();
	}

	public String productList(){
		//List<WebElement> elements = this.getDriver().findElements(By.cssSelector("s-result-item"));;

    	/*String checkCSS = "s-result-item";
		List<WebElement> elements = this.getDriver().findElements(By.cssSelector(checkCSS));
		elements.get(0).click();*/

		//System.out.println(elements);
		WebElement element = getElement(productListItem);

		String name = element.getText();
		element.click();
		return name;
	}
}

