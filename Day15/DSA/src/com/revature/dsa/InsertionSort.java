package com.revature.dsa;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 9, 10, 1, 2, 4, 7, 5, 88, 21, 66 };

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		System.out.print(Arrays.toString(arr));
	}

}
