public class UniquePaths {
	public int uniquePaths(int m, int n) {
		int[] comb = new int[m+n-1];
		for(int i=2;i<m+n-1;++i)
			for(int j=i-1;j>0;--j)
				comb[j] += comb[j-1];
		return comb[m-1];
	}
}
