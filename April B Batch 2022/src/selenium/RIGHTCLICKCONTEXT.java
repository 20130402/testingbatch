package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RIGHTCLICKCONTEXT {

	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	//)	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10);
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@width='700'])[1]")));
		WebElement image = driver.findElement(By.xpath("(//li[contains(@class,'get-content u')])[1]"));
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(image, trash).perform();
	

}
}
