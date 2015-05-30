import java.util.ArrayList;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		if (board == null || board.length != 9 || board[0].length != 9)
			return false;
		ArrayList<boolean[]> rowchecker = new ArrayList<boolean[]>();
		ArrayList<boolean[]> colchecker = new ArrayList<boolean[]>();
		ArrayList<boolean[]> bokchecker = new ArrayList<boolean[]>();

		for (int i = 0; i < 9; i++) {
			rowchecker.add(new boolean[9]);
			colchecker.add(new boolean[9]);
			bokchecker.add(new boolean[9]);
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == '.')
					continue;

				int c = board[i][j] - '1';
				if (rowchecker.get(j)[c] == true
						|| colchecker.get(i)[c] == true
						|| bokchecker.get(i / 3 * 3 + j / 3)[c] == true)
					return false;
				else {
					rowchecker.get(j)[c] = true;
					colchecker.get(i)[c] = true;
					bokchecker.get(i / 3 * 3 + j / 3)[c] = true;
				}

			}
		}
		return true;
	}
	
}
