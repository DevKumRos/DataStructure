package day1;

public class PrintTrianglePattern {
 
	public static void main(String[] args) {
		int count = 5;
		for(int row=0; row<count; row++) {
			for(int colum=0;colum<=row;colum++) {
					System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============================**********************==========================");
		
		for(int row=0; row<count; row++) {
			for(int colum=0;colum<=row;colum++) {
					System.out.print(row+1 );
			}
			System.out.println();
		}
		System.out.println("==============================**********************==========================");
		for(int row=0; row<count; row++) {
			for(int colum=0;colum<=row;colum++) {
					System.out.print(colum+1 );
			}
			System.out.println();
		}
		System.out.println("==============================**********************==========================");
		int counter=1;
		for(int row=0; row<count; row++) {
			for(int colum=0;colum<=row;colum++) {
				
					System.out.print(counter++);
			}
			System.out.println();
		}
		System.out.println("==============================**********************==========================");
	}
}
