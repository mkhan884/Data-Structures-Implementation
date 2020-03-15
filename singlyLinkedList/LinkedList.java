/**
 * @author Muhammad Khan
 * @Github mkhan884
 */
package singlyLinkedList;

public class LinkedList {
	Node head;
	int listSize;
	
	//Create a node, that serves as the beginning of the linked list.
	public LinkedList() {
		head = null;
		listSize =0;
	}
	
	/*
	 * 1. If head node is null, insert node to be the new head node.
	 * 2. If head node is not null, find next null node and insert it there.
	 * 3. Increase list size when a node is inserted.
	 * Note: Method only inserts at the beginning of the list or the end.
	 */
	public boolean insertNode (Node newNode) {
		if (head == null) {
			head = newNode;
			listSize++;
			return true;
		}
		else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			listSize++;
			return true;
		}
	}
	
	/*
	 * 1. Insert node at a specific index.
	 * 2. Check if the index to be inserted at is valid.
	 * 3. Loop to the index the newNode is to be inserted at.
	 * 4. Set newNode's next as the current Nodes next.
	 * 5. Set the current Node's next as the newNode.
	 * 6. Increment list size;
	 */
	public boolean insertNode(Node newNode, int index) {
		if (index > listSize || listSize <1) {
			System.out.println("Cannot insert.");
			return false;
		}
		else {
			int j=0;
			Node current = head;
			while (j!= index-1) {
				current = current.next;
				j++;
			}
			newNode.setNext(current.next);
			current.setNext(newNode);
			listSize++;
			return true;	
		}
	}
	
	/*
	 * 1. Method to delete a node from the list.
	 * 2. If the node with the data to be deleted is the head node, set the head node as the next node in the list and decrement list size.
	 * 3. If the node to be deleted is not the head node, set previous as the current node, and current as the next node to current.
	 * 4. Do this till current is now the node to be deleted.
	 * Note: By doing so we have a reference to the previous node to be deleted.
	 * 5. Set previous.next as the node to be deleted's next.
	 * 6. Decrement list size.
	 */
	public boolean deleteNode(Node deleteNode) {
		Node current = head;
		Node previous = null;
		
		if(current== deleteNode) {
			head = head.getNext();
			listSize--;
			return true;
		}
		else {
			while (current != deleteNode) {
				previous = current;
				current = current.next;
			}
			previous.next = current.next;
			listSize--;
			return true;
		}
		
	}
	
	/*
	 * 1. Loop through each node in the list and return its stored value.
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
