package session25;

import session24.Queue;
public class DynamicQueue extends Queue {
	@Override
	public void enqueue(int item) throws Exception {
		if (isFull()) {
			int[] arr = new int[super.data.length*2];
			for(int i=0;i<super.data.length;i++){
				arr[i] = super.data[(super.front+i)%super.data.length];
			}
			super.front=0;
			super.data = arr;
		}
		super.enqueue(item);

	}
}
