import java.util.Stack;
public class ValidParentheses {
	 public boolean isValid(String s) {
		 if(s == null) return false;
		 Stack<Character> match = new Stack<Character>(); ;
//		 String[] ary = s.split("");
		 char[] ary = s.toCharArray();
//		 String str;
		 for (int i=0;i<s.length();i++){
			 switch(ary[i]){
			 case ')':
				 if(!match.empty() && match.peek().equals('('))
					 match.pop();
				 else return false;
				 break;
			 case ']':
				 if(!match.empty() && match.peek().equals('['))
					 match.pop();
				 else return false;
				 break;
			 case '}':
				 if(!match.empty() && match.peek().equals('{'))
					 match.pop();
				 else return false;
				 break;
			 default:
				 match.push(ary[i]);
				 break;
			 }
		 }
		 return match.empty();
	    }
	 public static void main(String[] args){
		 ValidParentheses vp = new ValidParentheses();
		 if(vp.isValid(")("))
			 System.out.print("True");
		 else
			 System.out.print("False");
	 }
}
