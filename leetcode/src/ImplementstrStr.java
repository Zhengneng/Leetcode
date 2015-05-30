public class ImplementstrStr {
	public int strStr(String haystack, String needle) {
		int index = 0;
		String s1 = haystack;
		String s2 = needle;
		int p = 0;
		int q = -0;
		int l1 = s1.length();
		int l2 = s2.length();
		while (index <= (l1 - l2) && q < l2) {
			if (s1.charAt(p) != s2.charAt(q)) {
				p = ++index;
				q = 0;
			} else {
				p++;
				q++;
			}
		}
		if (index >= 0 && q == l2)
			return index;
		return -1;
	}
}
