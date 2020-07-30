package CircularQueue;

import java.util.Arrays;

public class circularQueue {
	
	private int[] circularQueue;
	private int head;
	private int tail;
	private int currentQueueSize;
	
	circularQueue(int size){
		
		circularQueue = new int[size];
		head = -1;
		tail = -1;
		currentQueueSize = 0;
	}
	
	private void Enqueue(int value) throws Exception {
		if(isQueueFull())
			throw new Exception("Queue is FULL !!!");
		
		tail = (tail + 1) % circularQueue.length;
		circularQueue[tail] = value;
		currentQueueSize++;
		
		if (head == -1)
			head++;
		
	}
	
	private boolean isQueueFull() {
		if (currentQueueSize == circularQueue.length)
			return true;
		return false;
	}
	
	private int Dequeue() throws Exception {
		if(isQueueEmpty())
			throw new Exception("Queue is EMPTY !!!");
		
		int value = circularQueue[head];
		//in this line, i am not able to put NULL value, 
		//it is not accepting a null except of 0
		//right thing is: circularQueue[head] = null;
		circularQueue[head] = 0;
		head = (head+1) % circularQueue.length;
		currentQueueSize--;
		return value;
	}
	
	private boolean isQueueEmpty() {
		if (currentQueueSize == 0)
			return true;
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		circularQueue circularQueue = new circularQueue(5);
		
		circularQueue.Enqueue(10);
		circularQueue.Enqueue(11);
		circularQueue.Enqueue(12);
		circularQueue.Enqueue(13);
		circularQueue.Enqueue(14);
		//throws an exception for the next Enqueue
		//circularQueue.Enqueue(15); 
		System.out.print("Circular queue is: "+ circularQueue);
		
//		System.out.println("Dequeued element: "+ circularQueue.Dequeue());
//		//Dequeue throws null pointer exception when =NULL
//		//check line 44, 45
//		System.out.println("Now the Circular Queue is: "+ circularQueue);
	}
	
	/*
	 * this is for printing the circularQueue values
	 */
	@Override
	public String toString() {
		return Arrays.toString(circularQueue);
	}

}
