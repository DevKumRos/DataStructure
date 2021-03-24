package day13;


public class FindMidNode {

	public static void main(String[] args) {
		Node<Integer> node = new Node<Integer>(1);
		node.addNode(1);
		node.addNode(2);
		node.addNode(3);
		node.addNode(4);
		node.addNode(5);
		node.addNode(6);
		node.addNode(7);
		node.addNode(8);
		node.addNode(9);
		node.addNode(10);
		node.addNode(11);
		node.addNode(12);
		
		findTheMiddleNode(node.head);
	}

	private static void findTheMiddleNode(Node head) {
		Node slowNode = head;
		Node fastNode = head;
		while(fastNode.next != null && fastNode.next.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
		}
		if(fastNode.next != null) 
			System.out.println(slowNode.next.data);
		else
			System.out.println(slowNode.data);
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
