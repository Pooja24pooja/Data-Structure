package twopointeralgorith;

public class Demo {
	public void addition(int arr[],int x) {
		int result=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				if((arr[i]+arr[j])==x)
				System.out.println(arr[i] + " "+arr[j]);
				}
		    }
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo add=new Demo();
		int arr[]= {2,5,8,11,15,18,23,28,36};
		int x=39;
		add.addition(arr, x);
		}
}
