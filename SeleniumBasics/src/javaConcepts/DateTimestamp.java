package javaConcepts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimestamp {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		//Wed Nov 08 11:48:41 CST 2023
		//customized date format ddMMyyyy_HHmmss
	
		DateFormat df =  new SimpleDateFormat("ddMMyyyy_HHmmss");
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
		

	}

}
