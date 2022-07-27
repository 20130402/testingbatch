package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe\\");

 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com/login/");
 driver.findElement(By.xpath("//a[contains(@href,'/r.php?lo')]")).click();
  WebElement text = driver.findElement(By.xpath("//div[contains(@class,'_li _9bpz')]"));
   String result = text.getText();
   System.out.println(result);
	}

}
