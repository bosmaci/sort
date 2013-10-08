package main;

public class Util {
	public static int[] mergeSort(int[] elems) {
		if (elems != null && elems.length > 0) {
			int left = 0;
			int right = elems.length - 1;
			mergeSort(elems, left, right);
		}
		return elems;
	}

	private static void mergeSort(int[] elems, int left, int right) {
		int center = (left + right) / 2;
		mergeSort(elems, left, center);
		mergeSort(elems, center + 1, right);
		merge(elems, left, right);
	}

	private static void merge(int[] elems, int left, int right) {
		if (elems[left] < elems[right]) {
			int leftValue = elems[left];
			elems[right] = elems[left];
			elems[left] = leftValue;
		}
	}
}
