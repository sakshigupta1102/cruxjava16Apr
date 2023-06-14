package session17;

public class allocc {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,2,5,2,8};
	int[] ans = allocc(arr, 0, 0, 2);
	for(int a:ans) System.out.print(a+"  ");
}
public static int[] allocc(int[] arr, int i, int cnt, int search){
	if(i==arr.length){
		return new int[cnt];
	}
	if(arr[i] == search){
		int[] r1 = allocc(arr, i+1, cnt+1, search);
		r1[cnt] = i;
		return r1;
	}
	else{
		int[] r2 = allocc(arr, i+1, cnt, search);
		return r2;
	}
}
}
