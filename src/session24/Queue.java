package session24;
public class Queue {
	public int[] data;
	public int front = 0;
	public int size = 0;
	public Queue() {
		this.data = new int[5];
	}
	public Queue(int cap) {
		this.data = new int[cap];
	}
	public boolean isEmpty(){
		return this.size==0;
	}
	public boolean isFull(){
		return this.size== this.data.length;
	}
	public void enqueue(int item) throws Exception{
		if(isFull()){
			throw new Exception("queue is full");
		}
		this.data[(this.front+this.size)%this.data.length] = item;
		this.size++;
	}
	public int dequeue() throws Exception{
		if(isEmpty()){
			throw new Exception("queue is empty");
		}
		int val = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front+1)%this.data.length;
		this.size--;
		return val;
	}
	public int getFront() throws Exception{
		if(isEmpty()){
			throw new Exception("queue is empty");
		}
		return this.data[this.front];
	}
	public void display(){
		for(int i=0;i<this.size;i++){
			System.out.println(this.data[(this.front+i)%this.data.length]);
		}
	}
	
	
	
	

}
