package com.revature.dsa;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 9, 3, 1, 2, 4, 7, 5, 88, 21, 66 };

		for (int i = 0; i < arr.length; i++) {
			int index = i;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[index] > arr[j]) {
					index = j;
				}
			}

			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		System.out.print(Arrays.toString(arr));
	}
}
