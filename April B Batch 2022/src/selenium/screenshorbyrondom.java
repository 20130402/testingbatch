package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshorbyrondom {

	public static void main(String[] args) throws IOException {

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
WebDriver driver =new ChromeDriver();
driver.get("https://www.flipkart.com");

    File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    
    String random=RandomString.make(2);
    
    
     File dest=new File("C:\\Users\\WIN\\Desktop\\New folder\\test"+random+".jpg");
     FileHandler.copy(source, dest);
	}

}
