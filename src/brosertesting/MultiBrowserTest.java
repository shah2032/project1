package brosertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTest {
    static String browser = "Edge";
    static String baseUrl = " https://opensource-demo.orangehrmlive.com/\n";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();

        }else{
            System.out.println("Wrong Browser name");
        }
        driver.manage().window().maximize();
        driver.get(baseUrl);
        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

          System.out.println(driver.getTitle());
        //Find the Login link element
        WebElement username1 = driver.findElement(By.name("username"));

        // Click on the link element
       username1.click();
        // find the Email Field Element
        WebElement username = driver.findElement(By.name("username"));
        //Type the Username to username field element
        username.sendKeys("Admin");

        driver.findElement(By.name("password")).sendKeys("admin123");
        // Close the Browser
        driver.close();
        driver.quit();
    }

}
