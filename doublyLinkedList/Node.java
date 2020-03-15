package doublyLinkedList;

public class Node {
	
	Node next;
	Node prev;
	int data;
	
	public Node() {
		data =(Integer) null;
		next = null;
		prev = null;
	}
	
	public Node (int data) {
		this.data = data;
		next = null;
		prev = null;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node node) {
		next = node;
	}

	public Node getPrev () {
		return prev;
	}
	
	public void setPrev(Node node) {
		prev = node;
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int value) {
		data = value;
	}
}
