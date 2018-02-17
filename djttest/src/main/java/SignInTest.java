import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SignInTest {
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

        WebElement joinIt = driver.findElement(By.cssSelector("a[data-role='sign-link']"));

        joinIt.click();
        
        waitTime(5000);

        Actions action = new Actions(driver);
        
        for(int i=0; i<3; i++) {
        	action.sendKeys(Keys.TAB).perform();
        }
        action.sendKeys("sen632@nu.edu");
        waitTime(1000);
        action.sendKeys(Keys.TAB).perform();
        
        waitTime(1000);
        
        WebElement passBox = driver.switchTo().activeElement();
        passBox.sendKeys("abc12345");

        waitTime(1000);
        action.sendKeys(Keys.TAB).perform();
        waitTime(1000);
        action.sendKeys(Keys.ENTER).perform();

        //WebElement btnLogIn = driver.switchTo().activeElement();
//        WebElement btnLogIn = driver.findElement(By.id("fm-login-submit"));
        //btnLogIn.click();
               
    
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
