package sort;

public class QuickSort {
	public int partition(int arr[],int low,int high) {
		int i=(low-1);
		int pivot=arr[high];
		for(int j=low;j<high;j++) {
			if(arr[j] < pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
		
	}
	public void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	public void sort(int arr[],int low,int high) {
		if(low < high) {
			int pi=partition(arr,low, high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,3,1,85,60,40,50,37};
		QuickSort qs=new QuickSort();
		qs.sort(arr, 0, arr.length-1);
		qs.print(arr);
		

	}

}
