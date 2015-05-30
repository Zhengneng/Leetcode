

public class removeElement {
	public int remove(int[] A, int item) {

		int n = A.length;
		int m=0;
		for (int i = 0; i < n; i++) {
			if(A[i] != item)
				m++;
		}

		return m;
	}
	public static void main(String[] args){
		
		removeElement r = new removeElement();
		int[] A={1,2,3,4,5,6};
		int temp = 3;
		System.out.print(r.remove(A,temp));
	}
}
