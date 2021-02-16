package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Constraints

1 <= N, M <= 100

-10^6 <= ar[i] <= 10^6

Output Format

Print sum(A+B) of matrices(A, B).

Sample Input 0

2 3
5 -1 3
19 8 4
4 5 -6
1 -2 12

Sample Output 
9 4 -3
20 6 16

Explanation 
5+4 -1+5 3+-6
19+1 8+-2 4+12

*/
public class MatrixAddition8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        String[] str = data.split(" ");
        int row = Integer.parseInt(str[0]);
        int col = Integer.parseInt(str[1]);
        int ar[][] = new int[row][col];
        int brd[][] = new int[row][col];
        ar = populateData(ar, br, row, col);
        brd= populateData(brd, br, row, col);
        calculateMatrixAddition(ar, brd, row, col);
	}
	
	private static void calculateMatrixAddition(int[][] ar, int[][] brd, int row, int col) {
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(ar[i][j]+brd[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static int[][] populateData(int[][] ar,BufferedReader br,int row,int col) throws IOException {
		for(int i =0; i<row; i++) {
        	String data = br.readLine();
        	String[] str = data.split(" ");
            for(int j=0; j<col; j++ ) {
	        	ar[i][j] = Integer.parseInt(str[j]);
	        }
        }
		return ar;
	}

}
