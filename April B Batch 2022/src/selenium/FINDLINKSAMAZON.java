package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FINDLINKSAMAZON {

	public static void main(String[] args) {

  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.get("https://www.amazon.in/");
  List<WebElement> links = driver.findElements(By.xpath("//a"));
  System.out.println(links.size());
  
  for(int a=0;a<links.size();a++) {
	 String data = links.get(a).getText()+":"+links.get(a).getAttribute("href");
	 System.out.println(data);
  }
	}

}
