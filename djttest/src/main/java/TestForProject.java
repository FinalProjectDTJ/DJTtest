import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestForProject {

    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe"); 

        WebDriver driver = new FirefoxDriver();


        driver.get("https://www.aliexpress.com/");


        driver.manage().window().maximize();

        waitTime(2000);
        
        WebElement xxx = driver.findElement(By.className("close-layer"));
        xxx.click();
        
        waitTime(3000);
        
        WebElement txtbox = driver.findElement(By.name("SearchText"));

        txtbox.sendKeys("bluetooth");

        waitTime(2000);
        
        WebElement btn = driver.findElement(By.className("search-button"));

        btn.click();
        
        waitTime(5000);

        System.out.println("This page title is: " + driver.getTitle());

        WebElement it = driver.findElement(By.partialLinkText("ORICO BTA"));

        it.click();

        waitTime(5000);
        
        ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        //driver.close();
        //driver.switchTo().window(tabs2.get(0));

        waitTime(5000);

        WebElement blueOne = driver.findElement(By.id("sku-1-173"));

        blueOne.click();
                
        waitTime(3000);

        WebElement redOne = driver.findElement(By.id("sku-1-10"));

        redOne.click();
                
        waitTime(3000);

        WebElement buyBtn = driver.findElement(By.className("buy-now-btn"));

        buyBtn.click();

        waitTime(2000);

        driver.switchTo().window(tabs2.get(0));
        driver.close();

        System.out.println("Close the main page of Aliexpress");

        tabs2 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(0));

        waitTime(8000);

        WebElement emailBox = driver.findElement(By.name("email"));

        emailBox.sendKeys("sen635@nu.edu");

        waitTime(1000);

        WebElement contactPerson = driver.findElement(By.name("contactPerson"));

        contactPerson.sendKeys("John Doe");

        waitTime(1000);

        WebElement addressBox = driver.findElement(By.name("address"));

        addressBox.sendKeys("9388 Lightwave Ave");

        waitTime(1000);

        WebElement mySelectElm = driver.findElement(By.cssSelector("select[class='ui-textfield ui-textfield-system']"));
        Select mySelect= new Select(mySelectElm);
        mySelect.selectByValue("California");

        waitTime(5000);

        WebElement myCitySelectElm = driver.findElement(By.xpath("//div/input[@name='city']/following::select"));
        Select myCitySelect= new Select(myCitySelectElm);
        myCitySelect.selectByValue("San diego");

        waitTime(1000);

        WebElement zipBox = driver.findElement(By.name("zip"));

        zipBox.sendKeys("92123");

        waitTime(1000);

        WebElement phoneBox = driver.findElement(By.name("mobileNo"));

        phoneBox.sendKeys("4085551234");

        waitTime(3000);

        WebElement orderOne = driver.findElement(By.className("ui-button ui-button-primary ui-button-medium sa-confirm"));
        //WebElement orderOne = driver.findElement(By.className("ui-button ui-button-primary ui-button-medium sa-confirm disabled"));

        orderOne.click();

        waitTime(5000);

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