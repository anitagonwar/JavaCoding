package SortAndMerge;

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

	/*
	 * public static boolean isSameList(ListNode head1, ListNode head2) { if (head1
	 * == null && head2 == null) { return true; } if (head1 == null && head2 !=
	 * null) { return false; } if (head2 == null && head1 != null) { return false; }
	 * return (head1.val == head2.val) && isSameList(head1.next, head2.next); }
	 */
    /**
     * Construct a linked list using given integer list.
     * 
     * @param nums
     * @return head node of the constructed list
     */
   /* public static ListNode constructLinkedList(List<Integer> nums) {
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        for (Integer number : nums) {
            node.next = new ListNode(number);
            node = node.next;
        }
        return dummy.next;
    }
    
    *//**
     * Construct a linked list using given integer array.
     * 
     * @param nums
     * @return head node of the constructed list
     *//*
    public static ListNode constructLinkedList(int[] nums) {
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        for (int num: nums) {
            node.next = new ListNode(num);
            node = node.next;
        }
        return dummy.next;
    }
*/
   
    
    public static ListNode getVehicleList1() {
        ListNode v1 = new ListNode("AZX123","BMW", 1);
        ListNode v2 = new ListNode("AWX321","CHEVY", 5);
        ListNode v3 = new ListNode("WQZ890","MDX", 6);
        ListNode v4 = new ListNode("AVB","RDX", 3);
        ListNode v5 = new ListNode("POS","HondaCRV", 9);
        
        v1.next = v2;
        v2.next = v3;
        v3.next = v4;
        v4.next = v5;
        ListNode head = v1;
        return head;
    }
    
    public static ListNode getVehicleList2() {
        ListNode v1 = new ListNode("DGH","mercedez", 2);
        ListNode v2 = new ListNode("AFHJ","Ford", 4);
        ListNode v3 = new ListNode("LDS","tesla", 7);
        ListNode v4 = new ListNode("CAS","tatanano", 8);
        ListNode v5 = new ListNode("KLM","Jetta", 10);
        
        v1.next = v2;
        v2.next = v3;
        v3.next = v4;
        v4.next = v5;
        ListNode head = v1;
        return head;
    }
}
