package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POPUP3 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://nxtgenaiacademy.com/alertandpopup/");
driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
//driver.switchTo().alert().sendKeys("sdeff");
//driver.switchTo().alert().accept();
String data = driver.switchTo().alert().getText();
System.out.println(data);
driver.switchTo().alert().dismiss();


	}

}
