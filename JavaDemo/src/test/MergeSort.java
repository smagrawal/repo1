package test;

public class MergeSort {

	public static void merge(int arr[], int l, int m, int r) {
		
		int n1 = m - l + 1;
		int n2 = r - m;
		int arr1[] = new int [n1];
		int arr2[] = new int [n2];
		for (int i = 0; i < n1; ++i) {
			arr1[i] = arr[l + i];
			
		}
		for (int j = 0; j < n2; ++j) {
			arr2[j] = arr[m + 1 + j];
		}
	//	printArray(arr1);
		//printArray(arr2);
		//System.out.println("sunarray 1: " + );

		int i = 0, j = 0, k = l;
		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j]) {
				arr[k] = arr1[i];
				i++;

			} else {
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = arr2[j];
			j++;
			k++;
		}

	}

	public static void sort(int arr[], int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			sort(arr, l, m);
			sort(arr, m + 1, h);
			merge(arr, l, m, h);
		}
	}
	
	public static void printArray(int arr[]){
		for(int i:arr){
			System.out.print(i +" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 10, 4, 5, 8, 20, 16, 9, 25, 11, 6 };
		int length = arr.length;
		sort(arr, 0, length - 1);
		printArray(arr);

	}

}
