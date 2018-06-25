package Group5;

public class InsertSortSample {

	public static void insertSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
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
		System.out.println("Before Insert Sort:");
		for (int i : n) {
			System.out.print(" " + i);
		}
		System.out.println();
		System.out.println("==================================");

		insertSort(n);

		System.out.println("After Insert Sort");
		for (int i : n) {
			System.out.print(" " + i);
		}

	}

}
