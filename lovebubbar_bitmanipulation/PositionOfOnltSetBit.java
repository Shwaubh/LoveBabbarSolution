package lovebubbar_bitmanipulation;

public class PositionOfOnltSetBit {
	public static void main(String args[]) {
		int n = 12;
		int pos = findPosition(n);
		if(pos == -1) {
			System.out.print("Invalid number");
		}else {
			System.out.print("Position : " + pos);
		}
	}

	private static int findPosition(int n) {
		int pos = 1;
		if(!isPowerOfTwo(n)) {
			return -1;
		}else {
			while((n & 1) == 0 ) {
				pos++;
				n = n >> 1;
			}	
		}
		return pos;
	}

	private static boolean isPowerOfTwo(int n) {
		if(n == 0) {
			return false;
		}else {
			while(n != 1) {
				if(n % 2 != 0) {
					return false; 
				}
				n = n/2;
			}
		}
		return true;
	}
}
