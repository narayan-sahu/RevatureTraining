package com.revature.dsa;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {7,5,3,2,1,4,9,8};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int left=0;
		int right=arr.length-1;
		int key=9;
		
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(arr[mid]==key)
			{
				System.out.print("Element Found At :"+mid);
				return;
			}
			else if(arr[mid]<key)
			{
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		System.out.print("Element Not Found");
	}

}
