package day18;

import java.util.Stack;

public class ReverseStringWord {

	public static void main(String[] args) {
		String words = "Kumar from kkp";
		String[] strArr = words.split(" ");
		Stack<String> charStack = new Stack<String>();
		for(String data : strArr ) {
			charStack.push(data);
			charStack.push(" ");
			
		}
		charStack.pop();
		while(charStack.size()>0) {
			System.out.print(charStack.pop());
		}
		

	}

}
