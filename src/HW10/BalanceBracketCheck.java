package HW10;

public class BalanceBracketCheck {

	public static boolean isBalance(String expr) {
		Stack<Character> s = new ArrayStack<Character>(expr.length());
		for(int i = 0; i < expr.length(); i ++) {
			char current = expr.charAt(i);
			if(isOpen(current)) {
				s.push(current);
			} else {
				if(Character.isDigit(current) || Character.isAlphabetic(current)) {
					continue;
				}
				if(s.isEmpty()) {
					return false;
				}
				char temp = s.pop();	
				if(!isMatch(temp, current)) {
					return false;
				}
			}
		}
		
		return s.isEmpty();
	}
	private static boolean isMatch(char left, char right) {
		switch(left) {
			case '(' :
				return right == ')';
			case '[' :
				return right == ']';
			case '{' : 
				return right == '}';
			default: 
				//this should not happen
				return false;
				
		}
	}
	private static boolean isOpen(char current) {
		//(, [, {
		if(current == '(' || current == '[' || current == '{') {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isBalance("()"));

	}

}
