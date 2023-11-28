package javaConcepts;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pass123");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(10000);
		
		//Timestampcode
		Date d = new Date();
		System.out.println(d);
		
		//Wed Nov 08 11:48:41 CST 2023
		//customized date format ddMMyyyy_HHmmss
	
		DateFormat df =  new SimpleDateFormat("ddMMyyyy_HHmmss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
		
		//Take screenshot
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(srcFile, new File(".\\Screenshots\\FB"+timeStamp+".PNG"));
		FileHandler.copy(srcFile, new File(".\\Screenshots\\FB"+timeStamp+".PNG"));
		
		
		driver.quit();
		

	}

}
