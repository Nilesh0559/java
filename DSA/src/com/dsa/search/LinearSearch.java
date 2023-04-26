package com.dsa.search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author Nilesh Gajendragadkar
 * In linear search algorithm, element is search by comparing it to other elements 
 * one by one.
 * Time Complexity : O(n)
 *
 */

public class LinearSearch {

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,3,6,1,8,0,4,2,7,9};
		System.out.println("Array : " + Arrays.toString(arr));
		System.out.println("Enter element to search : ");
		int searchElement = sc.nextInt();
		for(int i = 0; i < arr.length; i++) {
			if(searchElement == arr[i]) {
				System.out.println("Element found at index " + i);
				break;
			}
			if(i == arr.length-1)
				System.out.println("Element not found...");
		}
	}
}
