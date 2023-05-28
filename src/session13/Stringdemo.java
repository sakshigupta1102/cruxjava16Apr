package session13;
public class Stringdemo {
	public static void main(String[] args) {
		//String str = "Dhoni";
		//str += "Rocks";
		//System.out.println(str);
		String str1 = "sachin ";
		str1 = str1.concat("sharma");
		System.out.println(str1);
		// inbuilt string functions
		System.out.println(str1.charAt(5));
		System.out.println(str1.charAt(6));
		System.out.println(str1.charAt(12));
		System.out.println(str1.length());
		System.out.println(str1.isEmpty());
		String str2 = str1.replace('s', 'm');
		System.out.println(str2);
		System.out.println(str1);
		System.out.println(str1.substring(7));
		System.out.println(str1.substring(7, str1.length()));
		System.out.println(str1.substring(9, 9));
		
		
		
		
		
		
		
		
		
		

	}
}


