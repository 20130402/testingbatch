package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAME2 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
driver.switchTo().frame(iframe1);
driver.findElement(By.xpath("//button[@type='button']")).click();
driver.switchTo().parentFrame();
driver.findElement(By.xpath("//a[@id='tryhome']")).click();


	}

}
