package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SCREENSHOTFORLOOP {

	public static void main(String[] args) throws IOException {

       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe\\");
       		
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.amazon.in/");
     for(int i=1;i<=10;i++) {
     
     File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     File dest=new File("C:\\Users\\WIN\\Desktop\\New folder\\abcd"+i+".jpg");
     FileHandler.copy(source, dest);

     
	}
	}
}
