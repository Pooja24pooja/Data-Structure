package stack;

public class Stack {
	float Max=4.2f;
	float s[]=new float[(int) Max];
	int top;
	public boolean isEmpty() {
		
		return (top<0);
	}
	public Stack() {
		top=-1;
	}
	public boolean push(int x) {
		if(top>=(Max-2)) {
			System.out.println(" Overflow Situation");
			return false;
		}
		
		else {
			s[++top]=x;
			System.out.println(x+" Element is added");
			return true;
		}
		
	}
	public int pop() {
		if(top<0) {
			System.out.println("Underflow Situation");
			return 0;
		}
		else {
			float x=s[top--];
			return (int) x;
		}
		
	}
	public int peek() {
		if(top<0) {
			System.out.println("Underflow Situation");
			return Integer.MIN_VALUE;
		}
		else {
			int x=(int) s[top];
			return x;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1=new Stack();
//		s1.push(10);
//		s1.push(20);
//		s1.push(30);
//		s1.push(40);
//		s1.push(50);
    	//System.out.println(s1.pop()+" Removedfrom stack");
//		s1.push(60);
//		System.out.println(s1.pop()+" Removedfrom stack");
//		s1.peek();
//		s1.push(70);
		int val=s1.peek();
		if(val==Integer.MIN_VALUE){
			System.out.println("Underflow");
		}
		else 
        System.out.println(val+" peeked item");
	}
}
