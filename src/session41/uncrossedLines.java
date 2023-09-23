package session41;

public class uncrossedLines {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        return LCS_BU(nums1, nums2);
    }
    	
	public static int LCS_BU(int[] nums1 , int[] nums2){	
		int[][] strg = new int[nums1.length+1][nums2.length+1];
		for(int i=1;i<strg.length;i++){
			for(int j= 1 ; j<strg[0].length;j++){
				if(nums1[i-1] == nums2[j-1])
					strg[i][j] = 1 + strg[i-1][j-1];
				else{
					int takefrom1 = strg[i-1][j];
					int takefrom2 = strg[i][j-1];
					strg[i][j] = Math.max(takefrom1, takefrom2);
				}			
			}
		}
		return strg[strg.length-1][strg[0].length-1];
		
	}
	
}