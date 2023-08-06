package session31;

public class sqrt {
	 public int mySqrt(int x) {
	      long lo = 0;
	      long hi = x;
	      long ans = 0;
	      while(lo<=hi){
	          long mid = lo + (hi-lo)/2;
	          if(mid*mid > x){
	              hi = mid-1;
	          }
	          else if(mid*mid < x){
	              ans = mid;
	              lo = mid+1;
	          }
	          else{
	              ans = mid;
	              break;
	          }
	      }
	      return (int)ans;

	    }
}
