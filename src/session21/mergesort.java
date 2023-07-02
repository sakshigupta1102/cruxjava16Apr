package session21;
public class mergesort {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 8, 2, 4, 3, 10, 9, 2, 7 };
		int[] ans = mergesort(arr, 0, arr.length - 1);
		for (int a : ans) {
			System.out.print(a + " ");
		}
	}
	public static int[] mergesort(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}
		int mid = (lo + hi) / 2;
		int[] rec1 = mergesort(arr, lo, mid);
		int[] rec2 = mergesort(arr, mid + 1, hi);
		return mergearrays(rec1, rec2);
	}

	public static int[] mergearrays(int[] one, int[] two) {
		int[] ans = new int[one.length + two.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < one.length && j < two.length) {
			if (one[i] < two[j]) {
				ans[k] = one[i];
				i++;
				k++;
			} else {
				ans[k] = two[j];
				j++;
				k++;
			}
		}
		while (i < one.length) {
			ans[k] = one[i];
			i++;
			k++;
		}
		while (j < two.length) {
			ans[k] = two[j];
			k++;
			j++;
		}
		return ans;
	}
}
