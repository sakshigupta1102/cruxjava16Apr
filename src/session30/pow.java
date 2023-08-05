package session30;

public class pow {
	 public double myPow(double x, int n) {
	        boolean nsign=false;
	        if(n<0) nsign = true;
	        n= Math.abs(n);
	        double ans= rec(x,n);
	        if(nsign) return 1/ans;
	       return ans;
	    }
	    public double rec(double x , int n){
	        if(n==0) return 1;
	        if(n%2==0) return rec(x*x , n/2);
	        else return x* rec(x*x,n/2);
	    }
}
