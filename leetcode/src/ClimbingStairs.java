public class ClimbingStairs {
	public int climbStairs(int n) {
		int[] res = new int[3];
		res[0] = 1;
		res[1] = 1;
		for (int i = 2; i <= n; i++) {
			res[i % 3] = res[(i - 1) % 3] + res[(i - 2) % 3];
		}
		return res[n%3];
	}
	public static void main(String[] args){
		ClimbingStairs cs = new ClimbingStairs();
		System.out.print(cs.climbStairs(4));
	}
}
