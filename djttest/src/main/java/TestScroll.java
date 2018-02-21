
	import org.openqa.selenium.By;
    import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class TestScroll {
	public static void main(String[] args) {
		
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();

		// Open ToolsQA web site
		String appUrl = "http://www.aliexpress.com/";
		driver.get(appUrl);

		waitTime(2000);
		
        WebElement xxx = driver.findElement(By.className("close-layer"));
        xxx.click();
        
        waitTime(2000);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		
		waitTime(2000);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		
		waitTime(2000);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		
		waitTime(2000);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
		
		waitTime(2000);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		waitTime(2000);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.UP);
		
		waitTime(2000);
		
		driver.findElement(By.tagName("body")).sendKeys(Keys.UP);
		
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
