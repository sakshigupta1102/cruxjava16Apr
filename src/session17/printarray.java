package session17;

public class printarray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		printarray(arr, 0);
	}
	private static void printarray(int[] arr, int i) {
		if(i==arr.length) return;
		System.out.println(arr[i]);
		printarray(arr, i+1);
	}
}

