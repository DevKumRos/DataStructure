package day2;

public class EqualaterialTriangle {

	public static void main(String[] args) {
		int num =5;
		for(int row=1; row<= num; row++ ) {
			for(int col=num; col>0; col--) {
				if(col<=row)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			 
			System.out.println();
		}

	}

}