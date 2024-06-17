package com.code.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	/*
	 * Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
	 */
	public static void main(String[] args) {
		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
		System.out.println(colors.toString());
		List<String> ascColors = colors.stream()
			.map(String::toLowerCase)
			.sorted()
			.collect(Collectors.toList());
		System.out.println("Ascending order: " + ascColors);
		List<String> descColors = colors.stream()
			.map(String::toLowerCase)
			.sorted((str1, str2) -> str2.charAt(0) - str1.charAt(0))
			.collect(Collectors.toList());
		System.out.println("Descending order: " + descColors);
	}
	
	/*
	 * Write a Java program to count the number of strings in a list that start with a specific letter using streams.
	 */
	public static void main5(String[] args) {
		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
		System.out.println(colors.toString());
		long colorsStartingWithB = colors.stream()
			.map(String::toLowerCase)
			.filter(color -> color.startsWith("b"))
			.count();
		System.out.println("Count of colors starting with B: " + colorsStartingWithB);
	}
	
	/*
	 * Write a Java program to remove all duplicate elements from a list using streams.
	 */
	public static void main4(String[] args) {
		List<Integer> nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
		System.out.println(nums.toString());
		List<Integer> distinct = nums.stream()
			.distinct()
			.collect(Collectors.toList());
		System.out.println(distinct.toString());
	}
	
	/*
	 * Write a Java program to calculate the sum of all even, odd numbers in a list using streams
	 */
	public static void main3(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(numbers.toString());
		int even = numbers.stream()
			.filter(n -> n % 2 == 0)
			.reduce(0, ((sum, num) -> sum + num));
		System.out.println("Sum of even: " + even);
		int odd = numbers.stream()
			.filter(num -> num % 2 != 0)
			.reduce(0, (sum, num) -> sum + num);
		System.out.println("Sum of odd: " + odd);
	}
	
	/*
	 * Write a Java program to convert a list of strings to uppercase or lowercase using streams.
	 */
	public static void main2(String[] args) {
		List<String> colors = Arrays.asList("RED", "grEEn", "white", "Orange", "pink");
		System.out.println(colors.toString());
		List<String> upperCase = colors.stream()
			.map(String::toUpperCase)
			.collect(Collectors.toList());
		System.out.println("Upper Case: " + upperCase.toString());
		List<String> lowerCase = colors.stream()
			.map(String::toLowerCase)
			.collect(Collectors.toList());
		System.out.println("Lower Case: " + lowerCase.toString());
	}
	
	/*
	 * Write a Java program to calculate the average of a list of integers using streams.
	 */
	public static void main1(String[] args) {
		List<Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
		System.out.println(nums.toString());
		double avg = nums.stream().mapToDouble(Integer::doubleValue)
			.average()
			.orElse(0.0);
		System.out.println("Average: " + avg);
	}
}
