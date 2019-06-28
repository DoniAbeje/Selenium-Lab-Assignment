import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GmailReadNewEmails {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "G:\\Documents\\Study\\3rd Year\\Second Semester\\Software Engineering II\\Chrome driver\\chromedriver.exe");
        // Create a new instance of the Chrome driver
        WebDriver driver;
        driver = new ChromeDriver();

        //Launch Gmail
        String url = "http://www.gmail.com";
        driver.get(url);

        //Enter Email address
        driver.findElement(By.id("identifierId")).sendKeys("abeje.doni@gmail.com");

        //Click Next
        driver.findElement(By.id("identifierNext")).click();

        //Enter Password
        driver.findElement(By.cssSelector("input[type=password")).sendKeys("*********");

        //Click Log in button
        driver.findElement(By.cssSelector("input[type=submit")).click();

        //Get all subjects of new email
        List<WebElement> newElements = ((ChromeDriver) driver).findElements(By.cssSelector("tr span .zf"));
        System.out.println( "New Emails : " + newElements.size());

        //List all Subjects
        for (WebElement element: newElements) {
            System.out.println(element.getText());
        }
        // Close the driver
        driver.quit();
    }
}