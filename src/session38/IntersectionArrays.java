package session38;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionArrays {
	public static void main(String[] args) {
		int[] arr1= {10,15,20,10,5,6,20};
		int[] arr2 = {10,15,80,15,6,20,10, 10};
		ArrayList<Integer> list = new ArrayList();
		HashMap<Integer, Integer> map = new HashMap();
		for(int i=0;i<arr1.length;i++){
			map.put(arr1[i],  map.getOrDefault(arr1[i],0)+1);
		}
	    for(int i=0;i<arr2.length;i++){
	    	int ele = arr2[i];
	    	if(map.containsKey(ele)){
	    		int val = map.get(ele);
	    		list.add(ele);
	    		val = val-1;
	    		if(val==0) map.remove(ele);
	    		else map.put(ele, val);
	    	}
	    }
	    System.out.println(list);
	    System.out.println(map);
		

	}
}
