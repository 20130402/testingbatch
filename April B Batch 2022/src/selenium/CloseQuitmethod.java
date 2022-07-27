package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuitmethod {

	public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\WIN\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
            
            WebDriver driver=new ChromeDriver();   //upcasting
            driver.get("https://www.amazon.in");
             Thread.sleep(5000);
             
             driver.navigate().to("https://web.whatsapp.com");
              Thread.sleep(3000);
              driver.navigate().back();
              Thread.sleep(5000);
               driver.navigate().forward();
               driver.quit();
            
            
            
	}

}
