package session13;

public class StringBuiderdemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("sachin");
		sb.append("sharma");
		System.out.println(sb);
		sb.insert(0, "mr");
		System.out.println(sb);
		System.out.println(sb.charAt(6));
		System.out.println(sb.insert(0, 'n'));
		System.out.println(sb);
		String str = "rohan";
		StringBuilder sb1 = new StringBuilder(str);
		sb1.toString();
		sb.setCharAt(0, 'x');
		System.out.println(sb);
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('s'));
		System.out.println(Character.isUpperCase('A'));
		
		
		
		

	}
}
