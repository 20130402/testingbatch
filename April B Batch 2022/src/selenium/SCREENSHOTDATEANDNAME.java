package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SCREENSHOTDATEANDNAME {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/");
Thread.sleep(2000);
Date s=new Date();
System.out.println(s);
 String filename = s.toString().replace(":", "_").replace(" ", "_")+".png";
System.out.println(filename);
        File get = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
System.out.println(get);
File demo=new File("C:\\Users\\WIN\\Desktop\\New folder\\sandeep.jpg"+filename);
FileHandler.copy(get, demo);
	}

}
