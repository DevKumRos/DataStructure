package day1;

public class PrintMirrorTrianglePattern {

	public static void main(String[] args) {
		int count = 4;
		for(int row=1; row<=count; row++) {
			for(int colum=count;colum>0;colum--) {
				if(colum <= row) 
					System.out.print("*");
				else	
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
