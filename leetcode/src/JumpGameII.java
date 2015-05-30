public class JumpGameII {
	public int jump(int[] A) {
		int n = A.length;
		int record = 0;
		int min = n;
		int i = 0;
		int k;
		int q;
		int b;
		for (int j = 0; j < A[i]; j++) {
			q = A[i];
			b = i;
			i = i + A[i] - j;
			record++;
			k=record;
			if (i>=n-1 | A[i]>n-1-i) return min=record;
			while (A[i] <= n - 1 - i) {
				i=i+A[i];
				record++;
				if (i >= n - 1) {
					if (min > record) {
						min = record;
						break;
					}
				} else if (A[i] == 0) {
					break;
				}
			}
			record=k-1;
			i=b;
			if (j==q) {
				i=A[b];
				record++;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] A = { 3, 2, 6, 1, 1, 4 };
		JumpGameII s = new JumpGameII();
		System.out.print(s.jump(A));
	}
}
