package doublyLinkedList;

public class Test {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		Node insertNode = new Node (10);
		Node insertNode2 = new Node (7);
		Node insertNode43 = new Node (43);
		Node insertEnd = new Node (54);
		list.insertFront(insertNode);
		list.insertFront(insertNode2);
		list.insertEnd(insertEnd);
		list.insert(insertNode43, 1);
		list.delete(insertNode43);
		
		list.display();
		
	}

}
