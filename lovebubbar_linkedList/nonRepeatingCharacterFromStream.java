package lovebubbar_linkedList;

import java.util.ArrayList;
import java.util.List;

public class nonRepeatingCharacterFromStream {
	public static void main(String[] args)
    {
        findFirstNonRepeating();
    }
	final static int MAX_CHAR = 256;
	private static void findFirstNonRepeating() {
		List<Character> inDLL = new ArrayList<Character>();
		boolean[] repeated = new boolean[MAX_CHAR];
		
		String stream = "geeksforgeeksandgeeksquizfor";
		for (int i = 0; i < stream.length(); i++) {
			char x = stream.charAt(i);
			System.out.println("Reading " + x + " from stream \n");
			
			if(!repeated[x]) {
				if(!inDLL.contains(x)) {
					inDLL.add(x);
				}else {
					inDLL.remove((Character)x);
					repeated[x] = true;
				}
			}
			
			if (inDLL.size() != 0) {
                System.out.print(
                    "First non-repeating character so far is ");
                System.out.println(inDLL.get(0));
            }
		}
	}
	
}
