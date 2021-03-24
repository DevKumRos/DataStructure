package day15;
public class Node<T> {
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