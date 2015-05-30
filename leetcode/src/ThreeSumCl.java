import java.util.Arrays;

public class ThreeSumCl {
	public int threeSumClosest(int[] num, int target) {
		Arrays.sort(num);
		int minDiff = Integer.MAX_VALUE;
		int n = num.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int diff=minDiff(num,j+1,n,target-num[i]-num[j]);
				if(Math.abs(diff)<Math.abs(minDiff))
					minDiff=diff;
			}
		}
		return target-minDiff;
	}
	
	private int minDiff(int[] array, int s, int e, int target){
		int i=bsearch(array,s,e,target);
		int minDiff = Integer.MAX_VALUE;
		for(int j=0;j<2;j++,i++){
			if(i>=s && i<e){
				if(Math.abs(target-array[i])<Math.abs(minDiff)){
					minDiff = target-array[i];
				}
			}
		}
		return minDiff;
	}
	
	private int bsearch(int[] array, int s, int e, int target){
		if (e - s == 0) {
			return s - 1;
		}
		int mid = (e + s) / 2;
		int val = array[mid];
		if (target == val) {
			return mid;
		} else if (target > val) {
			return bsearch(array, mid + 1, e, target);
		} else {
			return bsearch(array, s, mid, target);
		}
	}
}
