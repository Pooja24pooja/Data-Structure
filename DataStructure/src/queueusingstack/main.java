package queueusingstack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queueusingstack q1 = new queueusingstack();  
	    q1.enQueue(10); 
	    q1.enQueue(20);  
	    q1.enQueue(30);  
	    q1.enQueue(40);
	    q1.enQueue(50);
	    q1.enQueue(60);
	    q1.enQueue(70);
	    System.out.println(q1.deQueue());  
	    System.out.println(q1.deQueue()); 
	    System.out.println(q1.deQueue()); 
	    System.out.println(q1.deQueue()); 
	    System.out.println(q1.deQueue()); 
	    System.out.println(q1.deQueue()); 
	    System.out.println(q1.deQueue()); 
	}  

	}


