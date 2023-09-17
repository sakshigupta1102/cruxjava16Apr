package session40;
import java.util.Arrays;
public class mincostClimbStairs {
public static void main(String[] args) {
	
	int[] arr = {10,15,20,7,3};
//	int[] strg = new int[arr.length];
//	Arrays.fill(strg, -1);
//	int ans = Math.min(minCostRec(arr, 0, strg), minCostRec(arr, 1, strg));
//	System.out.println(ans);
	System.out.println(minCostBU(arr));
}
public static int minCostRec(int[] arr , int i , int[] strg){
	if(i >= arr.length){
	return 0;	
	}
	if(strg[i] != -1){
		return strg[i];
	}
	int oneJump = minCostRec(arr, i+1, strg);
	int twoJump = minCostRec(arr, i+2, strg);
	return strg[i] = Math.min(oneJump, twoJump) + arr[i];
}
public static int minCostBU(int[] cost){
	int[] strg = new int[cost.length];
	strg[0] = cost[0];
	strg[1] = cost[1];
	for(int i=2;i<cost.length;i++){
		int oneJump = strg[i-1];
		int twoJump = strg[i-2];
		strg[i] = Math.min(oneJump, twoJump) + cost[i];
	}
	return Math.min(strg[strg.length-1], strg[strg.length-2]);
}






}
