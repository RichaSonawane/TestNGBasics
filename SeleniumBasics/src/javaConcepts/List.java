package javaConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.List;
import io.github.bonigarcia.wdm.WebDriverManager;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		
		driver.get("https://collegeweeklive.com/go-signup");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//edit boxes on page
		java.util.List<WebElement>  inputBox = driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
		System.out.println("Input boxes are "+ inputBox.size());
		
		//no of  checkboxes
		java.util.List<WebElement> checkBox = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("Input checkboxes are "+ checkBox.size());
		
		
		
		
		
		
		
		
	}

}
