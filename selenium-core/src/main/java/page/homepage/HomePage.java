package page.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.AbstractPocPage;

public class HomePage extends AbstractPocPage {

    private WebElement element = null;

    // SELECTORS

    /**
     * Returns "Contacts" tab from the top level menu on the page.
     * @param driver
     * @return
     */
    public WebElement getContactsTab(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@title='Contacts']"));
        return element;
    }

    /**
     * Returns "Accounts" tab from the top level menu on the page.
     * @param driver
     * @return
     */
    public WebElement getAccountsTab(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@title='Accounts']"));
        return element;
    }

    /**
     * Returns "Notes" button from the bottom level menu on the page.
     * @param driver
     * @return
     */
    public WebElement getNotesButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[@class='itemTitle'][text()='Notes']"));
        return element;
    }

    /**
     * Returns "New" button from Notes panel.
     * @param driver
     * @return
     */
    public WebElement getNewNoteButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='slds-utility-panel__body']//h1//button[@type='button']"));
        return element;
    }

    /**
     * Returns "Minimize" button from Notes panel.
     * @param driver
     * @return
     */
    public WebElement getMinimizeNoteButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[contains(@class,'slds-utility-panel__header')]//button[@title='Minimize']"));
        return element;
    }




    //HELPER METHODS
}
