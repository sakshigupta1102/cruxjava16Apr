package session13;
import java.io.CharConversionException;
public class togglecase {
	public static void main(String[] args) {
		System.out.println(togglecase("SaChIN"));
	}
	public static String togglecase(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
			  sb.append(Character.toLowerCase(ch));
			else
				sb.append(Character.toUpperCase(ch));
			
		}
		return sb.toString();

	}
}
