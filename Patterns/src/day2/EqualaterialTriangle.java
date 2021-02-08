package day2;

public class EqualaterialTriangle {

	public static void main(String[] args) {
		int num =3;
		for(int row=1; row<= num; row++ ) {
			for(int col=num; col>0; col--) {
				if(col<=row)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			if( row>1 ) {
				for(int k=1; k<row;k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
