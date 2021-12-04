package lovebubbar_bitmanipulation;

public class powerOf2 {
	public static void main(String args[]) {
		if (isPowerOfTwo(31))
            System.out.println("Yes");
        else
            System.out.println("No");
 
        if (isPowerOfTwo(64))
            System.out.println("Yes");
        else
            System.out.println("No");
	}

	private static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return false;
		while(n !=  1) {
			if(n % 2 != 0) {
				return false;
			}
			n = n/2;
		}
		return true;		
	}
}
