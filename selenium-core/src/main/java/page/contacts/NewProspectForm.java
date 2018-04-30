package page.contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.AbstractPocPage;

public class NewProspectForm extends AbstractPocPage {

    private WebElement element = null;

    // SELECTORS

    /**
     * Returns "First Name" field from New Contact Prospect form.
     * @param driver
     * @return
     */
    public WebElement getFirstNameField(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        return element;
    }

    /**
     * Returns "Last Name" field from New Contact Prospect form.
     * @param driver
     * @return
     */
    public WebElement getLastNameField(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        return element;
    }

    /**
     * Returns "Birthdate" field from New Contact Prospect form.
     * @param driver
     * @return
     */
    public WebElement getBirthdateField(WebDriver driver) {
        element = driver.findElement(By.xpath(
                "//span[text()='Birthdate']//parent::label//following-sibling::div[@class='form-element']//input"));
        return element;
    }

    /**
     * Returns "Mobile" field from New Contact Prospect form.
     * @param driver
     * @return
     */
    public WebElement getMobileField(WebDriver driver) {
        element = driver.findElement(By.xpath(
                "//span[text()='Mobile']//parent::label//following-sibling::input"));
        return element;
    }

    /**
     * Returns "Preferred Phone" dropdown from New Contact Prospect form.
     * @param driver
     * @return
     */
    public WebElement getSelectPreferredPhoneDropdown(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[text()='Select Preferred Phone']//parent::span//following-sibling::div//a[@class='select']"));
        return element;
    }

    /**
     * Returns "Mobile" selection from dropdown list in New Contact Prospect form.
     * @param driver
     * @return
     */
    public WebElement getMobileSelection(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[text()='Mobile']"));
        return element;
    }

    /**
     * Returns "Residential Street" test area from New Contact Prospect form.
     * @param driver
     * @return
     */
    public WebElement getSelectResidentialSteetTextArea(WebDriver driver) {
        element = driver.findElement(By.xpath("//textarea[@placeholder='Residential Street']"));
        return element;
    }

    /**
     * Returns "Residential City" field from New Contact Prospect form.
     * @param driver
     * @return
     */
    public WebElement getResidentialCityField(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@placeholder='Residential City']"));
        return element;
    }

    /**
     * Returns "Residential State/Province" field from New Contact Prospect form.
     * @param driver
     * @return
     */
    public WebElement getResidentialStateProvinceField(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@placeholder='Residential State/Province']"));
        return element;
    }

    /**
     * Returns Residential Zip/Postal Code" field from New Contact Prospect form.
     * @param driver
     * @return
     */
    public WebElement getResidentialZipPostalCodeField(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@placeholder='Residential Zip/Postal Code']"));
        return element;
    }

    /**
     * Returns "Save" button from New Contact Prospect form.
     * @param driver
     * @return
     */
    public WebElement getSaveButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@title='Save']"));
        return element;
    }

    /**
     * Returns state abbreviation error from New Contact Prospect form.
     * @param driver
     * @return
     */
    public WebElement getStateAbbreviationError(WebDriver driver) {
        element = driver.findElement(By.xpath("//li[contains(text(), 'The residential state should be the official " +
                "USPS 2 character abbreviation in all CAPS')]"));
        return element;
    }

    //HELPER METHODS
}
