//4. Unique elements in sorted order.

package SortedOrder;

public class UniqueElements {

	public static int removeDuplicates(int[] A) {
	      if(A.length<=1) return A.length;
	      int i=1;
	      for (int j=1; j<A.length; j++){
	          if(A[j]>A[i-1]){
	              A[i]=A[j];
	              i++;
	          }
	      }
	      return i;
	    }
	
	public static void main(String[] args) {
		int arr[] = {1,1, 1, 1,1, 1,1, 1,1, 1, 4, 5, 9};
	      int n = arr.length;
	      int i, j;
	      System.out.print("The array is: ");
	      for (i = 0; i < n; ++i)
	      System.out.print(arr[i] + " ");
	      System.out.print("\nThe distinct elements of above array are: ");
	      for (i = 0; i < n; i++) {
	         for (j = 0; j < i; j++)
	         if (arr[i] == arr[j]) {
	        	 System.out.println("Found duplicates");
	            break;
	         }
	         if (i == j)
	         System.out.print( arr[i] + " ");
	      }
	      int newArrayLen = UniqueElements.removeDuplicates(arr);
	      
	      System.out.print("---------------------------- ");
	      for (i = 0; i < newArrayLen; i++) {
	    	  System.out.print(arr[i] + " ");
	      }

	}

}
