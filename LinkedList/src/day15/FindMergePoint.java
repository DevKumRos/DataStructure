package day15;

import java.util.HashSet;

public class FindMergePoint {

	public static void main(String[] args) {
		Node<Integer> node = new Node(2);
		node.addNode(1);
		node.addNode(7);
		node.addNode(8);
		node.addNode(5);
		Node<Integer> node1 = new Node(4);
		node1.addNode(8);
		node.addNode(6);
		node1.last.next = node.last;
		node.addNode(5);
		//findMergePointOfLinkedList(node, node1);
		secondApproach(node, node1);
	}

	private static void secondApproach(Node<Integer> node, Node<Integer> node1) {
		int firstCounter = 0;
		int secondCounter = 0;
		Node<Integer> tempNode = node;
		Node<Integer> tempNode1 = node1;
		while(node != null) {
			firstCounter++;
			node = node.next;
		}
		while(node1 != null) {
			secondCounter++;
			node1 = node1.next;
		}
		int diff = 0;
		if(firstCounter > secondCounter) {
			diff = firstCounter - secondCounter;
			while(diff>0) {
				tempNode = tempNode.next;
				diff--;
			}
		} else {
			diff = secondCounter-firstCounter;
			while(diff>0) {
				tempNode1 = tempNode1.next;
				diff--;
			}
		}
		
		while(tempNode != null && tempNode1 != null) {
			if(tempNode == tempNode1) {
				break;
			}
			tempNode =tempNode.next;
			tempNode1 = tempNode1.next;
		}
		System.out.println(tempNode.data);
	}

	private static void findMergePointOfLinkedList( Node<Integer> node, Node<Integer> node1) {
		int counter = 0;
		HashSet<Node> setNode = new HashSet<Node>();
		while(node != null) {
			setNode.add(node);
			node = node.next;
			counter++;
		}
		while(node1 != null) {
			setNode.add(node1);
			counter++;
			if(setNode.size() != counter)
				break;
			node1 = node1.next;
			
		}
		System.out.println(node1.data);
	}

}
