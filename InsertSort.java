package homeWorkOop1;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		arrayFullfill(array1);
		arrayOut(array1);
		insertSort(array1);
		arrayOut(array1);

	}

	public static void arrayFullfill(int[] array_in) {
		for (int i = 0; i < array_in.length; i++) {
			array_in[i] = (int) (Math.random() * 100);
		}
		//System.out.println(array_in);
	}

	public static void insertSort(int[] array_sort) {
		for (int i = 1; i < array_sort.length; i++) {
			int sortTemp = array_sort[i];
			int j = i;
			while (j > 0 && array_sort[j - 1] > sortTemp) {
				array_sort[j] = array_sort[j - 1];
				j--;
			}
			array_sort[j] = sortTemp;
		}
		//System.out.println(array_sort);
	}

	public static void arrayOut(int[] array_out) {
		System.out.println(Arrays.toString(array_out));
	 }

}
