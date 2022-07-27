package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListOptions {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe\\");
		
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login");
driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]")).click();
WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
Select s=new Select(year);
List<WebElement>options=s.getOptions();
System.out.println(options.size());
for(int i=0;i<=options.size()-1;i++) {
	System.out.println(options.get(i).getText());
}
	}

}
