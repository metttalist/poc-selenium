package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AbstractTest {

    protected WebDriver driver;
    protected static final int SHORT_INTERVAL_IN_MILLISECONDS = 1500;
    protected static final int MEDIUM_INTERVAL_IN_MILLISECONDS = 3000;

    public void setup() {
        System.setProperty("webdriver.chrome.driver",
                "C:\\dev\\poc-selenium\\src\\main\\resources\\browser\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        String baseUrl = "https://mutualofomaha--selenium.cs68.my.salesforce.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    public void tearDown() {
        driver.quit();
    }
}
