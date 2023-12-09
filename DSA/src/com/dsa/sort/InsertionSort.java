package com.dsa.sort;

import java.util.Arrays;

/*******************************************************************
 * Author: Nilesh Gajendragadkar
 * 1. 	In insertion sort, we take the element and compare it with all of it's previous
 * 		elements
 * 2.	If the previous element is less than selected element then continue.
 * 3.	If the previous element is greater than selected element then shift the 
 * 		elements one by one until selected element becomes greater
 * 
 * Time Complexity - O(n^2)
 *******************************************************************/

public class InsertionSort {

	public static void main(String[] args) {
//			Array containing elements
		int[] arr = { 2, 7, 1, 9, 3, 5, 8, 4, 6, 0 };

//			Print array
		System.out.println("Before sorting : " + Arrays.toString(arr));

//			Pass to insertion sort function
		insertionSort(arr);

//			Print sorted array
		System.out.println("After sorting: " + Arrays.toString(arr));
	}
	
	private static void insertionSort(int[] arr) {
		int temp, j;
		for(int i = 1; i < arr.length; i++) {
			temp = arr[i];
//			compare the element with all of its previous elements and find the appropriate position
//			for it and insert element at the position
			for(j = i-1; j >= 0 && temp <= arr[j]; j--) {
					arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
	}
}
