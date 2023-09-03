package session38;
import java.util.HashMap;
public class springcomp {
public static void main(String[] args) {
	String str = "zafyafbaa";
	HashMap<Character, Integer> map = new HashMap();
	for(int i=0;i<str.length();i++){
		char ch = str.charAt(i);
		map.put(ch, map.getOrDefault(ch,0)+1);
//		if(map.containsKey(ch)){
//		int val = map.get(ch);
//		map.put(ch, val+1);
//		}else{
//			map.put(ch, 1);
//		}
	}
	System.out.println(map);
	StringBuilder sb = new StringBuilder();
	
	for(int i=0;i<26;i++){
		char ch = (char)( 'a' + i );
		if(map.containsKey(ch)){
			sb.append(ch);
			sb.append(map.get(ch));
		}
	}
	
System.out.println(sb.toString());	
	
	
	
}
}
