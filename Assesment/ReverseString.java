package Assesment;

import java.io.*;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		String original = "Hello World";
		String reversed = reverseString(original);
		System.out.println(reversed);
	}

	public static String reverseString(String str) {
		String[] words = str.split("\\s+"); // Split the string into words
		StringBuilder reversed = new StringBuilder();

		// Reverse each word and append it to the StringBuilder
		for (String word : words) {
			StringBuilder reversedWord = new StringBuilder(word).reverse();
			reversed.append(reversedWord).append(" ");
		}

		// Remove the trailing space before returning
		return reversed.toString().trim();
	}
}