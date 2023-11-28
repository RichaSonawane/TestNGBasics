package testNGConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_loginTestNG {
	 WebDriver driver;
	  @Test
	  public void login() {
		driver.get("https://www.facebook.com/");
		  
		  driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		  driver.findElement(By.name("pass")).sendKeys("123456");
		  driver.findElement(By.name("login")).click();
		  
		  
	  }
	  @Parameters("browserName")
	  @BeforeClass
	  public void beforeClass(@Optional("chrome") String browserName) {
		  
		  if(browserName.equalsIgnoreCase("Chrome")) {
			  WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
		  }
		  else if(browserName.equalsIgnoreCase("firefox")){
			  WebDriverManager.firefoxdriver().setup();
			  driver = new FirefoxDriver();
		  } else if(browserName.equalsIgnoreCase("edge")){
			  WebDriverManager.edgedriver().setup();
			  driver = new EdgeDriver();
		  }
		  else {
			  System.out.println("Please enter browsername correctly");
		  }
		 
		  
		  driver.manage().window().maximize();
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
	  
}
