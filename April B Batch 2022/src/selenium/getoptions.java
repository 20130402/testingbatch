package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
	WebElement year=	driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s=new Select(year);
		    List<WebElement> options=s.getOptions();
		          int size = options.size();
		          System.out.println("size of listbox: "+size);

	}

}
