package day12;

import day12.SinglyLinkedList.Node;

public class CircularSinglyLinkedList {

	public static void main(String[] args) {
		CircularSinglyLinkedList.Node<Integer> node = new CircularSinglyLinkedList().new Node<Integer>(1);
		for(int i =2; i<=10; i++) {
			node.addNode(i);
		}

		Node dataNode = node.getHeadNode();
		int count = 0;
		while(count  < 30) {
			System.out.println(dataNode.data);
			dataNode = dataNode.next;
			count++;
		}

	}
	
	class Node<T> {
		T data;
		Node next;
		Node head;
		Node last;
		Node(T data) {
			this.data = data;
			head = this;
			last = head;
		}

		public void addNode(T data){
			Node temp = new Node(data);
			last.next = temp;
			last = temp;
			last.next = head;
		}

		public Node getHeadNode() {
			return head;
		}
	}

}
