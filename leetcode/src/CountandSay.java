public class CountandSay {
	public String solution(int n) {
		if (n < 2)
			return "1";
		String say = "1";
		while (--n > 0) {
			int count = 1;
			StringBuffer tmp = new StringBuffer();
			for (int i = 1; i < say.length(); ++i, ++count) {
				if (say.charAt(i) != say.charAt(i - 1)) {
					tmp.append(count).append(say.charAt(i - 1));
					count = 0;
				}
			}
			tmp.append(count).append(say.charAt(say.length() - 1));
			say = tmp.toString();
		}
		return say;
	}
/*	if(n == 1){  
        return "1";  
    }  
      
    String s = "1";  
    StringBuffer ret = new StringBuffer();  
    int cnt = 0;  
    int round = 0;          // round�ǵ������ٴ�  
    int i;  
    while(++round < n){  
        cnt = 1;  
        ret.setLength(0);  
        for(i=1; i<s.length(); i++){  
            if(s.charAt(i) == s.charAt(i-1)){       // �ظ���ֵ����������  
                cnt++;  
            }else{          // ���µ�ֵ���֣���¼��ret  
                ret.append(cnt).append(s.charAt(i-1));  
                cnt = 1;        // ����cnt  
            }  
        }  
        ret.append(cnt).append(s.charAt(i-1));  
        s = ret.toString(); // ����s  
    }  
    return ret.toString(); 
	}*/
	public static void main(String[] args) {
		CountandSay cns = new CountandSay();
		System.out.print(cns.solution(20));
	}
}