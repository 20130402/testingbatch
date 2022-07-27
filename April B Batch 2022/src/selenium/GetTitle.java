package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {

           System.setProperty("webdriver.chrome.driver","\\C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
           
           WebDriver driver =new ChromeDriver(); // upcasting
           driver.get("https://www.google.com/");
           String title=driver.getTitle();
           System.out.println(title);
	}

}
