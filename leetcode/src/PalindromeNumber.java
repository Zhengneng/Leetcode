
public class PalindromeNumber {
	 public boolean isPalindrome(int x) {
	        if(x<0) return false;
	        long org = x, rev=0;
	        while(x!=0){
	        	rev *= 10;
	        	rev += x%10;
	        	x /= 10;
	        }
	        return org == rev;
	    }
}
