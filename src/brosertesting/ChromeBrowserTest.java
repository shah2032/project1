package brosertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = " https://opensource-demo.orangehrmlive.com/\n";
        // Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open the URL into Browser
        driver.get(baseUrl);
        //We give Implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Print the Title of the Page
        String title = driver.getTitle();
        System.out.println(title);

        // Print Current URL
        System.out.println("Current URL :" + driver.getCurrentUrl());

        //Get the Page Source
        System.out.println("Page source :" + driver.getPageSource());

        //Find the Login link element
        WebElement  username1 = driver.findElement(By.name("username"));

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
