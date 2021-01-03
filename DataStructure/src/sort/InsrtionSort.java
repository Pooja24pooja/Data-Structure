package sort;

public class InsrtionSort {
	public void insertionSort(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	public void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {18,22,21,10,13,6,5,3,1,8,9};
		InsrtionSort insert=new InsrtionSort();
		insert.insertionSort(arr);
		insert.print(arr);

	}

}
