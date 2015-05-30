import java.util.ArrayList;

public class Permutations {
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if (num == null || num.length == 0)
			return res;
		helper(num, new boolean[num.length], new ArrayList<Integer>(), res);
		return res;
	}

	public void helper(int[] num, boolean[] used, ArrayList<Integer> item,
			ArrayList<ArrayList<Integer>> res) {
		if (item.size() == num.length) {
			res.add(new ArrayList<Integer>(item));
			return;
		}
		for (int i = 0; i < num.length; i++) {
			if (!used[i]) {
				used[i] = true;
				item.add(num[i]);
				helper(num, used, item, res);
				item.remove(item.size() - 1);
				used[i] = false;
			}
		}

	}
}
