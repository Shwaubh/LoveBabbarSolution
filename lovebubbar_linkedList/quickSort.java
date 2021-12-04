package lovebubbar_linkedList;

public class quickSort {
	public static void main(String args[]) {
		int arr[] = {10,5,7,3,2,4,1,5};
		int n = arr.length;
		quickSort q = new quickSort();
		q.sort(arr, 0, n-1);
		q.printArray(arr);
	}

	private void sort(int[] arr, int low, int high) {
		if(low < high) {
			int p1 = partition(arr, low, high);
			sort(arr, low, p1-1);
			sort(arr, p1+1, high);
		}
	}

	private void printArray(int[] arr) {
		int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
	}

	private int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if(arr[j] <= arr[high]) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
}


