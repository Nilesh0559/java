package com.code.stream;

import java.util.Arrays;
import java.util.List;

public class Program {

	/*
	 * Write a Java program to calculate the average of a list of integers using streams.
	 */
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
		System.out.println(nums.toString());
		double avg = nums.stream().mapToDouble(Integer::doubleValue)
			.average()
			.orElse(0.0);
		System.out.println("Average: " + avg);
	}
}
