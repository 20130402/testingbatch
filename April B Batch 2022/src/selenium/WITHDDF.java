package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WITHDDF {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\sandeep.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://kite.zerodha.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
	String pwd = sh.getRow(1).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String pin = sh.getRow(2).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	

}
}
