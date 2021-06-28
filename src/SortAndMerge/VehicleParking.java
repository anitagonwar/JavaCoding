/*
 * 3. Write a java program to implement the following Consider vehicle parking
 * application where each vehicle information which enters into the parking location 
 * stored in 2 lists. at the end of each day these lists to be merged into single list 
 * and one vehicle information which has highest parked hour should be retrieved, 
 * where each vehicle information has vehicle number, vehicle model, total duration parked in minutes.
 */
package SortAndMerge;

public class VehicleParking {

	public static void main(String[] args) {
			ListNode list1 = ListNode.getVehicleList1();
			String list1Str = ListNode.covertListToStringList(list1);
			System.out.println(list1Str);
			
			ListNode list2 = ListNode.getVehicleList2();
			String list2Str = ListNode.covertListToStringList(list2);
			System.out.println(list2Str);
			
			ListNode mergedList = MergeTwoVehicleLists.mergeTwoLists(list1, list2);
			String list3Str = ListNode.covertListToStringList(mergedList);
			System.out.println(list3Str);
			
			SortList sl = new SortList();
			ListNode sortedList = sl.sortList(mergedList);
			String sortedListStr = ListNode.covertListToStringList(sortedList);
			System.out.println(sortedListStr);
			
			System.out.println("The highest hours Parked Vehicle No: " + sortedList.vehicleNumber + 
					" Vehicle Model: " + sortedList.vehicleModel +
					" Vehicle Parked Duration: " + sortedList.parkedDuration);
			
	}
}
