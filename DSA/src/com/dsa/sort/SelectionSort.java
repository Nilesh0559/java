package com.dsa.sort;

import java.util.Arrays;

/**
 * 
 * @author Nilesh Gajendragadkar 
 * Selection sort algorithm finds the smallest element in an array/list in each iteration and puts it at the
 * beginning of unsorted array/list. 
 * It works as below - 
 * 1. Take the first element of unsorted array/list and consider it as smallest element. 
 * 2. Now compare that element with next element. If next element is smaller then consider it as 
 *    smaller element, otherwise move to next element till end of array/list. 
 * 3. After iterating complete array/list, you'll eventually find the smallest element from that array/list 
 *    and swap it with the first element. 
 * 4. Repeat steps 1, 2, 3 for all iterations till end of array/list. This will give you sorted array.
 * 
 */

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[] { 5, 3, 6, 1, 8, 0, 4, 2, 7, 9 };
		System.out.println("Array before sort : " + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

	private static void selectionSort(int[] arr) {
		int min;
		for (int j = 0; j < arr.length-1; j++) {
			min = j;
			for (int i = j+1; i < arr.length; i++) {
				if (arr[min] > arr[i])
					min = i;
			}
			swap(arr, j, min);
		}
	}

	private static void swap(int[] arr, int j, int min) {
		int temp = arr[j];
		arr[j] = arr[min];
		arr[min] = temp;
	}
}
