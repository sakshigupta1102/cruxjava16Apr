package session39;

public class fibo {
	public static void main(String[] args) {
		//System.out.println(fibo(6));
		
//		int[] strg = new int[7];
//		System.out.println(fiboTD(6,strg));
//		for(int a:strg){
//			System.out.print(a+" ");
//		}
		System.out.println(fiboBUSE(6));
		
	}
	private static int fiboTD(int n, int[] strg) {
		if(n==0||n==1){
			return n;
		}
		//top down`
		if(strg[n] != 0){
			return strg[n];
		}
		int a = fiboTD(n-1,strg);
		int b = fiboTD(n-2,strg);
		return  strg[n] = a+b;
	}
	public static int fibo(int n){
		if(n==0 || n==1 ){
			return n;
		}
		int a = fibo(n-1);
		int b= fibo(n-2);
		return a+b;		
	}
	public static int fiboBU(int n){
		int[] strg = new int[n+1];
		strg[0] =0;
		strg[1] = 1;
		for(int i=2;i<=n ;i++){
			strg[i] = strg[i-1] + strg[i-2];
		}
		return strg[n];
	}
	
	public static int fiboBUSE(int n){
		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		for(int i=2;i<= n ; i++){
		     int a  = strg[0] + strg[1] ;
		     strg[0] = strg[1];
		     strg[1]  = a;
		}
		return strg[1];
		
	}
	
	
	
	
	
	

	
	
	
	
}



