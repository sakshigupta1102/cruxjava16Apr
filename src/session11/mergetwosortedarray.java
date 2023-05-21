package session11;
public class mergetwosortedarray {
	public static void main(String[] args) {
		int[] arr1 = { 2, 5, 7, 10, 15, 30, 35, 70 };
		int[] arr2 = { 1, 3, 6, 36, 78, 90, 100, 110 };
		int[] ans = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				ans[k] = arr1[i];
				i++;
				k++;
				} else {
				ans[k] = arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length){
			ans[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length){
			ans[k] = arr2[j];
			j++;
			k++;
		}
		for(int a:ans){
			System.out.print(a+"  ");
		}

	}
}
