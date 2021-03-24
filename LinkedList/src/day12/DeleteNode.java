package day12;

import day12.DeleteNode.Node;

public class DeleteNode {

	public static void main(String[] args) {
		DeleteNode.Node<Integer> node = new DeleteNode().new Node<Integer>(3);
		node.addNode(4);
		node.addNode(6);
		node.addNode(5);
		deleteNode(2, node);
		Node temp = node.getHeadNode();
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	
	private static Node deleteNode(int pos, Node node) {
		Node headNode = node.getHeadNode();
		if(headNode == null) {
			return null;
		}
		
		if(pos < 0 || pos >= node.size()) {
			return null;
		}
		
		Node temp = headNode;
		for(int i=0; i<pos-1; i++) {
			temp = temp.next;
		}
		
		Node deleteNode = temp.next;
		temp.next = deleteNode.next;
		deleteNode.next = null;
		return temp;
	}


	class Node<T> {
		T data;
		Node next;
		Node head;
		Node last;
		int counter = 0;
		Node(T data) {
			this.data = data;
			head = this;
			last = head;
			counter++;
		}

		public void addNode(T data){
			Node temp = new Node(data);
			last.next = temp;
			last = temp;
			counter++;
		}

		public Node getHeadNode() {
			return head;
		}
		
		public int size() {
			return counter;
		}
	}
}
