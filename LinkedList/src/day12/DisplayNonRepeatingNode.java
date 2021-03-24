package day12;


public class DisplayNonRepeatingNode {
	public static void main(String[] args) {
		Node<Integer> node = new Node<Integer>(1);
		node.addNode(1);
		node.addNode(1);
		node.addNode(2);
		node.addNode(2);
		node.addNode(3);
		node.addNode(4);
		node.addNode(5);
		node.addNode(5);
		node.addNode(6);
		node.addNode(6);
		node.addNode(7);
		node.addNode(7);
		node.addNode(7);
		//displayNonRepeatingNode(node.head);
		secondWay(node.head);
		

	}
	
	private static Node secondWay(Node<Integer> head) {
		if(head == null) {
			return head;
		}
		
		Node<Integer> temp = new Node<Integer>(0);
		Node<Integer> finalNode = temp;
		
		while(head != null) {
			int count = 0;
			Node<Integer> th = head;
			while(head != null && head.data == th.data) {
				count++;
				head = head.next;
			}
			if(count == 1) {
				temp.next = th;
				th.next = null;
				temp = temp.next;
			}
		}
		
		return finalNode.next;
		
	}

	private static void displayNonRepeatingNode(Node head) {
		
		if(head == null) {
			return ;
		}
		Node prev = head;
		Node temp = head;
		int counter = 1;
		Node nonRepearting = null;
		Node tempPrev = null;
		while(temp != null) {
			temp = temp.next;
			if(temp != null && prev.data != temp.data) {
				if(counter == 1 ) {
					if(tempPrev != null) {
						tempPrev.next  = prev;
						tempPrev =prev;
					} else {
					   tempPrev = prev;
					   nonRepearting = prev;
					  
					}
					
				}
				prev.next = temp;
				prev = temp;
				counter = 1;
			} else if(temp != null && prev.data == temp.data){
				counter++;
			}
			
		}
		
		if(temp== null &&  prev !=null) {
			if(counter == 1)
				tempPrev.next  = prev;
			else 
				tempPrev.next  = temp;
		}
		Node tempHead = nonRepearting;
		while(tempHead!= null) {
			System.out.print(tempHead.data+" ");
			tempHead = tempHead.next;
		}
		
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