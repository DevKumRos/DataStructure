package day14;



public class MergeLinkedListBothSide {

	/**
	 *  1 -> 3 -> 4 -> 5 -> 10 -> 12 -> 13
	 *  1 -> 13 -> 3 -> 12 -> 4 -> 10 ->5
	 * @param args
	 */
	public static void main(String[] args) {
		Node<Integer> node = new Node(1);
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
		Node<Integer> midNode = findTheMiddleNode(node.head);
		Node<Integer> reverseNode = reverseLinkedList(midNode);
		midNode = mergeNode(node.head, reverseNode);
		while(midNode != null) {
			System.out.println(midNode.data);
			midNode = midNode.next;
		}
	}
	
	
	

	private static Node mergeNode(Node mainNode, Node reverseNode) {
		Node temp =  mainNode.next;
		Node current = mainNode;
		int count = 1;
		while(reverseNode != null && temp != null) {
			if(count%2 != 0) {
				current.next = reverseNode;
				reverseNode = reverseNode.next;
			} else {
				current.next = temp;
				temp = temp.next;
				
			}
			current = current.next;
			count++;
		}
		
		return mainNode;
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
	

	private static Node findTheMiddleNode(Node head) {
		Node slowNode = head;
		Node fastNode = head;
		while(fastNode.next != null && fastNode.next.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
		}
		if(fastNode.next != null) 
			return slowNode.next;
		else
			return slowNode;
	}
}
