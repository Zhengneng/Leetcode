public class Power {
	public double pow(double x, int n) {
		if (n == 0)
			return 1;
		else if (n == 1)
			return x;
		else if (n == -1)
			return 1 / x;
		else {
			return pow(x * x, n / 2) * pow(x, n % 2);
		}
	}
}
