package session41;
public class knapsack01 {
	public static void main(String[] args) {
		int[] price = {15,14, 10 ,45 , 30};
		int[] wt = {2, 5, 1,3 ,4};
		//int[][] strg = new int[price.length+1][7+1];
		//System.out.println(maxProfit(price, wt, 7, 0, strg));
		System.out.println(maxProfitBU(price, wt, 7));
	}
	public static int maxProfit(int[] price, int[] wt , int cap , int i, int[][] strg){
		if(cap==0 || i == price.length){
			return 0;
		}	
		if(strg[i][cap] !=0){
			return strg[i][cap];
		}
		int inc =0;
		int exc=0;
		if(cap>= wt[i])
			inc = price[i] + maxProfit(price, wt, cap- wt[i], i+1, strg);
		exc = maxProfit(price, wt, cap, i+1, strg);
		return strg[i][cap] = Math.max(inc, exc);
	}
	public static int maxProfitBU(int[] price , int[] wt, int cap ){
		int[][] strg = new int[price.length+1][cap+1];
		for(int idx =1 ;idx < strg.length;idx++){
			for(int c = 1 ; c< strg[0].length;c++){
				int inc=0;
				int exc=0;
				if(c >= wt[idx-1]){
					inc = price[idx-1]+ strg[idx-1][c-wt[idx-1]];
				}
				exc = strg[idx-1][c];
				strg[idx][c] = Math.max(inc, exc);
			}
		}
		for(int[] arr : strg){
			for(int a: arr){
				System.out.print(a+" ");
			}
			System.out.println();
		}
		return strg[strg.length-1][strg[0].length-1];
		
		
		
	}
	
	
	
	
}


 
