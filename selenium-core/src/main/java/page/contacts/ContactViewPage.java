package page.contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.AbstractPocPage;

public class ContactViewPage  extends AbstractPocPage {

    private WebElement element = null;

    // SELECTORS

    /**
     * Returns "Preferred Phone" field from Contact View Page.
     * @param driver
     * @return
     */
    public WebElement getPreferredPhoneField(WebDriver driver) {
        element = driver.findElement(By.xpath("//div//span[text()='Preferred Phone']//parent::div//following-sibling::div//span[@dir='ltr']"));
        return element;
    }

    /**
     * Returns "Name" label from Contact View Page.
     * @param driver
     * @return
     */
    public WebElement getNameLabel(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@role='list']//div//span[.='Name']"));
        return element;
    }

    /**
     * Returns "Individual Account" link from Contact View Page.
     * @param driver
     * @return
     */
    public WebElement getIndividualAccountLink(WebDriver driver) {
        element = driver.findElement(By.xpath("//table//a[@title='Individual Account']"));
        return element;
    }

    /**
     * Returns Related Notes Link link from Contact View Page.
     * @param driver
     * @return
     */
    public WebElement getRelatedNotesLink(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@class='rlql-relatedListLink']//span[contains(@title,'Notes')]"));
        return element;
    }
}
