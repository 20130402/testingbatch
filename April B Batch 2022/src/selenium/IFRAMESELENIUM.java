package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAMESELENIUM {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
  driver.manage().window().maximize();
  driver.switchTo().frame("packageListFrame");
  driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
  
	}

}
