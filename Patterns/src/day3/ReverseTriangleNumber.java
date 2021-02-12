package day3;

public class ReverseTriangleNumber {

	public static void main(String[] args) {
		int num = 4;
		for(int i=1; i<num; i++) {
			System.out.print(" ");
			int counter =num-i;
			for(int j= 1; j< num; j++) {
				if(j >= i) {
					System.out.print(counter--);
				} else {
					System.out.print(" ");
				}
				
			}
			for(int j=1; j<(num-i); j++ ) {
				System.out.print(j+1);
			}
			System.out.println();
		}

	}

}
