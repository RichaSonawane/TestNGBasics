package javaConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsAndNavigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://retail.onlinesbi.sbi");

		driver.findElement(By.className("classicTxt")).click();

		// for right click not allowed go to setting=>more tools=>developers tool
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.id("Button2")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.partialLinkText("New User ? Register")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

		// NAvigate commands below
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
