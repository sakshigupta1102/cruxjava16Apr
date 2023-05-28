package session13;

import java.util.ArrayList;

public class addtwonumbers {
	public static void main(String[] args) {
		int[] arr1 = { 9,9,9 };
		int[] arr2 = { 1 };
		int carry = 0;
		int sum = 0;
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		ArrayList<Integer> list = new ArrayList();
		while (i >= 0 || j >= 0) {
			sum = carry;
			if (i >= 0) {
				sum += arr1[i];
				i--;
			}
			if (j >= 0) {
				sum += arr2[j];
				j--;
			}
			int rem = sum % 10;
			int quot = sum / 10;
			list.add(0,rem);
			carry = quot;

		}
		if(carry != 0) list.add(0,carry);
		System.out.println(list);

	}
}
