import java.util.ArrayList;
import java.util.LinkedList;

public class Subsets {
	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		LinkedList<Integer> list = new LinkedList<Integer>();
		allSubsets(S, 0, list, res);
		return res;
	}

	public void allSubsets(int[] s, int k, LinkedList<Integer> list,
			ArrayList<ArrayList<Integer>> result) {
		if (k == s.length) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		allSubsets(s, k + 1, list, result);
		list.add(s[k]);
		allSubsets(s, k + 1, list, result);
		list.removeLast();
	}
}
