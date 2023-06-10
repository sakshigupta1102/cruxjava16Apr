package leetcode;
import java.util.ArrayList;
import java.util.List;
public class generatepara {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList();
        generatepara(n,0,0,"",list);
        return list;
    }
    public static void generatepara(int n, int open, int close, String ans, List<String> list) {
		if (open == n && close == n) {
			list.add(ans);
			return;
		}
		if (open > n || close > open) {
			return;
		}
		generatepara(n, open + 1, close, ans + "(",list);
		generatepara(n, open, close + 1, ans + ")",list);
	}
}