public class LongestCommonPrefix {
	public String solution(String[] strs) {
		if (strs.length == 0)
			return "";
		char[] ch = strs[0].toCharArray();
		for (int len = 0; len < ch.length; len++) {
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].length() == len
						|| ch[len] != strs[j].toCharArray()[len]) {
					return strs[0].substring(0, len);
				}
			}
		}
		return strs[0];
	}

	public static void main(String[] args) {
		LongestCommonPrefix l = new LongestCommonPrefix();
		String[] st = new String[2];
		st[0] = "aa";
		st[1] = "a";
//		st[2] = "preb";
//		st[3] = "prec";
//		st[4] = "pred";

		System.out.print(l.solution(st));
	}
}
