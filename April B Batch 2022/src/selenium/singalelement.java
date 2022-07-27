package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class singalelement {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); //upcasting
driver.get("https://www.facebook.com/login/");
driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
WebElement year =driver.findElement(By.xpath("//select[@title='Year']"));
Select s=new Select(year);
        boolean result=s.isMultiple();
        System.out.println(result);
        if(result==true) {
        	System.out.println("list is multiple selected");
        }
        else {
        	System.out.println(" list is single selected");
        }
	}

}
