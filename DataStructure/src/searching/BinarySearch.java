package searching;

public class BinarySearch {
	public int binarySearch(int[] arr, int l, int r, int x) {
		// TODO Auto-generated method stub
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return x; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearch bs=new BinarySearch();
		int arr[]= {10,15,20,25,30,37,39,41};
		int n=arr.length-1;
		int x=30;
		int result=bs.binarySearch(arr,0,n,x);
		System.out.println(result+" Element is Found....");

	}

	

}
