package com.main;

/**
 * @author Gulshan
 *
 */
public class App {

	public static void main(String[] args) {

		String s1 = "Test1";

		String s2 = "Test2";

		char result;

		int resultant_value;

		// To return Char at ith position : return type is char
		result = s1.charAt(2);
		System.out.println(result);

		// To compare the strings lexicographically : return type is int
		resultant_value = s1.compareTo(s2);
		System.out.println(resultant_value);

		// To concat a string : returns concatenated string
		s2 = s1.concat(s2);
		System.out.println(s2);

		// check whether string contains sequence of characters : returns true or false
		if (s1.contains("est")) {
			System.out.println("sequence of char present in String");
		}

		// check whether if a string contains a exact equence of characters :returns
		// true or false
		if (s1.contentEquals("Test1")) {
			System.out.println("True");
		}

		// compare 2 Strings : returns true or false // equalsIgnoreCase() also
		if (s1.equals(s2)) {
			System.out.println("Strings are equal");
		}

		// check whether string ends with specified char : return boolean
		// Similarly startswith
		if (s1.endsWith("1")) {
			System.out.println("ends with " + 1);
		}

		// To copy given string into destination char Array
		char[] destArr = new char[20];
		s1.getChars(0, s1.length(), destArr, 0);
		System.out.println(destArr);

		// return index of first occurence ofchar
		System.out.println(s1.indexOf("e"));

		// empty check
		if (!s1.isEmpty()) {
			System.out.println("not empty");
		}

		// replace string : returns modified string after replacing
		System.out.println(s1.replace("1", "0"));

		// replace all
		String temp = "homedone";
		System.out.println(temp.replaceAll("o", "e"));

		// to split the string
		String text = "Hello this is world";

		String[] result1 = text.split(" ");

		for (String str : result1) {
			System.out.println(str);
		}

		// return substring
		System.out.println(s1.substring(1, 2));

		// convert string to charArray

		char[] arr1 = s1.toCharArray();
		System.out.println(arr1);

		// covert to uppercase similarly toLowerCase()
		System.out.println(s1.toUpperCase());

	}

}
