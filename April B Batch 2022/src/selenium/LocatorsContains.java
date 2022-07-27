package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsContains {

	public static void main(String[] args) {

      System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
      
      WebDriver driver=new ChromeDriver(); //upcasting
      driver.get("https://www.facebook.com/login/");
      driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[1]")).sendKeys("134@gfjgkgj");
      driver.findElement(By.xpath("//input[contains(@class,' _9npi')]")).sendKeys("sgfh");
      driver.findElement(By.xpath("//button[contains(@class,' _4jy0')]")).click();
	}

}
