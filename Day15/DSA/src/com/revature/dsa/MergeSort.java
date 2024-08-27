package com.revature.dsa;

import java.util.Arrays;

public class MergeSort {
	public static void mergeSort(int arr[]) {
		if (arr.length <= 1) {
			return;
		}

		int mid = arr.length / 2;
		int[] left = Arrays.copyOfRange(arr, 0, mid);
		int[] right = Arrays.copyOfRange(arr, mid, arr.length);

		mergeSort(left);
		mergeSort(right);

		merge(arr, left, right);
	}

	public static void merge(int arr[], int left[], int right[]) {
		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if(left[i]<=right[j])
			{
				arr[k]=left[i];
				k++;
				i++;
			}else
			{
				arr[k]=right[j];
				j++;
				k++;
			}
			
		}
		
		while(i<left.length)
		{
			arr[k]=left[i];
			k++;
			i++;
		}
		
		while(j<right.length)
		{
			arr[k]=right[j];
			k++;
			j++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 9, 3, 1, 2, 4, 7, 5, 88, 21, 66 };
		mergeSort(arr);
		System.out.print(Arrays.toString(arr));
	}

}
