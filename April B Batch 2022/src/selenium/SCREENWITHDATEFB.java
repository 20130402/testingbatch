package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SCREENWITHDATEFB {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.facebook.com/");
  Date d=new Date();
  System.out.println(d);
      String filename = d.toString().replace(":", "_").replace(" ", "_")+".png";
      File demo = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  File dest=new File("C:\\Users\\WIN\\Desktop\\New folder\\anerao.jpg"+filename);
 FileHandler.copy(demo, dest);

	}

}
