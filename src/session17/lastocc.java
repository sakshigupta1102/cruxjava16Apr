package session17;

public class lastocc {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,2,3,4,2,1,1};
		int ans= lastocc(arr, 0, 2);
		System.out.println(ans);
	}
	public static int lastocc(int[] arr, int i , int search){
		if(i==arr.length ) return -1;
		int rr =lastocc(arr, i+1, search);
		if(rr==-1 && arr[i] == search){
			return i;
		}
		return rr;	
	}
}
