package day3;

public class DiamondNumberDigits {

	public static void main(String[] args) {
		int num =5;
		for(int row=1; row<= num; row++ ) {
			int counter =1;
			for(int col=num; col>0; col--) {
				if(col<=row)
					System.out.print(counter++);
				else 
					System.out.print(" ");
			}
			--counter;
			if(row > 1) {
				for(int col =1; col<=row-1; col++) {
					System.out.print(--counter);
				}
			}
			System.out.println();
		}
		for(int row=1; row<num; row++) {
			System.out.print(" ");
			int counter = 1;
			for(int col =1; col<num; col++) {
				if(col >= row)
					System.out.print(counter++);
				else 
					System.out.print(" ");
			}
			counter--;
			for(int col =1; col<num-row; col++) {
				System.out.print(--counter);

			}
			System.out.println();
		}

	}

}
