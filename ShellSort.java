package homeWorkOop1;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {

		int[] arrayForSort = new int[10];
		arrayFullfill(arrayForSort);
		arrayOut(arrayForSort);
		shellSort(arrayForSort);
		arrayOut(arrayForSort);

	}

	public static void arrayFullfill(int[] array_in) {
		for (int i = 0; i < array_in.length; i++) {
			array_in[i] = (int) (Math.random() * 100);
		}

	}

	public static void shellSort(int[] array) {

		
		for (int gap = array.length / 2; gap > 0; gap = gap / 2) {
			for (int i = gap; i < array.length; i++) {
				int sortTemp = array[i];
				for (int j = i; j >= gap; j = j - gap) {
					if (sortTemp < array[j - gap]) {
						array[j] = array[j - gap];
					} else {
						break;
					}
				}
				array[i] = sortTemp;
			} 
		}

	}
	
	public static void arrayOut(int[] array_out) {
		System.out.println(Arrays.toString(array_out));
	 }

}
