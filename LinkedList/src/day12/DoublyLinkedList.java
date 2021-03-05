package day12;

public class DoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList.Node<Integer> nodeData = new DoublyLinkedList().new Node<Integer>(1);
		for(int i =2; i<=10; i++) {
			nodeData.addNode(i);
		}
		 System.out.println("Forward Travelling");
		 Node dataNode = nodeData.getHeadNode();
		 while(dataNode != null) {
			 System.out.println(dataNode.data);
			 dataNode = dataNode.next;
		 }
		 System.out.println("Reverse Travelling");
		 dataNode = nodeData.getTailNode();
		 while(dataNode != null) {
			 System.out.println(dataNode.data);
			 dataNode = dataNode.prev;
		 }
		
	}
	
 	class Node<T> {
		 T data;
		 Node next;
		 Node prev;
		 Node head;
		 Node last;
		Node(T data) {
			this.data = data;
			head = this;
			last = head;
		}
		
		public void addNode(T data){
			Node temp = new Node(data);
			temp.prev = last;
			last.next = temp;
			last = temp;
		}
		
		public Node getHeadNode() {
			return head;
		}
		
		public Node getTailNode() {
			return last;
		}
	}

}


