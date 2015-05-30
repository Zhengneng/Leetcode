public class ZigZag {
	public String convert(String s, int nRows) {

		if (nRows == 1)
			return s;
		char[] c = new char[s.length()];
		c = s.toCharArray();
		String str = "";
		for (int i = 0; i < nRows; ++i) {
			for (int j = i; j < c.length; j += 2 * (nRows - 1)) {
				str += c[j];
				if (i != 0 && i != nRows - 1
						&& j + 2 * (nRows - 1 - i) < c.length)
					str += c[j + 2 * (nRows - 1 - i)];
			}
		}
		return str;
	}
}
