package com.dsa.search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Nilesh Gajendragadkar
 * In binary search algorithm, the array/list must be sorted first.
 * It works as below -
 * 1. Sort the array/list
 * 2. Find the middle element for array/list
 * 3. If middle element is the one we're searching for then exit
 * 4. If middle element is greater than element we're searching for then find the middle of
 *    left side array & repeat same
 * 5. If middle element is less than element we're searching for then find the middle of 
 *    right side array & repeat same
 *    
 * Time Complexity : O(log n)
 *
 */

public class BinarySearchUsingLoop {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,3,6,1,8,0,4,2,7,9};
		Arrays.sort(arr);
		System.out.println("Array : " + Arrays.toString(arr));
		System.out.println("Enter element to search : ");
		int element = sc.nextInt();
		int index = -1;
		index = binarySearch(arr, 0, arr.length-1, element);
		if(index == -1)
			System.out.println("Element not found...");
		else
			System.out.println("Element present at index " + index);
	}

	private static int binarySearch(int[] arr, int first, int last, int element) {
		int mid;
		while(first <= last) {
			mid = (first + last) / 2;
			if(element == arr[mid])
				return mid;
			else if(element < arr[mid])
				last = mid - 1;
			else
				first = mid + 1;
		}
		return -1;
	}
}
