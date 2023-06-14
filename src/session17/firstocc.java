package session17;

public class firstocc {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 ,2,4 ,5,6 ,7,2 ,4 };
		System.out.println(firstocc(arr, 0,10 ));
	}
	private static int firstocc(int[] arr, int i, int search) {
		if(i==arr.length) return -1;
		if(arr[i] == search){
			return i;
		}
		return firstocc(arr, i+1, search);
	}
}
