package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectmont {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Select s=new Select(month);
	s.selectByValue("11");
	//s.selectByIndex(5);
	//s.selectByVisibleText("Dec");

}
}