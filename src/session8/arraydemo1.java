package session8;

import java.util.Scanner;

public class arraydemo1 {
	public static void main(String[] args) {
		int[] arr = { 10, 30, 80, -90, 80};
		display(arr);
		System.out.println("*************");
		reverseinplace(arr);
		display(arr);
		
//		display(arr);
//		System.out.println("**********");
//		int[] ans = reverse(arr);
//		display(ans);

		// int[] arr = input(5);
		// display(arr);
		// System.out.println(min(arr));
		// System.out.println(search(arr, 88));
	}

	public static int[] input(int s) {
		int[] arr = new int[s];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}

	public static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int max(int[] arr) {
		int ans = arr[0];
		for (int i = 1; i < arr.length; i++) {
			// if (arr[i] > ans) {
			// ans = arr[i];
			// }
			ans = Math.max(ans, arr[i]);
		}
		return ans;
	}

	public static int min(int[] arr) {
		int ans = arr[0];
		for (int i = 1; i < arr.length; i++) {
			// if (arr[i] < ans) {
			// ans = arr[i];
			// }
			ans = Math.min(ans, arr[i]);
		}
		return ans;
	}

	public static int search(int[] arr, int item) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				index = i;
			}
		}
		return index;
	}

	public static int[] reverse(int[] arr) {
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			ans[i] = arr[arr.length - 1 - i];
		}
		return ans;
	}
	public static void reverseinplace(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
