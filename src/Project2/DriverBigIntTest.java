package Project2;

public class DriverBigIntTest {
	
	 public static void main(String [] args) {
	        System.out.println("Unit tests for the BigInt class.");
	        System.out.println();

	        /* 
	         * You should uncomment and run each test--one at a time--
	         * after you build the corresponding methods of the class.
	         */

	        System.out.println("Test 1: result should be 7");
	        int[] a1 = { 0,0,0,0,0,0,0,0,0,0,0,0,0,1,2,3,4,5,6,7 };
	        BigInt b1 = new BigInt(a1);
	        System.out.println(b1.getNumSigDigits());
	        System.out.println();
	        
	        System.out.println("Test 2: result should be 1234567");
	        b1 = new BigInt(a1);
	        System.out.println(b1);
	        System.out.println();
	        
	        System.out.println("Test 3: result should be 0");
	        int[] a2 = { 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 };
	        BigInt b2 = new BigInt(a2);
	        System.out.println(b2);
	        System.out.println();
	        
	        System.out.println("Test 4: should throw an IllegalArgumentException");
	        try {
	            int[] a3 = { 0,0,0,0,23,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 };
	            BigInt b3 = new BigInt(a3);
	            System.out.println("Test failed.");
	        } catch (IllegalArgumentException e) {
	            System.out.println("Test passed.");
	        } catch (Exception e) {
	            System.out.println("Test failed: threw wrong type of exception.");
	        }
	        System.out.println();
	        System.out.println("Test 5: result should be 1234567");
	        b1 = new BigInt(1234567);
	        System.out.println(b1);
	        System.out.println();
	        System.out.println("Test 6: result should be 0");
	        b2 = new BigInt(0);
	        System.out.println(b2);
	        System.out.println();
	        System.out.println("Test 7: should throw an IllegalArgumentException");
	        try {
	            BigInt b3 = new BigInt(-4);
	            System.out.println("Test failed.");
	        } catch (IllegalArgumentException e) {
	            System.out.println("Test passed.");
	        } catch (Exception e) {
	            System.out.println("Test failed: threw wrong type of exception.");
	        }
	        System.out.println();
	        System.out.println("Test 8: result should be 0");
	        b1 = new BigInt(12375);
	        b2 = new BigInt(12375);
	        System.out.println(b1.compareTo(b2));
	        System.out.println();
	        System.out.println("Test 9: result should be -1");
	        b2 = new BigInt(12378);
	        System.out.println(b1.compareTo(b2));
	        System.out.println();
	        System.out.println("Test 10: result should be 1");
	        System.out.println(b2.compareTo(b1));
	        System.out.println();
	        System.out.println("Test 11: result should be 0");
	        b1 = new BigInt(0);
	        b2 = new BigInt(0);
	        System.out.println(b1.compareTo(b2));
	        System.out.println();
	        System.out.println("Test 12: result should be\n123456789123456789");
	        int[] a4 = { 3,6,1,8,2,7,3,6,0,3,6,1,8,2,7,3,6 };
	        int[] a5 = { 8,7,2,7,4,0,5,3,0,8,7,2,7,4,0,5,3 };
	        BigInt b4 = new BigInt(a4);
	        BigInt b5 = new BigInt(a5);
	        BigInt sum = b4.add(b5);
	        System.out.println(sum);
	        System.out.println();
	        System.out.println("Test 13: result should be\n123456789123456789");
	        System.out.println(b5.add(b4));
	        System.out.println();
	        System.out.println("Test 14: result should be\n3141592653598");
	        b1 = new BigInt(0);
	        int[] a6 = { 3,1,4,1,5,9,2,6,5,3,5,9,8 };
	        b2 = new BigInt(a6);
	        System.out.println(b1.add(b2));
	        System.out.println();
	        System.out.println("Test 15: result should be\n10000000000000000000");
	        int[] a19 = { 9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9 };    // 19 nines!
	        b1 = new BigInt(a19);
	        b2 = new BigInt(1);
	        System.out.println(b1.add(b2));
	        System.out.println();
	        System.out.println("Test 16: should throw an ArithmeticException");
	        int[] a20 = { 9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9 };  // 20 nines!
	        try {
	            b1 = new BigInt(a20);
	            System.out.println(b1.add(b2));
	        } catch (ArithmeticException e) {
	            System.out.println("Test passed.");
	        } catch (Exception e) {
	            System.out.println("Test failed: threw wrong type of exception.");
	        }
	        System.out.println();
	        System.out.println("Test 17: result should be 5670");
	        b1 = new BigInt(135);
	        b2 = new BigInt(42);
	        BigInt product = b1.mul(b2);
	        System.out.println(product);
	        System.out.println();
	        System.out.println("Test 18: result should be\n99999999999999999999");
	        b1 = new BigInt(a20);   // 20 nines -- see above
	        b2 = new BigInt(1);
	        System.out.println(b1.mul(b2));
	        System.out.println();
	        System.out.println("Test 19: should throw an ArithmeticException");
	        try {
	            b1 = new BigInt(a20);
	            b2 = new BigInt(2);
	            System.out.println(b1.mul(b2));
	        } catch (ArithmeticException e) {
	            System.out.println("Test passed.");
	        } catch (Exception e) {
	            System.out.println("Test failed: threw wrong type of exception.");
	        }
	        System.out.println();

	    }
}

