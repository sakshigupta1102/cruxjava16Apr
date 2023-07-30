package session29;

public class primeno {
	public static void main(String[] args) {
		range_of_prime(17, 100);
	}
	public static void range_of_prime(int a , int b){
		for(int i= a ;i<= b ;i++){
			if(isprime(i))
			System.out.println(i);
		}
	}
	
	
	public static boolean isprime(int n) {
		int i = 2;
		while (i*i <= n) {
			if (n%i  == 0)
				return false;
			i++;
		}
		return true;
	}
}
