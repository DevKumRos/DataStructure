package day16;

import java.util.HashSet;

public class CyclicDetection {

	public static void main(String[] args) {
		Node<Integer> node = new Node(1);
		node.addNode(2);
		node.addNode(3);
		node.addNode(4);
		node.addNode(5);
		node.addNode(6);
		node.addNode(7);
		node.addNode(8);
		Node<Integer> temp = node.last;
		node.addNode(9);
		node.addNode(10);
		node.addNode(11);
		node.addNode(12);
		node.addNode(13);
		node.pointNode(temp);
		//findTheCyclicDetection(node.head);
		findTheCyclicDetectionTwoPointerTechnic(node.head);

	}

	private static void findTheCyclicDetectionTwoPointerTechnic(Node head) {
		if(head == null && head.next == null ) {
			return;
		}
		Node<Integer> pnt1 = head;
		Node<Integer> slowPointer = head;
		Node<Integer> fastPointer = head;
		Node<Integer> prev = null;
		while(fastPointer.next != null && fastPointer.next.next != null) {
			slowPointer = slowPointer.next;
			prev = fastPointer.next;
			fastPointer = prev.next;
			if(slowPointer == fastPointer) {
				Node<Integer> pnt2 = slowPointer;
				findPointIntersect(pnt1, pnt2);
				break;
			}
		}
		
		
	}

	private static void findPointIntersect(Node<Integer> pnt1, Node<Integer> pnt2) {
		 
		Node<Integer> prev = null;
		while(pnt1 != pnt2) {
			prev = pnt2;
			pnt1= pnt1.next;
			pnt2 = pnt2.next;
		}
		System.out.println("Point of Cyclic :"+prev.data+" --> "+pnt2.data);
		prev.next = null;
	}

	private static boolean findTheCyclicDetection(Node<Integer> node) {
		
		boolean status = false;
		if(node == null && node.next == null ) {
			return status;
		}
		HashSet<Node<Integer>> nodeSet = new HashSet<Node<Integer>>();
		Node prev = null;
		while(node != null) {
			if(nodeSet.contains(node)) {
				status = true;
				break;
			}
			nodeSet.add(node);
			prev = node;
			node = node.next;
		}
		//System.out.println("Point of Cyclic :"+prev.data+" --> "+node.data);
		return status;
	}

}
