package session3;

public class reverseofno {

	public static void main(String[] args) {
		int n = 2345;
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		System.out.println(rev);
	}

}
