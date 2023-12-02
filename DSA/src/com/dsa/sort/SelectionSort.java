package com.dsa.sort;

import java.util.Arrays;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Selection Sort
* 1.	In selection sort algorithm, find out the min value during each pass
* 		and put it at the beginning
* 2.	Not good for larger data set
* Time Complexity : O (n^2)
*******************************************************************/

public class SelectionSort {

	public static void main(String[] args) {
//		Array containing elements
		int[] arr = {2,7,1,9,3,5,8,4,6,0};

//		Pass to selection sort function
		selectionSort(arr);
		
//		selectionSortWithoutMinIndex(arr);
		
//		Print sorted array
		System.out.println("Sorted : " + Arrays.toString(arr));

	}

	private static void selectionSortWithoutMinIndex(int[] arr) {
//		Traverse through array
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
//				If value at i is greater than value at j then swap elements
//				If we need to sort the data set in descending order then change condition
//				to arr[i] < arr[j]
				if(arr[i] > arr[j])
//					Now swap the values at index i and minIndex
					swap(i, j, arr);

			}			
//			This will print sorting at each iteration
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void selectionSort(int[] arr) {
//		Create temporary and minimum value index storage
		int minIndex;
		
//		Traverse through array
		for(int i = 0; i < arr.length-1; i++) {
//			At start minIndex will always be i
			minIndex = i;
			for(int j = i; j < arr.length; j++) {
//				If value at minIndex is greater than value at j then new minIndex will be j
//				If we need to sort the data set in descending order then change condition
//				to arr[minIndex] < arr[j]
				if(arr[minIndex] > arr[j])
					minIndex = j;
			}
//			Now swap the values at index i and minIndex
			swap(i, minIndex, arr);
			
//			This will print sorting at each iteration
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void swap(int i, int minIndex, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = temp;
	}

}
