package session18;

import java.util.ArrayList;

public class subset1 {
public static void main(String[] args) {
	int[] arr = {1,2,3};
	ArrayList<ArrayList<Integer>> fans = new ArrayList();
	ArrayList<Integer> ans = new  ArrayList<Integer>();
	subset(arr, 0, ans,fans);
	System.out.println(fans);
}
public static void subset(int[] arr, int idx, String ans){
	if(idx==arr.length){
		System.out.println(ans);
		return;
	}
	
	subset(arr, idx+1, ans+arr[idx]); //include
	subset(arr, idx+1, ans); //exclude
	
	
}
public static void subset(int[] arr, int idx, ArrayList<Integer> ans){
	if(idx==arr.length){
		System.out.println(ans);
		return;
	}
	
	ans.add(arr[idx]);
	subset(arr, idx+1, ans); //include
	ans.remove(ans.size()-1);
	subset(arr, idx+1, ans); //exclude
	
	
}
public static void subset(int[] arr, int idx, ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> fans){
	if(idx==arr.length){
		ArrayList<Integer> copy = new ArrayList(ans);
		fans.add(copy);
		return;
	}
	
	ans.add(arr[idx]);
	subset(arr, idx+1, ans,fans); //include
	ans.remove(ans.size()-1);
	subset(arr, idx+1, ans,fans); //exclude
	
	
}
}
