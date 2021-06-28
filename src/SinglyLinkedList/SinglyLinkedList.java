package SinglyLinkedList;

public class SinglyLinkedList {
	 private ListNode first; // Reference to the first link on list
	 
	    /**
	     * LinkedList constructor
	     */
	    public SinglyLinkedList(){
	           first = null;
	    }
	 
	    /**
	     * Insert New Node at first position
	     */
	    public void insertFirst(String vehicleNum, String vehiclemodel, int duration) {
	    	ListNode newNode = new ListNode(vehicleNum,vehiclemodel,duration); //Creation of New Node.
	           newNode.next = first;   //newLink ---> old first
	           first = newNode;  //first ---> newNode
	    }
	 
	    /**
	     * Method deletes specific Node from Singly LinkedList in java.
	     * @throws Exception 
	     */

	    public ListNode deleteSpecificNode(String deleteKey) throws Exception{
	 
	           //Case1: when there is no element in LinkedList
	           if(first==null){  //means LinkedList in empty, throw exception.              
	                  throw new Exception("LinkedList doesn't contain any Nodes.");
	           }
	           
	           //Case2: when there is only one element in LinkedList- check whether we have to delete that Node or not.       
	           if(first.vehicleNumber.equals(deleteKey)){ //means LinkedList consists of only one element, delete that.
	        	   ListNode tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
	                  first=first.next;
	                  System.out.println("Node with data="+tempNode.vehicleNumber+" was found on first and has been deleted.");
	                  return tempNode;  //return deleted Node.
	           }
	           
	           //Case3: when there are atLeast two elements in LinkedList
	           ListNode previous=null; 
	           ListNode current=first;
	           while(current!=null){
	                  if(current.vehicleNumber.equals(deleteKey)){
	                        System.out.println("Node with data="+current.vehicleNumber+" has been deleted.");
	                        previous.next=current.next; //make previous node's next point to current node's next.
	                        return current;   //return deleted Node.
	                  }
	                  else{
	                        if(current.next==null){ //Means Node wasn't found.
	                               System.out.println("Node with data="+deleteKey+" wasn't found for deletion.");
	                               return null;
	                        }                 
	                        previous=current;
	                        current=current.next;   //move to next node.
	                  }
	           }
	           return null;      
	    }
	    
	    /**
	     * Display Singly LinkedList
	     */
	    public void displayLinkedList() {
	           System.out.print("Displaying LinkedList [first--->last]: ");
	           ListNode tempDisplay = first; // start at the beginning of linkedList
	           while (tempDisplay != null){ // Executes until we don't find end of list.
	                  String nodeStr = tempDisplay.nodeToString();
	                  System.out.print(nodeStr + "->");
	                  tempDisplay = tempDisplay.next; // move to next Node
	           }
	           System.out.println("null");
	           
	    }
}