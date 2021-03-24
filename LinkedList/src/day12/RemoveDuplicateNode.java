package day12;

import day12.SinglyLinkedList.Node;

public class RemoveDuplicateNode {

	public static void main(String[] args) {
		RemoveDuplicateNode.Node<Integer> node = new RemoveDuplicateNode().new Node<Integer>(1);
		node.addNode(1);
		node.addNode(1);
		node.addNode(2);
		node.addNode(2);
		node.addNode(3);
		node.addNode(3);
		node.addNode(5);
		node.addNode(5);
		node.addNode(5);
		node.addNode(6);
		node.addNode(7);
		node.addNode(7);
		node.addNode(8);
		node.addNode(8);
		removeDuplicatNode(node.head);
		Node head = node.head;
		while(head != null) {
			System.out.print(head.data+" ");
			head = head.next;
		}

	}
	
	private static void removeDuplicatNode(Node head) {
		Node prev = head;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			if(temp != null && prev.data != temp.data) {
				prev.next = temp;
				prev = temp;
			}
			if(temp== null &&  prev.next !=null) {
				prev.next = temp;
			}
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
		}

		public Node getHeadNode() {
			return head;
		}
	}

}
