package singlyLinkedList;

public class Test {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		Node insert = new Node (5);
		Node insert2 = new Node (3);
		Node insert3 = new Node (1);
		Node insert4 = new Node (2);
		Node nodes5 = new Node (10);
		
		list.insertNode(insert);
		list.insertNode(insert2);
		list.insertNode(insert3);
		list.insertNode(insert4);
		
		list.insertNode(nodes5, 2);
		list.deleteNode(insert3);
		
		list.display();
	}

}
