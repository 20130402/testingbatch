package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeandPosition {

	public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
            
           
			 WebDriver driver=new ChromeDriver();  // upcasting
            driver.get("https://www.amazon.in/");
            
            Dimension d=new Dimension(300,400);
            
            driver.manage().window().setSize(d);
             Thread.sleep(4000);
             

             Point p=new Point(300,400);
           
             driver.manage().window().setPosition(p);
             


            
	}

}
