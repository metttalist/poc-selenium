package page.accounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.AbstractPocPage;

public class IndividualAccountViewPage extends AbstractPocPage{

    private WebElement element = null;

    // SELECTORS

    /**
     * Returns "Individual Account" field from Individual Account View Page.
     * @param driver
     * @return
     */
    public WebElement getAccountField(WebDriver driver) {
        element = driver.findElement(By.xpath("//h1[@title='Individual Account']//span[@class='uiOutputText']"));
        return element;
    }
    /**
     * Returns Team Member name from Individual Account View Page.
     * @param driver
     * @return
     */
    public WebElement getTeamMemberName(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='teamMemberDetails']//a[@href='javascript:void(0);']"));
        return element;
    }
}
