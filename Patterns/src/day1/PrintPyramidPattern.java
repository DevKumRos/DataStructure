package day1;

public class PrintPyramidPattern {

	public static void main(String[] args) {
		int numberOfRows =5; 
		for(int row=1; row<=numberOfRows; row++) {
			for(int colum=numberOfRows;colum>0;colum--) {
				if(colum <= row) 
					System.out.print("* ");
				else	
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
