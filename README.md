
#Automation Framework for Amazon Web Testing

### This repository contains an automation framework to automate a scenario on the official Amazon website using Java, Selenium WebDriver, and TestNG. The framework follows the Page Object Pattern, and it includes various components and features to perform the specified tasks.

### Framework Components
    Programming Language: Java
    Automation Tool: Selenium WebDriver
    Test Case Writing Library: TestNG
    Framework Pattern: Page Object Pattern

## Scenario

The automation scenario involves the following steps:

    Navigate to the official Amazon site https://www.amazon.com/.
    Select 'Books' from the Category list.
    Search for the search term "Automation".
    Select Customer Reviews as "4 Stars & Up".
    Select Language as "English".
    Get the name of the second item from the Product List page.
    Click the second item from the Product List page and navigate to the Product Detail page.
    Get the unit price of the item displayed in the Product Detail page.
    Verify whether the item name of the Product Detail page is the same as the item name obtained from the Product List page in step 6.
    Set the Quantity to 2.
    Click on 'Add to Cart'.
    Click on 'Go to Cart'.
    Verify whether the cart details are correct (Item name, Quantity, and Total Price).
    Clear the cart and verify the total amount is equal to $0.00.

### Task List
    Develop a High-level automation framework to automate the above scenario using Java and Selenium WebDriver.
    Use Property files to manage configuration data such as the Application URL.
    Parametrize the test data of the tests in the designed framework.
    Use assertions to validate the tests.
    Share the project using a GitHub repository link.
    Include a README.md file to the project. State Challenges/Issues which you have faced and the workarounds applied.
    Provide sufficient information to run the code.

### Getting Started
To run the automation tests, follow these steps:

    Clone this GitHub repository to your local machine.

    Configure the project and dependencies.

    Update the config.properties file with the necessary application URL.

    Ensure you have Java and TestNG installed on your system.

    Open a terminal or command prompt and navigate to the project directory.

    Run the TestNG

### Challenges
    Dynamic Product Page:
        The product page, list, and price are dynamic, making it challenging to locate elements consistently.

    Product Title Assertion:
        The product title assertion sometimes fails when the actual and expected titles are the same.

    Category Dropdown Loading:
        Sometimes, the web page loads without the category dropdown initially, causing test failures.

#### I used this GitHub repo for building the code structure.
[https://github.com/b7satapathy/Selenium-TestNg-Framework-From-Scratch]
