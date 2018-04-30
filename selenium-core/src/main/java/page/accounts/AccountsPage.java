package page.accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.AbstractPocPage;

public class AccountsPage extends AbstractPocPage {

    private WebElement element = null;

    // SELECTORS

    /**
     * Returns Accounts DropDown button from Contacts Page.
     * @param driver
     * @return "Accounts" dropdown.
     */
    public WebElement getAccountDropdown(WebDriver driver) {
        element = driver.findElement(By.xpath("//table//a[@role='button']//span[@class='lightningPrimitiveIcon']"));
        return element;
    }

    /**
     * Returns "Delete" button from Account DropDown.
     * @param driver
     * @return "Delete" button.
     */
    public WebElement getDeleteButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@title='Delete']"));
        return element;
    }

    /**
     * Returns "My Accounts" option from Select List View DropDown.
     * @param driver
     * @return "My Accounts" option.
     */
    public WebElement getMyAccountsOption(WebDriver driver) {
        element = driver.findElement(By.xpath("//a//span[text()='My Accounts']"));
        return element;
    }

    //HELPER METHODS
}
