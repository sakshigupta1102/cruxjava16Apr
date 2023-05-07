package session7;

public class armstringnum {
	public static void main(String[] args) {
		range(1, 1000);
	}

	public static void range(int lo, int hi) {
		int i = lo;
		while (i <= hi) {
			if (isarmstrong(i))
				System.out.println(i + "  ");
			i++;
		}

	}

	public static int digits(int n) {
		int d = 0;
		while (n != 0) {
			d++;
			n /= 10;
		}
		return d;
	}

	public static boolean isarmstrong(int n) {
		int d = digits(n);
		int ans = 0;
		int temp = n;
		while (temp != 0) {
			int rem = temp % 10;
			ans = ans + (int) Math.pow(rem, d);
			temp = temp / 10;
		}
		if (ans == n)
			return true;
		return false;
	}
}
