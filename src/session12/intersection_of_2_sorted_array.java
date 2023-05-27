package session12;

import java.util.ArrayList;

public class intersection_of_2_sorted_array {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30, 40, 50, 60 };
		int[] arr2 = { 5, 6, 7, 10, 15, 20, 35, 40, 100 };
		System.out.println(common_of_arrays(arr1, arr2));
	}

	public static ArrayList<Integer> common_of_arrays(int[] arr1, int[] arr2) {
		ArrayList<Integer> anslist = new ArrayList();
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] == arr2[j]) {
				anslist.add(arr1[i]);
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				j++;
			}

		}
		return anslist;

	}
}
