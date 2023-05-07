package session6;

public class binarytodec {
	public static void main(String[] args) {
		int n = 10110010;
		int ans = 0;
		int mult = 1;
		while (n > 0) {
			int rem = n % 10;
			ans = ans + (rem * mult);
			mult = mult * 2;
			n = n / 10;
		}
		System.out.println(ans);
	}
}
