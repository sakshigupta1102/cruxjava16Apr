package session7;
public class rotatenum {
	public static void main(String[] args) {
		int num = 1234;
		int k = 4;
		int digits = 0;
		int temp = num;
		while (temp > 0) {
			digits++;
			temp = temp / 10;
		}
		System.out.println(digits);
		k = k % digits;
		if (k < 0)
			k += digits;
		int ans = 0;
		int i = 1;
		while (i <= k) {
			int rem = num % 10;
			ans = (rem * (int) Math.pow(10, digits - 1)) + (num / 10);
			i++;
			num = ans;
		}
		System.out.println(num);

	}
}
