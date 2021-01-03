package sort;

public class MergeSort {
	public void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}
	public void Merge(int arr[],int l[],int r[],int left,int right) {
		int i=0,j=0,k=0;
		while(i<left && j<right) {
			if(l[i] <= r[j]) {
				arr[k] = l[i];
				k++;
				i++;
			}
			
			else {
				arr[k] = r[j];
				k++;
				j++;
			}
		}
		while(i<left) {
			arr[k++] = l[i++];
		}
		
		while(j<right) {
			arr[k++] = r[j++];
		}
				
	}
	public void MergeSort(int arr[],int n) {
		if(n<2)
			return;
		
		int mid = n/2;
		int []l=new int [mid];
		int []r=new int [n-mid];
		
		for(int i=0; i<mid; i++) {
			l[i] = arr[i];
		}
		
		for( int j=mid; j<n; j++) {
			r[j-mid] = arr[j];
		}
		
	    MergeSort(l,mid);
	    MergeSort(r,n-mid);
		Merge(arr,l,r,mid,n-mid);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,1,4,9,2,1};
		
		MergeSort m1=new MergeSort();
		m1.MergeSort(arr, arr.length);
		m1.print(arr);
	}
}
