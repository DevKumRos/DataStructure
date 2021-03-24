package day14;

public class Merge2SortedLinkedList {
	
	/***
	 * m length of one linkedlist & n length of 2 linkedlist
	 * Time Complexity  O(min(size of n or size of m) 
	 * Space Complexity O(1)
	 * @param args
	 */

	public static void main(String[] args) {
		Node<Integer> node = new Node<Integer>(-4);
		node.addNode(-1);
		node.addNode(2);
		node.addNode(5);
		node.addNode(6);
		node.addNode(9);
		node.addNode(10);
		node.addNode(11);
		node.addNode(22);
		
		Node<Integer> node1 = new Node<Integer>(-5);
		node1.addNode(-3);
		node1.addNode(3);
		node1.addNode(7);
		node1.addNode(8);
		node1.addNode(14);
		node1.addNode(18);
		node1.addNode(24);
		
		Node<Integer> findNode =  mergeSortedLinkedList(node, node1);
		while(findNode != null ) {
			System.out.println(findNode.data);
			findNode = findNode.next;
		}
		

	}

	private static Node<Integer> mergeSortedLinkedList(Node<Integer> node, Node<Integer> node1) {
		Node<Integer> result = new Node<Integer>(0);
		Node<Integer> temp = result;
		while(node != null && node1 != null) {
			if(node.data >node1.data) {
				result.next = node1;
				node1 = node1.next;
			} else {
				result.next = node;
				node = node.next;
			}
			result = result.next;
		}
		
		if(node != null) {
			result.next = node;
		}
		
		if(node1 != null) {
			result.next = node1;
		}
		return temp.next;
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