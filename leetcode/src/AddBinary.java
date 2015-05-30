public class AddBinary {
//	public String addBinary(String a, String b) {
//		String max, min;
//		if (a.length() < b.length()) {
//			max = b;
//			min = a;
//		} else {
//			max = a;
//			min = b;
//		}
//		char[] Cmax = max.toCharArray();
//		char[] Cmin = min.toCharArray();
//		int i = max.length() - 1, j = min.length() - 1, carry = 0;
//		while (i >= 0) {
//			int sum = (Cmax[i] - '0') + carry;
//			if (j >= 0)
//				sum += (Cmin[j] - '0');
//			Cmax[i] = (char) (sum % 2 + '0');
//			carry = sum / 2;
//			--i;
//			--j;
//		}
//		String max2 = new String(Cmax);
//		if (carry != 0)
//			max2 = "1" + max2;
//
//		return max2;
//	}
	public String addBinary(String a, String b) {
        if (a==null ||a.length()==0){
            return b;
        }
        
        if (b==null || b.length()==0){
            return a;
        }
        
       StringBuilder sb=new StringBuilder();
       
        
        int lastA=a.length()-1;
        int lastB=b.length()-1;
        int carry=0;
        
        
        while (lastA>=0 ||lastB>=0 ||carry>0){
            int num1=lastA>=0?a.charAt(lastA--)-'0':0;
            int num2=lastB>=0?b.charAt(lastB--)-'0':0;
            int current=(num1+num2+carry)%2;
            carry=(num1+num2+carry)/2;
            
            sb.insert(0, current);
            
            
        }
        
        return sb.toString();
    }
	public static void main(String[] args) {
		AddBinary ab = new AddBinary();
		System.out.print(ab.addBinary("11", "1"));
	}
}
