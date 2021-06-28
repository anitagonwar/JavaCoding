//11. Write a java program to implement your own singly linked list in which delete method deletes an given element in the singly linked list

package SinglyLinkedList;

public class SinglyLinkedListDeleteNode {

	public static void main(String[] args) throws Exception {
		SinglyLinkedList linkedList = new SinglyLinkedList(); // creation of Linked List
		 
		linkedList.insertFirst("AZX123","BMW", 1);
		linkedList.insertFirst("AWX321","CHEVY", 3);
		linkedList.insertFirst("WQZ890","MDX", 5);
		linkedList.insertFirst("AVB","RDX", 7);
		linkedList.insertFirst("POS","HondaCRV", 9);
        
		linkedList.displayLinkedList();		
		linkedList.deleteSpecificNode("AVB");
		linkedList.displayLinkedList();
	}

}
