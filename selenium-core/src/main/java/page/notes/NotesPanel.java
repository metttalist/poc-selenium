package page.notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.AbstractPocPage;

public class NotesPanel extends AbstractPocPage {

    private WebElement element = null;

    // SELECTORS

    /**
     * Returns Title input field from Notes Panel.
     * @param driver
     * @return
     */
    public WebElement getTitleInputField(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[contains(@class, 'notesTitle')]"));
        return element;
    }

    /**
     * Returns Title field from Notes Panel.
     * @param driver
     * @return
     */
    public WebElement getTitleField(WebDriver driver, String noteTitle) {
        element = driver.findElement(By.xpath("//h2[contains(@class,'panelTitle')][@title='" + noteTitle + "']"));
        return element;
    }

    /**
     * Returns Test Area field from Notes Panel.
     * @param driver
     * @return
     */
    public WebElement getNoteTextArea(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[contains(@class, 'notesEditPanel')]//div[contains(@class, 'ql-editor')]"));
        return element;
    }

    /**
     * Returns "Add to Records" button from Notes Panel.
     * @param driver
     * @return
     */
    public WebElement getAddToRecordsButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button//span[.='Add to Records']"));
        return element;
    }

    /**
     * Returns "Done" button from Notes Panel.
     * @param driver
     * @return
     */
    public WebElement getDoneButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button//span[.='Done']"));
        return element;
    }

    /**
     * Returns "Delete" button from Notes Panel.
     * @param driver
     * @return
     */
    public WebElement getDeleteNoteButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[contains(@class,'delete-button')]"));
        return element;
    }

    /**
     * Returns Confirm Delete button from Notes Panel.
     * @param driver
     * @return
     */
    public WebElement getConfirmDeleteNoteButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@title='Delete']"));
        return element;
    }

    /**
     * Returns Notes DropDown button from Notes Page.
     * @param driver
     * @return
     */
    public WebElement getNotesDropdown(WebDriver driver) {
        element = driver.findElement(By.xpath("//table//a[@role='button']//span[@class='lightningPrimitiveIcon']"));
        return element;
    }

    /**
     * Returns "Delete" button from Notes DropDown.
     * @param driver
     * @return "Delete" button.
     */
    public WebElement getDeleteButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@title='Delete']"));
        return element;
    }

    /**
     * Returns Ui PopUp Trigger from "Add Note to Records" Panel.
     * @param driver
     * @return
     */
    public WebElement getUiPopUpTrigger(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='panelBody']//div[@class='uiPopupTrigger']//a[@role='button']"));
        return element;
    }

    /**
     * Returns Contacts record type from "Add Note to Records" Panel.
     * @param driver
     * @return
     */
    public WebElement getContactsRecordType(WebDriver driver) {
        element = driver.findElement(By.xpath("//li[@class='entityMenuItemContact uiMenuItem forceSearchEntityMenuItem']//a"));
        return element;
    }

    /**
     * Returns Ui PopUp Trigger scroll bar from "Add Note to Records" Panel.
     * @param driver
     * @return
     */
    public WebElement getUiPopUpTriggerScrollBar(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@role='menu'][@class='entityMenuList']//ul[@role='presentation']"));
        return element;
    }

    /**
     * Returns "Search Contacts" input field from "Add Note to Records" Panel.
     * @param driver
     * @return
     */
    public WebElement getSearchContactsInputField(WebDriver driver) {
        element = driver.findElement(By.xpath("//input[@title='Search Contacts']"));
        return element;
    }

    /**
     * Returns "New Contact" button from "Add Note to Records" Panel.
     * @param driver
     * @return
     */
    public WebElement getNewContactButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[@title='New Contact']"));
        return element;
    }

    /**
     * Returns "Add" button from "Add Note to Records" Panel.
     * @param driver
     * @return
     */
    public WebElement getAddButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//button[@type='button']//span[text()='Add']"));
        return element;
    }

    /**
     * Returns "Bold" button from "Add Notes to Records" Panel.
     * @param driver
     * @return
     */
    public WebElement getMakeTextBoldButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[contains(@class,'notesNoteEditor')]//button[@title='Bold']"));
        return element;
    }

    /**
     * Returns "Minimize" button from "Add Notes to Records" Panel.
     * @param driver
     * @return
     */
    public WebElement getMinimizeButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[@class='buttonTitle']//button[@title='Minimize']"));
        return element;
    }

    /**
     * Returns "Close" button from "Add Notes to Records" Panel.
     * @param driver
     * @return
     */
    public WebElement getCloseButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//span[@class='buttonTitle']//button[@title='Close']"));
        return element;
    }

    /**
     * Returns Note owner's lookup from "Add Notes to Records" Panel.
     * @param driver
     * @return
     */
    public WebElement getOwnersLookup(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='outputLookupContainer forceOutputLookupWithPreview']//a"));
        return element;
    }

}
