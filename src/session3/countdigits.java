package session3;

public class countdigits {
	public static void main(String[] args) {
		int n = 2345223;
		int d=2;
		int ans = 0;
		while (n > 0) {
			int rem = n%10;
			if(rem==d) ans=ans+1;
			n = n / 10;
		}
		System.out.println(ans);
	}
}
