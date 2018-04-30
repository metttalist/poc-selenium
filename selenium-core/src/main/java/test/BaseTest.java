package test;

import page.accounts.AccountsPage;
import page.contacts.ContactsPage;
import page.homepage.HomePage;
import page.notes.NotesPanel;

public abstract class BaseTest extends AbstractTest {

    private ContactsPage contactsPage;
    private AccountsPage accountsPage;
    private HomePage homePage;
    private NotesPanel notesPanel;

    protected void deleteProspect() {
        homePage = new HomePage();
        contactsPage = new ContactsPage();
        accountsPage = new AccountsPage();

        homePage.getContactsTab(driver).click();
        homePage.delayForNextAction(MEDIUM_INTERVAL_IN_MILLISECONDS);
        contactsPage.getContactDropdown(driver).click();
        contactsPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        contactsPage.getDeleteButton(driver).click();
        contactsPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        contactsPage.getModalContainerDeleteButton(driver).click();
        contactsPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        homePage.getAccountsTab(driver).click();
        contactsPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        accountsPage.getSelectListViewButton(driver).click();
        accountsPage.getMyAccountsOption(driver).click();
        accountsPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        accountsPage.getAccountDropdown(driver).click();
        accountsPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        accountsPage.getDeleteButton(driver).click();
        accountsPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        accountsPage.getModalContainerDeleteButton(driver).click();
        accountsPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
    }

    protected void deleteNote() {
        notesPanel = new NotesPanel();

        notesPanel.getNotesDropdown(driver).click();
        notesPanel.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        notesPanel.getDeleteButton(driver).click();
        notesPanel.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        notesPanel.getModalContainerDeleteButton(driver).click();
        notesPanel.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
    }
}
