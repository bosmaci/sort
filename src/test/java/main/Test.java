package main;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void testMergeSort() {
		int[] a = {1,4,3,2};
		for (int i : a) {
			System.out.print(i);
		}
		Util.mergeSort(a);
		for (int i : a) {
			System.out.print(i);
		}
		fail("Not yet implemented");
	}
}
