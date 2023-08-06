package session31;

public class houserobber_rec {
	 public int rob(int[] nums) {
	        return rob(nums,0);
	        }
	    public int rob(int[] nums , int i){
	        if(i >= nums.length){
	            return 0;
	        }
	        int rob = nums[i] + rob(nums, i+2);
	        int dntrob = rob(nums, i+1);
	        return Math.max(rob,dntrob);
	    }
}
