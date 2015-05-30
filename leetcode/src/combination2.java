public class combination2 {
	public int solution(int m, int n) {
		if (m >= n) {
			if (n == 1)
				return m;
			else if (n == m)
				return 1;
			else
				return solution(m - 2, n - 1) + solution(m - 2, n - 2);
		} else {
			if (m == 1)
				return n;
			else if (m == n)
				return 1;
			else
				return solution(m - 1, n - 2) + solution(m - 2, n - 2);
		}
	}

	public static void main(String[] args) {
		combination c = new combination();
		System.out.print(c.solution(3, 5));
	}
}
