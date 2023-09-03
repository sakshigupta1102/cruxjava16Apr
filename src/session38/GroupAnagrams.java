package session38;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] arr) {
		List<List<String>> fans = new ArrayList();
		HashMap<String, List<String>> map = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			String code = generateCode(str);
			if (map.containsKey(code)) {
				List<String> currlist = map.get(code);
				currlist.add(str);
				map.put(code, currlist);

			} else {
				List<String> list = new ArrayList();
				list.add(str);
				map.put(code, list);
			}

		}
		for (String key : map.keySet()) {
			fans.add(map.get(key));
		}
		System.out.print(map);
		return fans;

	}

	public String generateCode(String str) {
		int[] arr = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			arr[ch - 'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + ",");
		}
		return sb.toString();
	}

}
