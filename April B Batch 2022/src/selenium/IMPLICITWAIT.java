package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IMPLICITWAIT {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//selenium version 3.14.59
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		driver.findElement(By.linkText("//button[@aria-label='No thanks']")).click();
		
	}
}
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


