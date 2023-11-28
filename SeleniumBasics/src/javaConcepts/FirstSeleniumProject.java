package javaConcepts;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.justrechargeit.com/");
		driver.navigate().to("https://www.justrechargeit.com/");
		
		//to maximize
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Sign in")).click();
		driver.findElement(By.name("txtUserName")).sendKeys("test1");
		driver.findElement(By.name("txtPasswd")).sendKeys("pass");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("imgbtnSignin")).click();
	
//		to current url
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		
	}

}
