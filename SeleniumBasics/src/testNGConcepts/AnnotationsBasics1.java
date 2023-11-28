package testNGConcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsBasics1 {
	 @Test
	  public void abc() {
		  System.out.println("@test abc");
	  }
	  
	  @Test
	  public static void cde() {
	  System.out.println("@test cde");
	  }
	  
	    
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("beforeclass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("afterclass");
	  }

}
