package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACTIONSCLASSFLIP {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	Actions options=new Actions(driver);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));
	options.moveToElement(electronics).perform();
	
	WebElement electronic = driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
	options.moveToElement(electronic).perform();
	
	
	}

}
