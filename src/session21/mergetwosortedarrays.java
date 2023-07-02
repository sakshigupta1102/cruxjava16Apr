package session21;
public class mergetwosortedarrays {
	public static void main(String[] args) {
		int[] one = { 1, 8, 10, 12 };
		int[] two = { 2, 4, 6, 30, 40, 80 };
		int[] ans = mergearrays(one, two);

		for (int a : ans) {
			System.out.print(a + "  ");
		}
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
