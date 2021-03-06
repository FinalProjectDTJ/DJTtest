import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewAccTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe"); 

        WebDriver driver = new FirefoxDriver();


        driver.get("https://www.aliexpress.com/");


        driver.manage().window().maximize();

        waitTime(2000);
        
        WebElement xxx = driver.findElement(By.className("close-layer"));
        xxx.click();
        
        waitTime(5000);

        System.out.println("This page title is: " + driver.getTitle());

        WebElement joinIt = driver.findElement(By.cssSelector("a[data-role='join-link']"));

        joinIt.click();
        
        waitTime(5000);

        WebElement joinBtn = driver.findElement(By.className("join-btn"));

        joinBtn.click();

        waitTime(5000);

        WebElement emailNew = driver.findElement(By.id("email-ipt"));
        emailNew.sendKeys("djt_project@nu.edu");
        
        waitTime(1000);

        WebElement firstNameNew = driver.findElement(By.className("first-name"));
        firstNameNew.sendKeys("project");

        waitTime(1000);

        WebElement lastNameNew = driver.findElement(By.className("last-name"));
        lastNameNew.sendKeys("DJT");

        waitTime(1000);

        WebElement passWordNew = driver.findElement(By.id("password-ipt"));
        passWordNew.sendKeys("password");

        waitTime(1000);

        //-------------- try wrong password
        WebElement passWordVeri = driver.findElement(By.id("confirm-password-ipt"));
        passWordVeri.sendKeys("abc12345");

        waitTime(1000);

        WebElement btnCreate = driver.findElement(By.id("submit-btn"));
        btnCreate.click();
        
        waitTime(10000);
        passWordVeri.clear();
        waitTime(5000);
        passWordVeri.sendKeys("password");
        
        waitTime(1000);

        btnCreate.click();
    
    }
    
    static public void waitTime(int time){
        
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
