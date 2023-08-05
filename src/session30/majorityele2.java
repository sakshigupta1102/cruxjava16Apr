package session30;

import java.util.ArrayList;
import java.util.List;

public class majorityele2 {
	  public List<Integer> majorityElement(int[] nums) {
	        int ans1=0;
	        int ans2=0;
	        int cnt1=0;
	        int cnt2=0;
	        for(int i=0;i<nums.length;i++){
	            
	            if(nums[i]==ans1) cnt1++;
	            else if(nums[i] == ans2) cnt2++;
	            else if(cnt1==0) {
	                ans1= nums[i];
	                cnt1++;
	            }
	            else if(cnt2==0){
	                ans2= nums[i];
	                cnt2++;
	            }
	            else {
	                cnt1--;
	                cnt2--;
	            }          
	        }
	         int n= nums.length;
	        List<Integer> ans = new ArrayList();
	         cnt1=0;
	        cnt2=0;
	        for(int num:nums){
	            if(num==ans1) cnt1++;
	            else if(num==ans2) cnt2++;
	        }
	        if(cnt1>n/3) ans.add(ans1);
	         if(cnt2>n/3) ans.add(ans2);
	        return ans;
	        
	        
	        
	    }
}
