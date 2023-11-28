package javaConcepts;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = "123,456,789,112,334,222";
		String[] xyz = abc.split(",");
		System.out.println(xyz);
		
		//print values in the array
		for(int i=0;i< xyz.length; i++) {
			System.out.println(xyz[i]);
		}
	}

}
