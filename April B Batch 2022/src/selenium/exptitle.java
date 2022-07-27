package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exptitle {

	public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver", "\\C:\\\\Users\\\\WIN\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe\\");
    
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
      String xyz =driver.getTitle();
     System.out.println(xyz);
    
      String exptitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
      if(xyz.equalsIgnoreCase(exptitle)){
    	  System.out.println("navigate right page");
    	  
      }
      else {
    	  System.out.println("navigate wrong page");
      }
    
	}

}
