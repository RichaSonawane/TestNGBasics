package javaConcepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentDropdown1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://collegeweeklive.com/go-signup
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://collegeweeklive.com/go-signup");
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS );
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Hi");
		
	}

}
