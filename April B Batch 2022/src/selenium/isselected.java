package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {

	public static void main(String[] args) {

  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe\\");
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.facebook.com/r.php");
 WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
 
female.click();
boolean result = female.isSelected();

 System.out.println(result);
 if(result==true) {
	 System.out.println("element is selected");
 }
 else {
	 System.out.println("element is not selected");
 }
  
	}

}
