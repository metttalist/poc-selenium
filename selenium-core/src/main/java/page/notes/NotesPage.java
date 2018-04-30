package page.notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.AbstractPocPage;

public class NotesPage extends AbstractPocPage {

    private WebElement element = null;

    // SELECTORS

    /**
     * Returns Note Link by Title from Notes Page.
     * @param driver
     * @return
     */
    public WebElement getNoteTitleLink(WebDriver driver, String noteTitle) {
        element = driver.findElement(By.xpath("//a[@title='" + noteTitle + "']"));
        return element;
    }
}
