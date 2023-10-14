package session46;
public class uniquenumber1 {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,1,2,3,4,5};
	int ans =0;
	for(int i=0;i<arr.length;i++){
		ans = ans ^ arr[i];
	}
	System.out.println(ans);
}
}
