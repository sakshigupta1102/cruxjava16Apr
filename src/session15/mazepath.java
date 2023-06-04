package session15;

public class mazepath {
public static void main(String[] args) {
	int n= 3;
	int m=3;
	mazepath(0, 0, 2, 2, "");
}
public static void mazepath(int cr, int cc, int er, int ec, String ans){
	if(cr== er && cc == ec){
		System.out.println(ans);
		return;
	}
	if(cr > er || cc > ec){
		return;
	}
	mazepath(cr, cc+1, er, ec, ans+"H");
	mazepath(cr+1, cc, er, ec, ans+"V");
	mazepath(cr+1, cc+1, er, ec, ans+"D");	
}

}
