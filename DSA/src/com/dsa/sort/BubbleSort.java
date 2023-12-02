package com.dsa.sort;
import java.util.Arrays;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic	: Bubble Sort
* 1.	In bubble sort, compare two adjacent elements and swap if first element
* 		greater than second which will put greater element at last during each pass
* 2.	No good for larger data set
* Time Complexity : O(n^2)
*******************************************************************/

public class BubbleSort {

	public static void main(String[] args) {
//		Array containing elements
		int[] arr = {2,7,1,9,3,5,8,4,6,0};
		
//		Print array
		System.out.println("Before sorting : " + Arrays.toString(arr));
		
//		Pass to bubble sort function
		bubbleSort(arr);
		
		improvedBubbleSort(arr);
		
		moreImprovedBubbleSort(arr);
		
//		Print sorted array
		System.out.println("After sorting: " + Arrays.toString(arr));

	}

	private static void moreImprovedBubbleSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
//			track if values are swapped or not
			boolean swap = false;
//			Below modification in condition will reduce the number of passes
//			for already sorted data set
			for(int j = 0; j < arr.length-1-i; j++) {
//				Compare two adjacent elements and swap them if needed
				if(arr[j] > arr[j+1]) {
					swap(arr, j);
					swap = true;
				}
			}
			System.out.println(Arrays.toString(arr));
//			If there isn't any single swap then array is already sorted
			if(swap == false)
				break;
		}
		
	}

	private static void improvedBubbleSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
//			Below modification in condition will reduce the number of passes
//			for already sorted data set
			for(int j = 0; j < arr.length-1-i; j++) {
//				Compare two adjacent elements and swap them if needed
				if(arr[j] > arr[j+1])
					swap(arr, j);
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1; j++) {
//				Compare two adjacent elements and swap them if needed
				if(arr[j] > arr[j+1])
					swap(arr, j);
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void swap(int[] arr, int i) {
		int temp = arr[i];
		arr[i] = arr[i+1];
		arr[i+1] = temp;
		
	}
}
