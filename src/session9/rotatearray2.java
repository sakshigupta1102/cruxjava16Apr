package session9;
import java.util.Arrays;
public class rotatearray2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 ,2,1,3};
//		Arrays.sort(arr);
		int k = 3;
		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}
	public static void reverse(int[] arr, int lo, int hi) {
		int i = lo;
		int j = hi;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
