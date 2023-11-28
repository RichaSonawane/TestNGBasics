package testNGConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationBasics2 {
	 @Test
	  public void first() {
		  System.out.println("@test first");
	  }
	  
	  @Test
	  public void last() {
		  System.out.println("@test last");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("@beforemethod");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("@aftermethod");
	  }

}
