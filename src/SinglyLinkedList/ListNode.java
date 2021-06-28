package SinglyLinkedList;

import java.util.List;

/**
 * For problems:
 * <p>{@link _021_MergeTwoSortedLists [021]Merge Two Sorted Lists}
 * <p>{@link _203_RemoveLinkedListElements [203]Remove Linked List Elements}
 */
public class ListNode {
    public String vehicleNumber;
    public String vehicleModel;
    public int parkedDuration;
    public ListNode next;

    public ListNode(String vehicleNum, String vehiclemodel, int duration) {
    	vehicleNumber = vehicleNum;
    	vehicleModel = vehiclemodel;
    	parkedDuration = duration;
    }

	
	/*
	 * @Override public String toString() { ListNode node = next; String str = "[" +
	 * val; while (node != null) { str += "->" + node.val; node = node.next; } str
	 * += "]"; return str; }
	 */
	    
	  public String nodeToString() {
			String str = "[" + vehicleNumber + "," +
							   vehicleModel +  "," +
							   parkedDuration;
			str += "]";
			return str;
	  }
	  
		public static String covertListToStringList(ListNode head) {
			String result = "";
			ListNode h = head;
			while (h != null) {
				if (h.next != null) {
					result += h.nodeToString() + "->";
				} else {
					result += h.nodeToString();
				}
				h = h.next;
			}
			return result;
		}
    
    public static ListNode getVehicleList1() {
        ListNode v1 = new ListNode("AZX123","BMW", 1);
        ListNode v2 = new ListNode("AWX321","CHEVY", 3);
        ListNode v3 = new ListNode("WQZ890","MDX", 5);
        ListNode v4 = new ListNode("AVB","RDX", 7);
        ListNode v5 = new ListNode("POS","HondaCRV", 9);
        
        v1.next = v2;
        v2.next = v3;
        v3.next = v4;
        v4.next = v5;
        ListNode head = v1;
        return head;
    }
    
   
}
