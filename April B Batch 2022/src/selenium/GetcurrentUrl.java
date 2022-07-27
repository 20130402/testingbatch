package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetcurrentUrl {

	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	   
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.amazon.in");
	    
	   String url=driver.getCurrentUrl();
	   System.out.println(url);
	   driver.switchTo().newWindow(WindowType.TAB);
	   driver.get("https://web.whatsapp.com");
	    
	   driver.switchTo().newWindow(WindowType.TAB);
	   driver.get("https://www.facebook.com");
	   driver.close();
	   driver.quit();
	}

}
