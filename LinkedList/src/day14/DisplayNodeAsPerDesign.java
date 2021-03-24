package day14;

public class DisplayNodeAsPerDesign {
	/**
	 * GIVEN : 7 -> 4 -> 10 -> 3 ->9->1 ->8 -> 14
     * RESULT: 7 -> 3 -> 9 ->1 ->4 -> 10 -> 8 -> 14
	 */

	public static void main(String[] args) {
		Node<Integer> node = new Node(7);
		node.addNode(4);
		node.addNode(10);
		node.addNode(3);
		node.addNode(9);
		node.addNode(1);
		node.addNode(8);
		node.addNode(12);
		node.addNode(13);
		node.addNode(17);
		node.addNode(14);
		Node<Integer> nodeTest = node;
		Node oddNode = rearrangeNodes(node);
		while(oddNode != null) {
			System.out.println(oddNode.data);
			oddNode = oddNode.next;
		}
		

	}

	private static Node rearrangeNodes(Node head) {
		if(head == null) 
			return null;
		Node oddCurrent = new Node(0);
		Node evenCurrent = new Node(0);
		Node temp = head;
		Node finalNode = oddCurrent;
		Node finalEvenNode = evenCurrent;
		while(temp != null) {
			if((Integer)temp.data%2 != 0) {
				oddCurrent.next = temp;
				oddCurrent = oddCurrent.next;
			} else {
				evenCurrent.next = temp;
				evenCurrent = evenCurrent.next;
			}
			temp = temp.next;
		}
		evenCurrent.next = null;
		oddCurrent.next = finalEvenNode.next;
		
		return finalNode.next;
	}

}
