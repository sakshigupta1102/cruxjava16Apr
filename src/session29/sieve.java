package session29;
import java.util.Arrays;
public class sieve {
	public static void main(String[] args) {
		int n=30;
		boolean[] sieve = new boolean[n+1];
		Arrays.fill(sieve, true);
		sieve[0] = false;
		sieve[1] = false;
		for(int table = 2 ; table*table <= n ; table++){
			if(sieve[table] == false) continue;
			for(int mult = 2 ; table*mult <= n ; mult++){
				sieve[table*mult ] = false;
			}
		}
		for(int i=0;i<= n ;i++){
			if(sieve[i]) System.out.print(i+" ");
		}
	}
}
