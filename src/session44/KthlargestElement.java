package session44;
import java.util.PriorityQueue;
class findKthLargest {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue();
        int i=0;
        for(;i<k;i++){
            pq.add(nums[i]);
        }
        for(;i<nums.length;i++){
            pq.add(nums[i]);
            pq.remove();
        }
        return pq.remove();

    }
}