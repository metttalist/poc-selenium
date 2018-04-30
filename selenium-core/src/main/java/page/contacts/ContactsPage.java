package page.contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.AbstractPocPage;

public class ContactsPage extends AbstractPocPage {

    private WebElement element = null;

    // SELECTORS

    /**
     * Returns a "New" button from Contacts Page.
     * @param driver
     * @return "New" button.
     */
    public WebElement getNewButton(WebDriver driver) {
        element = driver.findElement(By.cssSelector("a[title='New']"));
        return element;
    }

    /**
     * Returns Contact DropDown button from Contacts Page.
     * @param driver
     * @return Contacts dropdown.
     */
    public WebElement getContactDropdown(WebDriver driver) {
        element = driver.findElement(By.xpath("//table//a[@role='button']//span[@class='lightningPrimitiveIcon']"));
        return element;
    }

    /**
     * Returns "Delete" button from Contact DropDown.
     * @param driver
     * @return "Delete" button.
     */
    public WebElement getDeleteButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@title='Delete']"));
        return element;
    }

    /**
     * Returns a "Prospect" radio button from "New Contact" form.
     * @param driver
     * @return "Prospect" button.
     */
    public WebElement getProspectRadioButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='changeRecordTypeOptionRightColumn']//span[text()='Prospect']"));
        return element;
    }

    /**
     * Returns a "Next" button from "New Contact" form.
     * @param driver
     * @return "Next" button.
     */
    public WebElement getNextButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button//span[text()='Next']"));
        return element;
    }

    /**
     * Returns a "New Contact" title from "New Contact" form.
     * @param driver
     * @return "Next" button.
     */
    public WebElement getNewContactFormTitle(WebDriver driver) {
        element = driver.findElement(By.xpath("//h2[contains(text(), 'New Contact')]"));
        return element;
    }

    //HELPER METHODS
}
