package com.dsa.search;

/*******************************************************************
* Author: Nilesh Gajendragadkar
* Topic : Linear Search
* 
* 1.	Linear search iterates through collection one by one and check if
* 		element is present in the collection.
* 2. 	Good for small size collection especially collection where elements 
* 		are not allowed to access randomly (Lists)
* 3. 	Time Complexity = O(n)
*******************************************************************/

public class LinearSearch {
	
	public static void main(String[] args) {
	
//		Array containing elements
		int[] arr = {5,2,7,1,9,5,7,3,8,4,6,0};
		
//		Element to be searched
		int element = 3;
		
		int index = linearSearch(arr, element);
		
		if(index != -1)
			System.out.println("Element " + element + " found at index " + index);
		else
			System.out.println("Element " + element + " not found");
	}

	private static int linearSearch(int[] arr, int element) {
//		loop through each element of array
		for(int i = 0; i < arr.length; i++) {
//			if element is present then print its index and break loop
			if(arr[i] == element)
				return i;
		}
		return -1;
	}
}
