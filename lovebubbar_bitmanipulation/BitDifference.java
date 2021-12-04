package lovebubbar_bitmanipulation;

public class BitDifference {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		int aXORb = a^b;
		int count = 0;
		while(aXORb > 0) {
			int bit = aXORb & 1;
			if(bit == 1) {
				count++;
			}
			aXORb = aXORb >> 1;
		}
		System.out.print(count);
	}
}
