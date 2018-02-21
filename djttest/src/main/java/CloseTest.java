
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	public class CloseTest {
	public static void main(String[] args) {
		
		// Create a new instance of the FireFox driver
		WebDriver driver = new FirefoxDriver();

		// Open ToolsQA web site
		String appUrl = "http://www.aliexpress.com/";
		driver.get(appUrl);

		waitTime(2000);
		
		// Close browser
		driver.close();

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
