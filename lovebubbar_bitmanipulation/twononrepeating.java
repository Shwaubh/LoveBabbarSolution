package lovebubbar_bitmanipulation;

import java.util.TreeMap;

public class twononrepeating {
	public static void main(String args[]) {
		int arr[] = {1,2,3,4,5,1,2,3};
		int n = arr.length;
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			if(map.containsKey(arr[i])) {
				map.remove(arr[i]);
			}else {
				map.put(arr[i], 1);
			}
		}
		System.out.print(map.firstKey() + " " + map.lastKey());
	}
}
