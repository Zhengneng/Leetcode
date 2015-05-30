import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	/*
	 * int[] array= new int[2];
	 * 
	 * public int[] twoSum(int[] numbers, int target) {
	 * 
	 * for(int i=0;i<numbers.length;i++){ for(int j=i+1;j<numbers.length;j++){
	 * if(numbers[i]+numbers[j]==target){ array[0]=i+1; array[1]=j+1;
	 * System.out.print("index1="+array[0]+", index2="+array[1]);
	 * i=numbers.length; break; } } } return array; }
	 */
	public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] num = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				num[0] = map.get(target-numbers[i]) + 1;
				num[1] = i + 1;
			} else
				map.put(numbers[i], i);
		}
		System.out.print("index1="+num[0]+", index2="+num[1]);
		return num;
	}

	public static void main(String[] args) {
		int[] temp = { 2, 3, 4, 5, 6, 6, 7, 8, 9 };
		int target = 16;
		TwoSum t = new TwoSum();
		t.twoSum(temp, target);
	}
}
