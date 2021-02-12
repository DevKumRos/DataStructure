package day3;

public class DiamondNumberPattern {

	public static void main(String[] args) {
		int num =5;
		for(int row=1; row<= num; row++ ) {
			for(int col=num; col>0; col--) {
				if(col<=row)
					System.out.print(col);
				else 
					System.out.print(" ");
			}
			if(row > 1) {
				for(int col =2; col<=row; col++) {
					System.out.print(col);
				}
			}
			System.out.println();
		}
		
		for(int row=1; row<num; row++ ) {
			System.out.print(" ");
			int counter = num - row;
			for(int col=1; col< num; col++) {
				if(col>=row)
				   System.out.print(counter--);
				else 
					System.out.print(" ");
			}
			
			for(int col=1; col<num-row; col++) {
				System.out.print(col+1);
			}
			
			
			System.out.println();
		}

	}

}
