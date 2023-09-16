package session39;

public class houseRobber {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 1, 11 };
		int[] strg  = new int[4];
		System.out.println(robBU(arr));
	}
	public static int rob(int[] arr, int i) {
		if (i >= arr.length) {
			return 0;
		}
		int rob = arr[i] + rob(arr, i + 2);
		int dontrob = rob(arr, i + 1);
		return Math.max(rob, dontrob);
	}
	public static int robTD(int[] arr, int i, int[] strg) {
		if (i >= arr.length) {
			return 0;
		}
		if(strg[i] != 0){
			return strg[i];
		}
		int rob = arr[i] + robTD(arr, i + 2, strg);
		int dontrob = robTD(arr, i + 1, strg);
		return strg[i] = Math.max(rob, dontrob);
	}
	
	
	public static int robBU(int[] arr){
		int[] strg = new int[arr.length];
		strg[0] = arr[0];
		strg[1] = Math.max(arr[0],arr[1]);
		for(int i=2;i<strg.length;i++){
			int rob = arr[i] + strg[i-2];
			int dontrob = strg[i-1];
			 strg[i]= Math.max(rob, dontrob);
		} 
	//	for(int a: strg) System.out.print(a+" ");
		return strg[arr.length-1];
		
	}
	
	
	
	
	
	
	
}

