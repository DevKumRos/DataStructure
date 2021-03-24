package day15;

import java.util.Stack;

public class PalindromLinkedList {

	public static void main(String[] args) {
		Node<String> node = new Node("A");
		node.addNode("B");
		node.addNode("C");
		node.addNode("D");
		node.addNode("E");
		node.addNode("E");
		node.addNode("C");
		node.addNode("B");
		node.addNode("A");
		isPalindrome(node.head);
		//System.out.println("Its Palindrom :"+checkPalindromLinkedList(node.head, reverseNode));
	}

	private static void isPalindrome(Node<String> head) {
		Node<String> slow = head;
		Stack<String> pointer = new Stack<String>();
		int counter = 0;
		while(slow != null) {
			pointer.push(slow.data);
			slow = slow.next;
			counter++;
		}
		int len = 0;
		if(counter%2 != 0 ) {
			len = 1;
		}
		len = counter/2 +len;
		boolean status = true;
		while(len >= 0 ) {
			String dataStr = pointer.pop();
			if(head.data != dataStr) {
				System.out.println("Not a palindrom");
				status = false;
				break;
			}
			head = head.next;
			len--;
		}
		if(status)
			System.out.println("Its a palindrom");
	} 

}
