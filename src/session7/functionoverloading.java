package session7;

public class functionoverloading {
	public static void main(String[] args) {
		System.out.println(sum(10, 20, 90));
		System.out.println(sum(10, 89.9f));
		sum();
	}
	public static int sum(int x, int y) {
		int sum = x + y;
		return sum;
	}
	public static int sum(int x, int y, int z) {
		return x + y + z;
	}

	public static void sum() {
		int a = 10;
		int b = 90;
		System.out.println(a + b);
	}

	public static float sum(int a, float b) {
		return a + b;
	}
}
