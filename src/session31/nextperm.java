package session31;

public class nextperm {
	public void nextPermutation(int[] nums) {
	    //step 1
	    int i= nums.length-2;
	    while(i>=0 && nums[i] >= nums[i+1]){
	        i--;
	    }
	    //step2
	    int j= nums.length-1;
	    if(i>=0){
	    while(i<j && nums[j] <= nums[i]){
	       j--;
	    }
	    //step3
	    swap(nums, i,j);
	    }  
	    //step4
	    reverse(nums, i+1);

	    }
	    public void swap(int[] nums, int i, int j){
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp;

	    }
	    public void reverse(int[] nums, int i){
	        int lo = i;
	        int hi = nums.length-1;
	        while(lo<hi){
	            swap(nums, lo,hi);
	            lo++;
	            hi--;
	        }
	    }
}
