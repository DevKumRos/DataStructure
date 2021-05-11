package day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackFindMaxNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        Stack<Integer> dataStack = new Stack<Integer>();
        Stack<Integer> maxStack = new Stack<Integer>();
        int maxNumber = Integer.MIN_VALUE;
        for(int i=0; i<str.length; i++) {
        	int data = Integer.parseInt(str[i]);
        	dataStack.push(data);
        	maxNumber = Math.max(maxNumber, data);
        	maxStack.push(maxNumber);
        }
        
        removeElement(dataStack,  maxStack, 2);
	}

	private static void removeElement(Stack<Integer> dataStack, Stack<Integer> maxStack, int noOfElement) {
		for(int i = 0; i< noOfElement; i++) {
			dataStack.pop();
			maxStack.pop();
		}
		System.out.println(maxStack.lastElement());
		
	}

	
	

}
