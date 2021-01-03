package stack;

public class StackUsingLinkedList {
	Node root;
	 
    static class Node {
        int data;
        Node next;
 
        Node(int data) { 
        	this.data = data; 
        }
    }	
    public boolean isEmpty() {
    	if(root==null) {
    		return true;
    	}
    	else {
    		return false;
    	}
    		
    }
	public void push(int x) {
		Node n=new Node(x);
		if(root==null) {
			root=n;
		}
		else {
			Node temp=root;
			root=n;
			n.next=temp;
		}
		System.out.println(x+"added in Stack");
	}
	public int pop() {
		int popped=Integer.MIN_VALUE;
		if(root==null) {
			System.out.println("Stack is Empty");
			return 0;
		}
		else {
			popped=root.data;
			root=root.next;
			return popped;
		}
	}
	public int peek() {
		if(root==null) {
			System.out.println("Stack is Empty");
			return Integer.MIN_VALUE;
		}
		else {
			return root.data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkedList s1=new StackUsingLinkedList();
//		s1.push(10);
//		s1.push(20);
//		s1.push(30);
//		s1.push(40);
//		s1.push(50);
//		System.out.println(s1.pop()+"Element is Popped");
//		System.out.println(s1.pop()+"Element is Popped");
//		s1.push(60);
		int val=Integer.MIN_VALUE;
		if(val==Integer.MIN_VALUE) {
			System.out.println("Underflow");
		}
		else
		System.out.println(val+"Element is Peeked");
		}

}
