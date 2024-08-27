package com.revature.dsa;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 9, 3, 1, 2, 4, 7, 5, 88, 21, 66 };
		boolean isSwapped = false;

		for (int i = 0; i < arr.length; i++) {
			isSwapped = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isSwapped = true;
				}
			}
			if (!isSwapped) {
				break;
			}

		}

		System.out.print(Arrays.toString(arr));

	}

}
