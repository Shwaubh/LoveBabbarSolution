package lovebubbar_bitmanipulation;

public class countOfSetBit {
	public static void main(String args[]) {
		int n = 7;
		int count = 0;
		while(n > 0) {
			int bit = n & 1;
			if(bit == 1) {
				count++;
			}
			n = n>>1;		
		}
		System.out.print(count);
	}
}
