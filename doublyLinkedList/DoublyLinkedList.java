/**
 * @author Muhammad Khan
 * @Github mkhan884
 */
package doublyLinkedList;

public class DoublyLinkedList {
	Node head;
	Node tail;
	int listSize;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
		listSize=0;
	}
	
	/*
	 * 1. Method to insert a node at the front of the list.
	 * 2. If the head node is null, then replace that node with the node to be added.
	 * 3. If the head node is not null, then add a node in front.
	 * 4. Reference that nodes next as the head node, and the head nodes previous as the node.
	 * 5. Make the new node added as the head node.
	 * 6. Increment list size.
	 */
	public boolean insertFront(Node node) {
		if (head == null) {
			head = node;
			node.next = head.next;
			node.prev = null;
			listSize++;
			return true;
		}
		else {
			Node current = head;
			current.prev = node;
			node.next = current;
			node.prev = null;
			head=node;
			listSize++;
			return true;
		}
	}
	
	/*
	 * 1. Method to insert at the end of the list.
	 * 2. Find the node whose next pointer is null.
	 * 3. Make its next pointer point to the node.
	 * 4. Make the nodes next pointer null and make its previous as the current node.
	 * 5. Increment list size.
	 */
	public boolean insertEnd(Node node) {
		Node current = head;
		while (current.next!= null) {
			current = current.next;
		}
		node.prev = current;
		node.next = null;
		current.next = node;
		listSize++;
		return true;	
	}
	
	/*
	 * 1. Method to insert at a specific index.
	 * 2. Check to see if the index is valid.
	 * 3. Loop to the node at the specific index.
	 * 4. Have a previous pointer that references the node behind the node specified by the index.
	 * 5. Set the previous nodes next as the current node.
	 * 6. Set the current nodes previous as the current node.
	 * 7. Set the nodes next as the current node, and set its previous as the previous node.
	 * 8. Increment list size and return true.
	 */
	public boolean insert(Node node, int index) {
		if (index <1 || index > listSize) {
			System.out.println("Cannot insert, index not valid.");
			return false;
		}
		else {
			Node current = head;
			Node previous = null;
			for (int i=0; i<index; i++) {
				previous = current;
				current = current.next;
			}
			previous.setNext(node);
			current.setPrev(node);
			node.setNext(current);
			node.setPrev(previous);
			listSize++;
			return true;
		}
	
	}
	
	/*
	 * 1. Method to delete a node from the list.
	 * 2. Loop to the node to be deleted and have a previous reference.
	 * 3. Set previous nodes next as the node to be deleted's next;
	 * 4. Set the current node to be the next node in front of the current node.
	 * 5. Set currents previous as the previous node.
	 * 6. Decrement the list.
	 */
	public boolean delete(Node deleteNode) {
		Node current = head;
		Node previous = null;
		while (current != deleteNode) {
			previous = current;
			current = current.next;
		}
		previous.setNext(deleteNode.getNext());
		current = current.getNext();
		current.setPrev(previous);
		listSize--;
		return true;
	}
	
	
	/*
	 * 1. Loop through each node in the list and return its stored data value.
	 */
	public void display() {
		Node current = head;
		
		if (head == null) {
			System.out.println("List is empty");
		}
		else {
			while (current != null) {
				System.out.print(current.getData() + " ");
				current = current.getNext();
			}
		}
		System.out.println();
	}
	
	
	
}