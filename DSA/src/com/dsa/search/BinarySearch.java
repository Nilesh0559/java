package com.dsa.search;

import java.util.Arrays;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* 
* Topic : Binary Search
* 
* 1.	In binary search, first sort the collection.
* 2.	Find out the middle element of the collection.
* 3.	Check if the element to be searched is equal to middle element.
* 		If it's middle element then return.
* 4.	If element to be searched is less than middle element, 
* 		consider the left side of collection (assuming collection is sorted in ascending order),
* 		and continue from step 2 again.
* 5.	If element to be searched is greater than middle element,
* 		consider the righ side of collection (assuming collection is sorted in ascending order),
* 		and continue from step 2 again.
* 
* 6. Time Complexity (O log n)
*******************************************************************/

public class BinarySearch {

	public static void main(String[] args) {
//		Array containing elements
		int[] arr = {2,7,1,9,5,3,8,4,6,0};
		
//		Element to be searched
		int element = 3;

//		Sort the array
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int index = binarySearch(arr, element);
		
		if(index != -1)
			System.out.println("Element " + element + " found at index " + index);
		else
			System.out.println("Element " + element + " not found");
	}

	private static int binarySearch(int[] arr, int element) {
		int left = 0, right = arr.length-1, mid;
		while(left <= right) {
			mid = left + right / 2;
			if(element == arr[mid])
				return mid;
			else if(element < arr[mid])
				right = mid - 1;
			else if(element > arr[mid])
				left = mid + 1;
		}
			return -1;
	}
}
