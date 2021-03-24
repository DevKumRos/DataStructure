package day15;

import java.util.Stack;


public class AddTwoLinkedList {

	public static void main(String[] args) {
		Node<Integer> node = new Node(2);
		node.addNode(1);
		node.addNode(7);
		node.addNode(6);
		
		Node<Integer> node1 = new Node(4);
		node1.addNode(8);
		node1.addNode(3);
		Stack<Integer> firstNode = new Stack<Integer>();
		while(node != null) {
			firstNode.push(node.data);
			node = node.next;
		}
		Stack<Integer> secondNode = new Stack<Integer>();
		while(node1 != null) {
			secondNode.push(node1.data);
			node1 = node1.next;
		}
		Stack<Integer> finalNode = new Stack<Integer>();
		int quoient = 0;
		int reminder = 0;
		int sum = 0;
		while(!firstNode.isEmpty() && !secondNode.isEmpty()) {
			int data1 =firstNode.pop();
			int data2 =secondNode.pop();
			sum = data1+data2;
			quoient = addToStack(finalNode, quoient, sum);
		}
		while(!firstNode.isEmpty() ) {
			sum = firstNode.pop();
			quoient = addToStack(finalNode, quoient, sum);
		}
		
		while(!secondNode.isEmpty()) {
			sum =secondNode.pop();
			quoient = addToStack(finalNode, quoient, sum);
		}
		
		if(quoient != 0)
			finalNode.push(quoient);
		
		while(!finalNode.isEmpty()) {
			System.out.println(finalNode.pop());
		}

	}

	private static int addToStack(Stack<Integer> finalNode, int quoient, int sum) {
		int reminder;
		if(quoient != 0)
			sum =sum+quoient;
		
		reminder = sum%10;
		quoient = sum/10;
		finalNode.push(reminder);
		return quoient;
	}

}
