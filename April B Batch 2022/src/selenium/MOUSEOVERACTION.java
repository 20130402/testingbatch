package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSEOVERACTION {

	public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.opencart.com/");
driver.manage().window().maximize();
 WebElement xyz = driver.findElement(By.xpath("(//a[contains(@class,' dropdown-to')])[1]"));
 WebElement dest = driver.findElement(By.xpath("(//a[@class='nav-link'])[1]"));
Actions act=new Actions(driver);
act.moveToElement(xyz).moveToElement(dest).click().perform();
	}

}
