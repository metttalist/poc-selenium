package page.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.AbstractPocPage;
import page.homepage.HomePage;


public class LoginPage extends AbstractPocPage {

    private WebElement element = null;
    private String baseUrl = "https://mutualofomaha--selenium.cs68.my.salesforce.com/";
    HomePage homePage = new HomePage();

    // SELECTORS

    /**
     * Returns "Username" field
     * @param driver
     * @return "Username" field.
     */
    public WebElement getUserNameField(WebDriver driver) {
        element = driver.findElement(By.id("username"));
        return element;
    }

    /**
     *  Returns "Password" field.
     * @param driver
     * @return "Password" field.
     */
    public WebElement getPasswordField(WebDriver driver) {
        element = driver.findElement(By.id("password"));
        return element;
    }

    /**
     * Returns "Login In to Sandbox" button
     * @param driver
     * @return "Login In to Sandbox" button
     */
    public WebElement getLoginButton(WebDriver driver) {
        element = driver.findElement(By.id("Login"));
        return element;
    }

    //HELPER METHODS

    public void login(WebDriver driver) {
        String userName = "igor.khorev@seleniumtest.org";
        String password = "test1234";
        driver.get(baseUrl);

        getUserNameField(driver).clear();
        getUserNameField(driver).sendKeys(userName);
        getPasswordField(driver).clear();
        getPasswordField(driver).sendKeys(password);
        getLoginButton(driver).click();
        waitForElementVisibility(driver, homePage.getContactsTab(driver));
    }
}
