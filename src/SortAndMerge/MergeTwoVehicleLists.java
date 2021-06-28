package SortAndMerge;

public class MergeTwoVehicleLists {

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		ListNode node = new ListNode("","",0);
		ListNode dummy = node;
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				node.next = l2;
				break;
			} else if (l2 == null) {
				node.next = l1;
				break;
			} else {
				if (l1.parkedDuration < l2.parkedDuration) {
					node.next = l1;
					l1 = l1.next;
				} else {
					node.next = l2;
					l2 = l2.next;
				}
				node = node.next;
			}
		} // end while
		return dummy.next;
	}
}
