package lovebubbar_bitmanipulation;

public class SquareOfANumber {
	public static void main(String args[]) {
		for(int i = 1; i <= 5; i++) {
			System.out.println("n = " +i+", n^2 = "+ square(i));
		}
	}

	private static int square(int n) {
		
		if(n < 0) {
			n = -n;
		}
		
		int res = n;
		
		for(int i = 1; i < n; i++) {
			res = res + n;
		}
		
		return res; 
	}
}
