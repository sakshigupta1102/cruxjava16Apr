package session16;

public class permutations {
	public static void main(String[] args) {
permutations("abc","");
	}
	public static void permutations(String ques, String ans) {
		if(ques.length()==0){
			System.out.println(ans);
			return;
		}	
		for(int i=0;i<ques.length();i++){
			char ch = ques.charAt(i);
			String ros = ques.substring(0, i)+ ques.substring(i+1);
			permutations(ros, ans+ch);
		}
	}
}
