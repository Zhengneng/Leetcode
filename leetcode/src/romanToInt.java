import java.util.HashMap;
import java.util.Map;

public class romanToInt {
	public int solution(String s) {
		Map<Character, Integer> romans = new HashMap<Character, Integer>();
		romans.put('I', 1);
		romans.put('V', 5);
		romans.put('X', 10);
		romans.put('L', 50);
		romans.put('C', 100);
		romans.put('D', 500);
		romans.put('M', 1000);
		char[] cs = s.toCharArray();
		int sum = romans.get(cs[0]);
		
		for (int i = 1; i < cs.length; i++) {
			sum += romans.get(cs[i]);
			if (romans.get(cs[i]) > romans.get(cs[i - 1]))
				sum -= romans.get(cs[i-1]) * 2;
		}
		return sum;
	}
}
