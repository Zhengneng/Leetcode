import java.util.ArrayList;

public class GenerateParentheses {
	ArrayList<String> res = new ArrayList<String>();
	char[] temp;
	int num;

	public ArrayList<String> generateParenthesis(int n) {
		res.clear();
		num = n;
		temp = new char[num * 2];
		generate(0, 0);
		return res;
	}

	private void generate(int left, int right) {
		if (left == num && right == num) {
			res.add(new String(temp));
			return;
		}
		else{
			if(left<num){
				temp[left+right] = '(';
				generate(left+1,right);
			}
			if(right<left){
				temp[left+right] = ')';
				generate(left,right+1);
			}
		}
	}
	
	public static void main(String[] args){
		GenerateParentheses gen = new GenerateParentheses();
		System.out.print(gen.generateParenthesis(1));
	}
}
