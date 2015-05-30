import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeSum {
	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		Set<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		Arrays.sort(num);
		int len = num.length;
		for (int i = 0; i < len - 2; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				int k = bsearch(num, j + 1, len, -num[i] - num[j]);
				if (k > 0) {
					ArrayList<Integer> list = new ArrayList<Integer>();
					list.add(num[i]);
					list.add(num[j]);
					list.add(num[k]);
					set.add(list);
				}
			}
		}
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		res.addAll(set);
		return res;
	}

	private int bsearch(int[] n, int start, int end, int target) {
		if (start == end)
			return -1;
		int mid = (start + end) / 2;
		if (n[mid] < target)
			return bsearch(n, mid + 1, end, target);
		else if (n[mid] > target)
			return bsearch(n, start, mid, target);
		else
			return mid;
	}

}
