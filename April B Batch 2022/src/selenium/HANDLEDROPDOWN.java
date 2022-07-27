package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HANDLEDROPDOWN {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement drpcountry = driver.findElement(By.id("input-country"));
		Select country=new Select(drpcountry);
	//country.selectByVisibleText("Denmark");
	
		country.selectByIndex(0);
	//select options from drop withod using methods
		List<WebElement> alloptions = country.getOptions();
		for(WebElement option:alloptions) {
			if(option.getText().equals("Cuba")) {
				option.click();
				break;
			}
		}
			
		}

}
