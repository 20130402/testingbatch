package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	 WebDriver driver =new ChromeDriver();
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	    
	    // id & name locators
	    driver.findElement(By.id("search_query_top")).sendKeys("T_shirts");
	    driver.findElement(By.name("submit_search")).click();
           driver.close();
}
}