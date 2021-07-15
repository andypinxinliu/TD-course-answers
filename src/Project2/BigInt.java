package Project2;

/* 
 * BigInt.java
 *
 * A class for objects that represent non-negative integers of 
 * up to 20 digits.
 */

public class BigInt  {
    // the maximum number of digits in a BigInt -- and thus the length
    // of the digits array
    private static final int SIZE = 20;
    
    // the array of digits for this BigInt object
    private int[] digits;
    
    // the number of significant digits in this BigInt object
    private int numSigDigits;

    /*
     * Default, no-argument constructor -- creates a BigInt that 
     * represents the number 0.
     */
    public BigInt() {
        this.digits = new int[SIZE];
        this.numSigDigits = 1;  // 0 has one sig. digit--the rightmost 0!
    }
    
    public BigInt(int[] arr) {
    	if(arr.length > SIZE || arr == null) {
    		throw new IllegalArgumentException();
    	}
    	else{
    		digits = new int[SIZE];
    		for(int i = 1; i <= arr.length; i++) {
    			if(arr[arr.length-i] < 0 || arr[arr.length-i] >= 10) {
    				throw new IllegalArgumentException();
    			}
    			else {
    				digits[SIZE-i] = arr[arr.length-i];
    			}
    			}
        	}
    	int temp = 0;
    	numSigDigits = 1;
        for(int j = 0; j < SIZE; j++) {
        	if(digits[j] == 0)
    			temp ++;
    		else {
    			numSigDigits = SIZE - temp;
    			break;
    		}
        	}
        	
    	}
    
    public BigInt(int n) {
    	int i = 1; //times of calculation
    	this.digits = new int[SIZE];
    	if(n < 0) {
    		throw new IllegalArgumentException();
    	}
    	else if(n == 0) {
            this.numSigDigits = 1;
    	}
    	else {
    		while(n > 0) {
        		int remain = n % 10;
        		n /= 10;
        		digits[SIZE-i] = remain;
        		i++;
        	}
    		int temp = 0;	
            for(int j = 0; j < SIZE; j++) {
            	if(digits[j] == 0)
        			temp ++;
        		else {
        			numSigDigits = SIZE - temp;
        			break;
        		}
            	}
    	}
    }
    
    public int getNumSigDigits() {
    	return numSigDigits;
    }
    
    public int[] getDigits() {
    	return digits;
    }
    
    public String toString() {
    	String result = "";
    	int startPoint = -1;
    	for(int i = 0; i < SIZE; i++) {
    		if(digits[i] != 0) {
    			startPoint = i;
    			break;
    		}
    	}
    	if(startPoint == -1) {
    		result += 0;
    	}
    	else {
    		for(int j = startPoint; j < SIZE; j++) {
    			result += digits[j];
    		}
    	}
    	return result;
    }
    
    public int compareTo(BigInt other) {
    	if(other == null) {
    		throw new IllegalArgumentException();
    	}
    	else {
    		for(int i = 0; i < SIZE; i++) {
    			if(digits[i] < other.digits[i]) {
    				return -1;
    			}
    			else if(digits[i] > other.digits[i]) {
    				return 1;
    			}
    			else {
    				continue;
    			}
    		}
    	}
    	return 0;
    }
    
    public BigInt add(BigInt other) {
    	if(other == null) {
    		throw new IllegalArgumentException();
    	}
    	BigInt result = new BigInt();
    	boolean addOne = false;  //whether to add one
    	for(int i = 1; i <= SIZE; i++) {
    		int tempResult = digits[SIZE-i] + other.digits[SIZE-i];
    		int finalResult;
    		if(addOne) {
    			tempResult++;
    		}
    		if(i == SIZE) {
    			if(tempResult >= 10){
    				throw new ArithmeticException();
    			}
    		}
    		if(tempResult >= 10) {
    			finalResult = tempResult % 10;
    			addOne = true;
    		}
    		else {
    			finalResult = tempResult;
    			addOne = false;
    		}
    		result.digits[SIZE-i] = finalResult;
    	}
    	return result;
    }
    
    public BigInt mul(BigInt other) {
    	if(other == null) {
    		throw new IllegalArgumentException();
    	}
    	BigInt unit = new BigInt(1);
    	BigInt time = new BigInt(1);  //times of multiply
    	BigInt result = new BigInt();
    	while(time.compareTo(other) != 1) {
    		result = result.add(this);
    		time = time.add(unit);
    	}
    	return result;
    }
    
    
}
