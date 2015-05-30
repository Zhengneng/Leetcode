public class Sqrt {
	public  double sqrt(int x) {
		double cur=4.9;
		double pre=0;
		if (x==0)
			return 0;
		while((cur-pre)>0.000000000001){
			pre = cur;
			cur = (cur+x/cur)/2;
		}
		return cur;
	}
	public static void main(String[] args){
		Sqrt s = new Sqrt();
		System.out.print(s.sqrt(25));
	}
	

}
