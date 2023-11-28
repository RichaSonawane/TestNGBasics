package javaConcepts;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropdown {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(5000);
		
//		driver.findElement(By.id("month"));
		
		Select s = new Select(driver.findElement(By.id("month")));
		s.selectByVisibleText("Aug");
		
		Select day = new Select(driver.findElement(By.name("birthday_day")));
		day.selectByValue("15");
		
		Select year =  new Select(driver.findElement(By.id("year")));
		year.selectByValue("1947");
		

		
		

	}

}
