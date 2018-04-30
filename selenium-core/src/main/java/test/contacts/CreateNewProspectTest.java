package test.contacts;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import page.accounts.IndividualAccountViewPage;
import page.contacts.ContactViewPage;
import page.contacts.ContactsPage;
import page.contacts.NewProspectForm;
import page.homepage.HomePage;
import page.loginpage.LoginPage;
import test.BaseTest;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CreateNewProspectTest extends BaseTest {

    private static final Logger log = LogManager.getLogger(CreateNewProspectTest.class);

    private WebDriver driver;
    private HomePage homePage;
    private ContactsPage contactsPage;
    private ContactViewPage contactViewPage;
    private NewProspectForm newProspectForm;
    private LoginPage loginPage;
    private IndividualAccountViewPage individualAccountViewPage;

    private static final String STATE_ABBREVIATION_ERROR = "The residential state should be the official USPS 2 " +
            "character abbreviation in all CAPS. {Error message #CON1}";
    private static final int SHORT_INTERVAL_IN_MILLISECONDS = 1500;
    private static final String MOBILE_PHONE = "1234567890";
    private static final String INDIVIDUAL_ACCOUNT = "Individual Account";
    private static final String TEAM_MEMBER = "Igor Khorev";
    private static final String FIRST_NAME = "FirstName";
    private static final String LAST_NAME = "LastName";
    private static final String BIRTH_DATE = "1/25/1984";
    private static final String STREET_ADDRESS = "123 Main St.";
    private static final String CITY = "Omaha";
    private static final String STATE_FULL = "Nebraska";
    private static final String STATE_SHORT = "NE";
    private static final String ZIP_CODE = "68022";

    @Before
    public void setup() {
        super.setup();
        this.driver = super.driver;
        homePage = new HomePage();
        contactsPage = new ContactsPage();
        contactViewPage = new ContactViewPage();
        newProspectForm = new NewProspectForm();
        loginPage = new LoginPage();
        individualAccountViewPage = new IndividualAccountViewPage();

        log.debug("Initialization is completed.");
    }

    private void fillOutTheForm() {
        loginPage.login(driver);
        homePage.getContactsTab(driver).click();
        contactsPage.waitForElementVisibility(driver, contactsPage.getNewButton(driver ));
        contactsPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        contactsPage.getNewButton(driver).click();
        contactsPage.waitForElementVisibility(driver, contactsPage.getNewContactFormTitle(driver));
        contactsPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        contactsPage.getProspectRadioButton(driver).click();
        contactsPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        contactsPage.getNextButton(driver).click();
        contactsPage.waitForElementVisibility(driver, contactsPage.getNewContactFormTitle(driver));
        newProspectForm.getFirstNameField(driver).sendKeys(FIRST_NAME);
        newProspectForm.getLastNameField(driver).sendKeys(LAST_NAME);
        newProspectForm.getBirthdateField(driver).sendKeys(BIRTH_DATE);
        newProspectForm.getMobileField(driver).sendKeys(MOBILE_PHONE);
        newProspectForm.getSelectPreferredPhoneDropdown(driver).click();
        newProspectForm.getMobileSelection(driver).click();
        newProspectForm.getSelectResidentialSteetTextArea(driver).sendKeys(STREET_ADDRESS);
        newProspectForm.getResidentialCityField(driver).sendKeys(CITY);
        newProspectForm.getResidentialStateProvinceField(driver).sendKeys(STATE_FULL);
        newProspectForm.getResidentialZipPostalCodeField(driver).sendKeys(ZIP_CODE);

        log.debug("Form is filled out.");
    }

    private void correctStateErrorFinishProspectCreation() {
        newProspectForm.getResidentialStateProvinceField(driver).clear();
        newProspectForm.getResidentialStateProvinceField(driver).sendKeys(STATE_SHORT);
        newProspectForm.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        newProspectForm.getSaveButton(driver).click();

        log.debug("Error is corrected!");
    }

    @Test
    public void testProspectCreate() {
        fillOutTheForm();
        newProspectForm.getSaveButton(driver).click();
        assertThat("State Abbreviation error was not thrown, or was incorrect.", newProspectForm.getStateAbbreviationError(driver)
                .getText(), is(STATE_ABBREVIATION_ERROR));
        correctStateErrorFinishProspectCreation();
        contactViewPage.waitForElementVisibility(driver, contactViewPage.getNameLabel(driver));
        assertThat("'Preferred Phone' field was empty or the number was incorrect.", contactViewPage.getPreferredPhoneField(driver)
                .getText(), is(MOBILE_PHONE));
        homePage.getContactsTab(driver).click();
        contactsPage.delayForNextAction(SHORT_INTERVAL_IN_MILLISECONDS);
        contactViewPage.getIndividualAccountLink(driver).click();
        individualAccountViewPage.waitForElementVisibility(driver, individualAccountViewPage.getAccountField(driver));
        assertThat("Account has wrong type.", individualAccountViewPage.getAccountField(driver).getText(), is(INDIVIDUAL_ACCOUNT));
        assertThat("Owner is not a team member.", individualAccountViewPage.getTeamMemberName(driver).getText(),
                containsString(TEAM_MEMBER));
    }

    @After
    public void tearDown() {
        super.deleteProspect();
        super.tearDown();
    }
}
