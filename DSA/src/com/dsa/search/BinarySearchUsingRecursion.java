package com.dsa.search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Nilesh Gajendragadkar
 * In binary search algorithm, array/list must be sorted first.
 * It works as below -
 * 1. Sort the array first.
 * 2. Find the middle element of it.
 * 3. If it's the element that we're searching for then exit.
 * 4. If the element we're searching for is less than middle element, find middle of left side array
 *    and repeat the same procedure.
 * 5. If the element we're searching for is greater than middle element, find middle of right side array
 *    and repeat the same procedure.
 *    
 * Time Complexity : O(log n)
 *
 */

public class BinarySearchUsingRecursion {

	public static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,3,6,1,8,0,4,2,7,9};
		Arrays.sort(arr);
		System.out.println("Array : " + Arrays.toString(arr));
		System.out.println("Enter element to search :");
		int element = sc.nextInt();
		int index = binarySearchUsingRecursion(arr, 0, arr.length - 1, element);
		if(index == -1)
			System.out.println("Element not found...");
		else
			System.out.println("Element found at index " + index);
	}

	private static int binarySearchUsingRecursion(int[] arr, int first, int last, int element) {
		int mid = (first + last) / 2;
		if(first > last)
			return -1;
		if(element == mid)
			return mid;
		else if(element < mid)
			return binarySearchUsingRecursion(arr, first, mid-1, element);
		else
			return binarySearchUsingRecursion(arr, mid + 1, last, element);
	}
}
