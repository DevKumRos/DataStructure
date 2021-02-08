package day2;

public class HallowTraiangle {

	public static void main(String[] args) {
		int n= 7 ;
		int m=7;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m;j++) {
				if( i==1 || j== 1|| j==(m-i+1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
