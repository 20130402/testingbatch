package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();  // upcasting  // chrome driver object used to open browser
		driver.get("https://www.amazon.in/"); // get method used to open url
		 
		Thread.sleep(5000);
		
		driver.navigate().to("https://web.whatsapp.com");
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
