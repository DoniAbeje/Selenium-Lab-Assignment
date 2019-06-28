import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PortalExportGrade {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "G:\\Documents\\Study\\3rd Year\\Second Semester\\Software Engineering II\\Lab\\Chrome driver\\chromedriver.exe");
        // Create a new instance of the Chrome driver
        WebDriver driver;
        driver = new ChromeDriver();

        //Launch Portal
        String url = "http://portal.aait.edu.et";
        driver.get(url);

        //Enter ID
        driver.findElement(By.id("identifierId")).sendKeys("ATR/6860/09");

        //Enter Password
        driver.findElement(By.cssSelector("input[type=password")).sendKeys("");

        //Click Log in button
        driver.findElement(By.cssSelector("input[type=submit")).click();

        //Navigate to grade tab

        // Close the driver
        driver.quit();
    }
}