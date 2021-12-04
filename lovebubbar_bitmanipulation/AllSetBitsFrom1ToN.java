package lovebubbar_bitmanipulation;

public class AllSetBitsFrom1ToN {
	public static void main(String args[]) {
		int n = 400;
		int p = 0;
		int count = 0;
		for(int i = 1; i <= n; i++) {
			p = i;
			while(p > 0) {
				int bit = p & 1;
				if(bit == 1) {
					count++;
				}
				p = p >> 1;
			}
		}
		System.out.println(count);
	}
}
