/*public class MaximumSubarray {
	public int maxSubArray(int[] A) {
		int n=A.length;
		int max=Integer.MIN_VALUE;
		for(int i=0, sum=0;i<n;i++){
			sum +=A[i];
			max = Math.max(max, sum);
			sum  = Math.max(sum,0);
		}
		return max;
	}
}*/

public class MaximumSubarray {
	public int maxSubArray(int[] A, int s, int e){
		if(e==1) return A[0];
		if(e<0) return Integer.MIN_VALUE;
		
		int mid = e/2, lmax=0,rmax=0;
		for(int i=mid-1,sum=0;i>=0;i--){
			sum+=A[i];
			lmax = (sum>lmax)?sum:lmax;
		}
		for(int i=mid+1,sum=0;i<e;i++){
			sum+=A[i];
			rmax=(sum>rmax)?sum:rmax;
		}
		int mmax = A[mid]+lmax+rmax;
		lmax = maxSubArray(A,0,mid);
		rmax = maxSubArray(A,mid+1, e-mid-1);
		
		return Math.max(mmax, Math.max(lmax,rmax));
	}
	
	public static void main(String[] args){
		int[] Array = {1,2,-3,4,-3,-6,-8};
		MaximumSubarray mis = new MaximumSubarray();
		System.out.print(mis.maxSubArray(Array,0,Array.length));
	}
}
