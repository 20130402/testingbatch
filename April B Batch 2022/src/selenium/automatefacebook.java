package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class automatefacebook {

	public static void main(String[] args) throws IOException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("(//input[contains(@class,'2IX_2-')])[1]")).sendKeys("233445");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("dfffgg");
driver.findElement(By.xpath("//a[@class='_14Me7y']")).click();
driver.findElement(By.xpath("//input[@maxlength='10']")).sendKeys("1234566");
String abc=driver.getTitle();
System.out.println(abc);
String xyz=driver.getCurrentUrl();
System.out.println(xyz);
//String page=driver.getPageSource();
 TakesScreenshot gfg = (TakesScreenshot) ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 
File dest=new File("C:\\Users\\WIN\\Desktop\\New folder\\uhhhuhuh.jpg");
FileHandler.copy((File) gfg, dest);
	}

}
