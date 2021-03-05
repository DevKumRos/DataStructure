package day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSortingIndex {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int queue = Integer.parseInt(br.readLine());
        for(int i=0; i<queue; i++) {
            int num = Integer.parseInt(br.readLine());
            String[] strData = br.readLine().split(" ");
            int[] ar = new int[strData.length];
            for(int j=0; j<strData.length; j++) {
                ar[j] = Integer.parseInt(strData[j]);
            }
            findSelectionSort(ar);
            System.out.println();
        }
        
    }
    public static void findSelectionSort(int[] br) {
            for(int j=br.length-1; j>0; j--) {
                int pos = j, max=br[j];
                for(int k=j-1; k>=0; k--) {
                    if(max<=br[k]) {
                        pos = k;
                        max = br[k];
                      }
                }
                int x = br[j];
                br[j] = br[pos];
                br[pos] = x;
                System.out.print(pos +" ");
            }
    }

}
