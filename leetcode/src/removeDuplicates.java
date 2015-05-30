public class removeDuplicates {
	public int rmoveDuplicates(int[] A) {
		if (A.length < 3)
			return A.length;
		int anchor = 1;
		for (int i = 2; i < A.length; i++) {
			if (A[anchor] != A[i] || A[anchor] != A[anchor - 1])
				A[++anchor] = A[i];
		}
		return anchor + 1;
	}
	public static void main(String[] args){
		removeDuplicates rd = new removeDuplicates();
		int[] A = {1,2,3,4,4,4,4,6};
		System.out.print(rd.rmoveDuplicates(A));
	}
}
