package session37;
public class demo {
public static void main(String[] args) {
//	for(int i=0;i<9;i++);
//	System.out.println("hello world");
	try{
		String str = null;
		System.out.println(str.length());
	}catch(ArithmeticException e){
		System.out.println(e);
	}catch(NullPointerException e){
		System.out.println(e);
	}
	finally{
		System.out.println("always executed");
	}
	System.out.println("rest of program");
	
	
	
	
}
}
