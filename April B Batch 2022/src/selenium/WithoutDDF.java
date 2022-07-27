package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithoutDDF {

	public static void main(String[] args) {


System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
ChromeOptions opt=new ChromeOptions();
opt.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver();
driver.get("https://kite.zerodha.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("OKP335");
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("WSX12345");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("7654321");
driver.findElement(By.xpath("//button[@type='submit']")).click();


	}

}
