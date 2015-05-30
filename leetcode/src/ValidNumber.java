public class ValidNumber {
	public boolean isNumber(String s) {
		if (s == null)
			return false;
		if (s.length() == 1)
			if('0' <= s.charAt(0) && s.charAt(0) <= '9')
			return true;
			else 
				return false;
		boolean start = false, exp = false, point = false;
		int i = 0;
		while (i < s.length() - 1) {
			switch (s.charAt(i)) {
			case '+':
			case '-':
				if (start)
					if (s.charAt(i - 1) != 'e')
						return false;
				// if(s.charAt(i+1) == null) return false;
				if (s.charAt(i + 1) != '.')
					if (s.charAt(i + 1) < '0' || s.charAt(i + 1) > '9')
						return false;
					else
						start = true;
				break;
			case '.':
				if (exp == true)
					return false;
				if (point == true)
					return false;
				if (s.charAt(i + 1) != ' ' && s.charAt(i + 1) != 'e')
					if (s.charAt(i + 1) < '0' || s.charAt(i + 1) > '9')
						return false;
					else
						start = true;
				point = true;
				break;
			case 'e':
				if (start == false)
					return false;
				if (exp == true)
					return false;
				if (s.charAt(i + 1) != '+' && s.charAt(i + 1) != '-')
					if (s.charAt(i + 1) < '0' || s.charAt(i + 1) > '9')
						return false;
				exp = true;
				break;
			case ' ':
				if (start == true || point == true) {
					if (s.charAt(i + 1) != ' ')
						return false;
				} else if (s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9')
					start = true;
				break;
			default:
				if (s.charAt(i) < '0' || s.charAt(i) > '9')
					return false;
				start = true;
			}
			i++;
		}
		if (s.charAt(s.length() - 1) < '0' || s.charAt(s.length() - 1) > '9')
			if (start == true && (s.charAt(s.length() - 1) == ' '
					|| (point == false && exp == false && s.charAt(s.length() - 1) == '.')))
				return true;
			else
				return false;
		return start;
	}

	public static void main(String[] args) {
		ValidNumber v = new ValidNumber();
		String s = ".1.";
		if (v.isNumber(s))
			System.out.print("True");
		else
			System.out.print("False");
	}

}
