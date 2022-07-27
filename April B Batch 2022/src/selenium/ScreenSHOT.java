package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class ScreenSHOT {

	public static void main(String[] args) throws IOException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");

 File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 System.out.println(source);
 File dest=new File("C:\\Users\\WIN\\Desktop\\New folder\\abcd.jpg");
 FileHandler.copy(source, dest);
	}

}
