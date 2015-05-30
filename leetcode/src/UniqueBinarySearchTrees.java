public class UniqueBinarySearchTrees {
	public int numTrees(int n) {
		int[] sum = new int[n + 1];
		sum[0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				sum[i] += sum[j] * sum[i - 1 - j];
			}
		}
		return sum[n];
	}

	public static void main(String[] args) {
		UniqueBinarySearchTrees ubst = new UniqueBinarySearchTrees();
		System.out.print(ubst.numTrees(4));
	}
}
