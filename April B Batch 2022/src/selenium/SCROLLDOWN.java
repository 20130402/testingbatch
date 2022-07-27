package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SCROLLDOWN {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe\\");
    		
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.countries-ofthe-world.com/flags-of-the-world-html");
	   //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//a[text()='World Flags']")).click();
	     JavascriptExecutor js=(JavascriptExecutor)driver;
	     //scroll down
	     js.executeScript("window.scrollBy(0,2000)");
	     //scroll up in pixel
	     Thread.sleep(5000);
	     js.executeScript("window.scrollBy(0,-1000)");
	}

}
