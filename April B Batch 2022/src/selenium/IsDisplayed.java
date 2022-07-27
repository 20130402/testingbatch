package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
	driver.findElement(By.xpath("//input[@value='-1']")).click();
	//driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
	WebElement result = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
	
	 boolean display = result.isDisplayed();
	 System.out.println(display);
	 
	
	}
}
