package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class pratice11 {

	public static void main(String[] args) throws IOException {

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe\\");
  WebDriver driver=new ChromeDriver();
  driver.get("https://unstop.com/home");
  driver.findElement(By.xpath("')//div[contains(@class,'con-quiz]")).click();
  
  File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  System.out.println(source);
  File dest=new File("C:\\Users\\WIN\\Desktop\\New folder\\abcd.jpg");
  FileHandler.copy(source, dest);
 // WebElement text = driver.findElement(By.xpath("//body[contains(@style,' 0px; paddi')]"));
//  String result = text.getText();
// System.out.println(result);
		  
  
  		
 
 
  
	}

}
