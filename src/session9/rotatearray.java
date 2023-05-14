package session9;
public class rotatearray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int k = 39;
		k = k % arr.length;
		for (int times = 0; times < k; times++) {
			int save = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = save;
		}
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
