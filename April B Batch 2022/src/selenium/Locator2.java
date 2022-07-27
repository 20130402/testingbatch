package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {

	public static void main(String[] args) {

     System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/login/");
     driver.findElement(By.xpath("//*[@id=\"login_link\"]/a[2]")).click();
     driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("mahesh");
    // driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kute");
   //  driver.findElement(By.xpath("//input[@data-type='text']")).sendKeys("1454768");
     driver.findElement(By.xpath("//input[@type='text'])[1]")).clear();
    // driver.findElement(By.xpath("\"//input[@name='lastname']")).clear();
     
	}

}
