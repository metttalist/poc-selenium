package page;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * This AbstractPocPage class is used to support common functionality for POC test cases
 */
public class AbstractPocPage {

    private WebElement element = null;
    private WebDriver driver;
    private JavascriptExecutor js;
    private static final int LONG_INTERVAL_IN_SECONDS = 60;

    // SELECTORS

    /**
     * Returns "Delete" button from any Modal Container in the App.
     * @param driver
     * @return
     */
    public WebElement getModalContainerDeleteButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//div//button[@title='Delete']//span[.='Delete']"));
        return element;
    }

    /**
     * Returns "Select List View" button from any page in the App.
     * @param driver
     * @return
     */
    public WebElement getSelectListViewButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@title='Select List View']"));
        return element;
    }

    public WebElement getElementIfPresent(By by) {
        WebElement element = null;
        try {
            element = driver.findElement(by);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return element;
    }

    //HELPER METHODS

    protected String getPageTitle(WebDriver driver) {
        return driver.getTitle().trim();
    }
    public void waitForElementVisibility(WebDriver driver, WebElement element) throws TimeoutException {
        WebDriverWait wait = new WebDriverWait(driver, LONG_INTERVAL_IN_SECONDS);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void delayForNextAction( final int intervalInMilliseconds) {
        try {
            TimeUnit.MILLISECONDS.sleep(intervalInMilliseconds);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
