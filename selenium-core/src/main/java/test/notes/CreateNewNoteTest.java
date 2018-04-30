package test.notes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import page.contacts.ContactViewPage;
import page.contacts.ContactsPage;
import page.contacts.NewProspectForm;
import page.homepage.HomePage;
import page.loginpage.LoginPage;
import page.notes.NotesPage;
import page.notes.NotesPanel;
import test.BaseTest;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CreateNewNoteTest extends BaseTest{

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private ContactsPage contactsPage;
    private ContactViewPage contactViewPage;
    private NewProspectForm newProspectForm;
    private NotesPanel notesPanel;
    private NotesPage notesPage;
    private Actions actions;

    private static final int VERY_SHORT_INTERVAL_IN_MILLISECONDS = 500;
    private static final int SHORT_INTERVAL_IN_MILLISECONDS = 1500;
    private static final int MEDIUM_INTERVAL_IN_MILLISECONDS = 3000;
    private static final String FIRST_NAME = "FirstName";
    private static final String LAST_NAME = "LastName";
    private static final String NOTE_TITLE = "Test Note 123";
    private static final String NOTE_BODY = "The last word in this sentence is ";
    private static final String NOTE_BODY_BOLD = "bolded";



    @Before
    public void setup() {
        super.setup();
        this.driver = super.driver;
        loginPage = new LoginPage();
        homePage = new HomePage();
        contactsPage = new ContactsPage();
        contactViewPage = new ContactViewPage();
        newProspectForm = new NewProspectForm();
        notesPanel = new NotesPanel();
        notesPage = new NotesPage();
        actions = new Actions(driver);
    }

    @Test
    public void testNoteCreate() {
        loginPage.login(driver);
        homePage.getNotesButton(driver).click();
        homePage.waitForElementVisibility(driver, homePage.getNewNoteButton(driver));
        homePage.getNewNoteButton(driver).click();
        homePage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        homePage.getMinimizeNoteButton(driver).click();
        notesPanel.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        notesPanel.getTitleInputField(driver).sendKeys(NOTE_TITLE);
        notesPanel.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        notesPanel.getNoteTextArea(driver).sendKeys(NOTE_BODY);
        notesPanel.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        notesPanel.getMakeTextBoldButton(driver).click();
        notesPanel.delayForNextAction(VERY_SHORT_INTERVAL_IN_MILLISECONDS);
        notesPanel.getNoteTextArea(driver).sendKeys(NOTE_BODY_BOLD);
        notesPanel.delayForNextAction(MEDIUM_INTERVAL_IN_MILLISECONDS);
        notesPanel.getAddToRecordsButton(driver).click();
        notesPanel.waitForElementVisibility(driver, notesPanel.getUiPopUpTrigger(driver));
        notesPanel.getUiPopUpTrigger(driver).click();
        notesPanel.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        actions.moveToElement(notesPanel.getContactsRecordType(driver)).build().perform();
        notesPanel.getContactsRecordType(driver).click();
        notesPanel.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        notesPanel.getSearchContactsInputField(driver).click();
        notesPanel.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        notesPanel.getNewContactButton(driver).click();
        notesPanel.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        contactsPage.waitForElementVisibility(driver, contactsPage.getNewContactFormTitle(driver));
        contactsPage.getProspectRadioButton(driver).click();
        contactsPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        contactsPage.getNextButton(driver).click();
        contactsPage.waitForElementVisibility(driver, contactsPage.getNewContactFormTitle(driver));
        newProspectForm.getFirstNameField(driver).sendKeys(FIRST_NAME);
        newProspectForm.getLastNameField(driver).sendKeys(LAST_NAME);
        newProspectForm.getSaveButton(driver).click();
        newProspectForm.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        notesPanel.getAddButton(driver).click();
        notesPanel.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        notesPanel.getOwnersLookup(driver).click();
        notesPanel.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        notesPanel.getDoneButton(driver).click();
        contactViewPage.waitForElementVisibility(driver, contactViewPage.getRelatedNotesLink(driver));
        contactViewPage.getRelatedNotesLink(driver).click();
        contactViewPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        notesPage.getNoteTitleLink(driver, NOTE_TITLE).click();
        notesPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        assertThat("Note Title was empty, or incorrect.", notesPanel.getTitleField(driver, NOTE_TITLE).getText(), is(NOTE_TITLE));
        notesPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        notesPanel.getCloseButton(driver).click();
        notesPanel.delayForNextAction(MEDIUM_INTERVAL_IN_MILLISECONDS);
    }

    @After
    public void tearDown() {
        super.deleteNote();
        super.deleteProspect();
        super.tearDown();
    }

    // HELPER METHODS

}
