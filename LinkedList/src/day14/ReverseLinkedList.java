package day14;

public class ReverseLinkedList {
	

	public static void main(String[] args) {
		Node<Integer> node = new Node(1);
		node.addNode(3);
		node.addNode(4);
		node.addNode(5);
		node.addNode(10);
		node.addNode(12);
		node.addNode(13);
		Node<Integer> reverseNode = reverseLinkedList(node.head);
		while(reverseNode != null) {
			System.out.println(reverseNode.data);
			reverseNode = reverseNode.next;
		}
	}

	private static Node<Integer> reverseLinkedList(Node<Integer> head) {
		Node<Integer> current = head;
		Node<Integer> prev = null;
		Node<Integer> next = head;
		next =next.next;
		while(next != null) {
			current.next = prev;
			prev = current;
			current = next;
			next = next.next;
		}
		if(current != null) {
			current.next = prev;
			prev = current;
		}
		
		return prev;
	}
	

}
