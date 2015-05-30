import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTri2 {
	public List<Integer> getRow(int rowIndex) {
		Integer[] row = new Integer[rowIndex + 1];
		for (int i = 1; i <= rowIndex; i++) {
			row[i] = 1;
			for (int j = i - 1; j > 0; j--) {
				row[j] = row[j] + row[j - 1];
			}
		}
		return new ArrayList<Integer>(Arrays.asList(row));
	}
}
