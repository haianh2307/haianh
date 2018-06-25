package Ex2;

public class FindTheSecondLargestNumber {
	
	public static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int temp = arr[i];
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int[] n = { 3, 5, 11, 4, 22, 1, 54 };
		
		insertSort(n);

		System.out.println("After Insert Sort");
		for (int i : n) {
			System.out.print(" " + i);
		}

		// Find the second largest number 
		System.out.println();
		System.out.println("===================================");
		for (int i = 0; i < n.length; i++) {
			if (i == (n.length - 1)) {
				System.out.println("The second largest number is " + n[i - 1]);
			}
		}

	}


}
