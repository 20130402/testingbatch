package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplaymethod {

	public static void main(String[] args) {

  System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.facebook.com/r.php");
  WebElement male = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
  male.click();
    boolean result = male.isSelected();
    System.out.println(result);
	}

}
