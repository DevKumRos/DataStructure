package day1;

public class SignleLinePatterns {

	public static void main(String[] args) {
		int count =3;
		//One way 
		for(int i=0; i<count; i++) {
			for(int j=0;j<count;j++) {
					System.out.print("*");
				}
			System.out.println();
			}
		System.out.println("======================================");
		//Two way 
		for(int i=0; i<count; i++) {
			for(int j=0;j<count;j++) {
				if(j+1==count) {
					System.out.println("*");
				} else {
					System.out.print("*");
				}
			}
			    
		}
		
		
			    
		

	}

}
