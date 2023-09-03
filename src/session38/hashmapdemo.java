package session38;
import java.util.HashMap;
public class hashmapdemo {
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap();
	map.put("orange", 5);
	map.put("apple", 5);
	map.put("banana", 5);
	map.put("grape", 5);
	map.put("orange", 5);
	System.out.println(map.remove("orange"));
	System.out.println(map);
	System.out.println(map.get("apple"));
	System.out.println(map.get("kiwi"));
	for(String str : map.keySet()){
		System.out.println(str +" " + map.get(str));
	}
	map.put(null, 8);
	System.out.println(map.get(null));
	
	
}
}
