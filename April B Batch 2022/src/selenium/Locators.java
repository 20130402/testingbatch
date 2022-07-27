package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

          System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
          
          WebDriver driver=new ChromeDriver();
          driver.get("https://www.facebook.com/login/");
          Thread.sleep(3000);
          
          driver.findElement(By.xpath("//input[@type='text']")).sendKeys("212364");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sdklhhgf");
          Thread.sleep(2000);
          driver.findElement(By.xpath("//button[@value='1']")).click();
          
          
          
          
	}

}
