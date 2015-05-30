public class StringToInt {
	public int atoi(String str) {
		int max = Integer.MAX_VALUE;
		int min = -Integer.MIN_VALUE;
		boolean neg = false;
		long result = 0;
		str = str.trim();
		int start = 0;

		int len = str.length();
		if (len < 1)
			return 0;

		if (str.charAt(start) == '-' || str.charAt(start) == '+'){
			if (str.charAt(start) == '-')
				neg = true;
		start++;}
		for (int i = start; i < len; i++) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9')
				break;
			result = result *10 + (str.charAt(i)-'0');
			if(!neg && result > max)
				return max;
			if(neg && -result < min)
				return min;
		}
		if(neg)
			result = -result;
		return (int)result;

	}
}
