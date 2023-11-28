package javaConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.yahoo.in");
		
		//xpath
		//And
		 //*[@attribute_name1='attribute_value1' and @attribute_name2='attribute_value2]
		//Or
		//*[@attribute_name1='attribute_value1' or @attribute_name2='attribute_value2]
		//contains
		////*[contains(@attribute_name,'attribute_value')]
		//Index
		////input[@type='text'])[position()=2]"))
		//text
		////tagname[text()='webpage text'];

	}

}
