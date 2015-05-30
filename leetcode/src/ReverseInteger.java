public class ReverseInteger {
	// public int reverse(int x) {
	// long rev = 0;
	// while(x!=0){
	// rev *= 10;
	// rev += x%10;
	// x /= 10;
	// }
	// if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
	// return 0;
	// return (int)rev;
	// }
	public int reverse(int x) {
		long rev = 0;
		while (x > 0) {
			rev *= 10;
			rev += x % 10;
			x /= 10;
		}

		if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
			return 0;
		return (int) rev;
	}

	public static void main(String[] args) {
		ReverseInteger ri = new ReverseInteger();
		System.out.print(ri.reverse(1002));
	}
}
