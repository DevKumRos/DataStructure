package day12;

public class SinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList.Node<Integer> node = new SinglyLinkedList().new Node<Integer>(1);
		for(int i =2; i<=10; i++) {
			node.addNode(i);
		}

		Node dataNode = node.getHeadNode();
		while(dataNode != null) {
			System.out.println(dataNode.data);
			dataNode = dataNode.next;
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

