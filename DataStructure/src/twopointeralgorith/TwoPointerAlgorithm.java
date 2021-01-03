package twopointeralgorith;

public class TwoPointerAlgorithm {
	public int twoAddition(int A[],int n,int x) {
		int i=0;
		int j=n-1;
		while(i<j) {
			if((A[i]+A[j])==x) {
				System.out.println(A[i]+" "+A[j]);
				return x;
			}
			else if((A[i]+A[j])<x) {
				i++;
			}
			else {
				j--;
			}
		}
		return 0;
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoPointerAlgorithm tpa=new TwoPointerAlgorithm();
		int arr[]= {5,6,7,11,13,15,17,19};
		int val=20;
		int arr_size=arr.length;
		int x=tpa.twoAddition(arr,arr_size,val);
		System.out.println(x);

	}

}
