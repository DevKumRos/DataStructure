package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * Input Format

The first line of input contains N, M - the size of the matrix. Its followed by N lines each containing M integers - elements of the matrix.

Constraints

1 <= N, M <= 200

-10^9 <= ar[i] <= 10^9

Output Format

Print the column wise sum, separated by newline.

Sample Input 
2 2
15 -11
5 2

Sample Output 
20
-9

Explanation 

15+5-->20 5+2-->-9*/
public class ColumnwiseSumMatrix {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String data = br.readLine();
        String[] str = data.split(" ");
        int row = Integer.parseInt(str[0]);
        int col = Integer.parseInt(str[1]);
        long ar[][] = new long[row][col];
        long brd[][] = new long[row][col];
        ar = populateData(ar, br, row, col);
        columnwiseSum(ar, row, col);
    }
    
    private static void columnwiseSum(long[][] ar, int row, int col) {
        for(int i=0; i<col; i++ ) {
            long sum =0;
            for(int j=0; j<row; j++) {
                sum= sum+ar[j][i];
            }
            System.out.println(sum);
        }
        
    }

    public static long[][] populateData(long[][] ar,BufferedReader br,int row,int col) throws IOException {
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
