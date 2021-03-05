package day12;

import day12.DoublyLinkedList.Node;

public class CircularDoubleLinkedList {

	public static void main(String[] args) {
		CircularDoubleLinkedList.Node<Integer> nodeData = new CircularDoubleLinkedList().new Node<Integer>(1);
		for(int i =2; i<=10; i++) {
			nodeData.addNode(i);
		}
		 System.out.println("Forward Travelling");
		 Node dataNode = nodeData.getHeadNode();
			int count = 0;
			while(count  < 20) {
				System.out.println(dataNode.data);
				dataNode = dataNode.next;
				count++;
			}
		 System.out.println("Reverse Travelling");
		 count = 0;
		 dataNode = dataNode.prev;
		 while(count  < 20) {
			 System.out.println(dataNode.data);
			 dataNode = dataNode.prev;
			 count++;
		 }
	

	}

	class Node<T> {
		 T data;
		 Node next;
		 Node prev;
		 Node head;
		 Node last;
		Node(T data) {
			this.data = data;
			head = this;
			last = head;
		}
		
		public void addNode(T data){
			Node temp = new Node(data);
			temp.prev = last;
			last.next = temp;
			last = temp;
			last.next = head;
			head.prev = last;
		}
		
		public Node getHeadNode() {
			return head;
		}
		
		public Node getTailNode() {
			return last;
		}
	}

}
