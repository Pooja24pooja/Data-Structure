package queue;

public class QueueImplementation{
int front,rear,element,capacity,size;
int arr[];
	public void QueueImplementation(int capacity) {
		this.capacity=capacity;
		this.front=0;
		this.size=0;
		this.rear=front-1;
		this.arr=new int[capacity];
	}
	public boolean isEmpty() {
		if(size==0)
		return true;
		return false;
	}
	public boolean isFull() {
		if(front==rear)
			return true;
		return false;
	}
	public void enqueRear(int element) {
		if(front==rear) {
			System.out.println("Queue is full");
		}
		
		rear=element;
		size++;
		System.out.println(element+" inserted Successfully");
	}
	public void Deque() {
		if(front==rear) {
			System.out.println("Queue is full");
		}
		if(rear<capacity)
			arr[rear]=0;
		size--;
	}
}