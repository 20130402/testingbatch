package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchbrowserfirefox {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\WIN\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.amazon.in/");
}
}

