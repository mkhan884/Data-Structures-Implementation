package singlyLinkedList;

public class Node {
	
	Node next;
	int data;
	
	public Node() {
		next = null;
		data = (Integer) null;
	}
	
	public Node (int element) {
		this.data = element;
		next = null;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node node) {
		next = node;
	}

	public int getData() {
		return data;
	}
	
	public void setData(int value) {
		data = value;
	}

}


