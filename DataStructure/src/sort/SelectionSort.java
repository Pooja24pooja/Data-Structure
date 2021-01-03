package sort;

public class SelectionSort {
	public void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " " );
		}
	}
	public void selectionSort(int arr[] ) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,3,5,1,6,3};
		SelectionSort ss=new SelectionSort();
		ss.selectionSort(arr);
		ss.print(arr);

	}

}
