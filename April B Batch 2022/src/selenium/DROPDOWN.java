package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DROPDOWN {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("System.setProperty(\"webdriver.gecko.driver\", \"C:\\\\Users\\\\WIN\\\\Downloads\\\\geckodriver-v0.31.0-win64\\\\geckodriver.exe\");\r\n"
		+ "	WebDriver driver=new FirefoxDriver();");
driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//driver.manage().window().minimize();
WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
Actions act=new Actions(driver);
act.moveToElement(more).contextClick().build().perform();


	}

}
