
public class combination {
	public int solution(int m, int n){
		if(n == 1) return m;
		else if(n == m) return 1;
		else return solution(m-1,n)+solution(m-1,n-1);
	}
	public static void main(String[] args){
		combination c = new combination();
		System.out.print(c.solution(4, 3));
	}
}
