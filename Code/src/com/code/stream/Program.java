package com.code.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	/*
	 * Write a Java program to calculate the sum of all even, odd numbers in a list using streams
	 */
	public static void main(String[] args) {
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
