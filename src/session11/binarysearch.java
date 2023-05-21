package session11;

public class binarysearch {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 8, 9, 10, 15, 20, 55, 70, 75 };
		int item = 20;
		System.out.println(binarysearch(arr, item));

	}

	public static int binarysearch(int[] arr, int item) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid] < item) {
				lo = mid + 1;
			} else if (arr[mid] > item) {
				hi = mid - 1;
			} else {

				return mid;
			}
		}
		return -1;

	}
}
