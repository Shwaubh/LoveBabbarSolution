package lovebubbar_linkedList;

public class mergeSort {
	public static void main(String args[]) {
		int arr[] = {9,4,7,6,3,1,5};
		int l = 0;
		int r = arr.length - 1;
		System.out.println("Before : ");
		for(int i = 0;i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		mergesort(arr, l, r);
		System.out.println("\nAfter : ");
		for(int i = 0;i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void mergesort(int[] arr, int l, int r) {
		if(l < r) {
			int mid = (l + r)/2;
			mergesort(arr, l, mid);
			mergesort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}

	private static void merge(int[] arr, int l, int mid, int r) {
		int b[] = new int[r+1];
		int i = l;//first array ka start index
		int j = mid + 1;// second array ka start index
		int k = l;// start index of new array
		while(i <= mid && j <= r) {//condition to check if one of them exausted or not
			if(arr[i] < arr[j]) {
				b[k] = arr[i];
				i++;
			}else {
				b[k] = arr[j];
				j++;
			}
			k++;
		}
		
		if(i > mid) {
			while(j <= r) {
				b[k] = arr[j];
				k++;
				j++;
			}
		}else {
			while(i <= mid) {
				b[k] = arr[i];
				i++;
				k++;
			}
		}
		
		for(int m = l; m <= r; m++ ) {
			arr[m] = b[m];
		}
	}
}
