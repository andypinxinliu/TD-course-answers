package Project3;

public class test {
	public static void main(String args[]) {
		String test = "Rabbit";
		int a = find('b', test);
		System.out.print(a);
	}	
	
	public static int find(char ch, String str) {
		if (str == null || str.equals("")) {
			// base case: no more string to search; return -1
			return -1;
		} 
		else if (ch == str.charAt(0))
			return 0;
		int subIndex = find(ch, str.substring(1));
		
		if(subIndex == -1)
			return -1;
		else
			return 1 + subIndex;
		
	}
}
