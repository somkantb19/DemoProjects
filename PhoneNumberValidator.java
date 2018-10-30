package com.codedeveloper.demo1;

import java.util.*;
import java.util.regex.*;

public class PhoneNumberValidator {
	private static String validate(String str) {
		Pattern p = Pattern.compile("[(][1-9]{3}[)]-[0-9]{3}-[0-9]{4}");
		Matcher m = p.matcher(str);
		String result;
		String param=str;
		if (m.find() && m.group().equals(str)) {
			result = "Valid number: " + m.group();

		} else {
			// System.out.println("invalid number");
			result = "invalid number : " + param;
			System.out.println("Number shouldbe in(xxx)-xxx-xxxx" );

		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Pattern p = Pattern.compile("[(][1-9]{3}[)]-[0-9]{3}-[0-9]{4}");
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a valid phone number: ");
		String s = scan.next();
		/*
		 * Matcher m =p.matcher(s); if (m.find()&& m.group().equals(s)) {
		 * System.out.println("Valid number: "+ m.group()); } else {
		 * System.out.println("invalid number"); }
		 */
		validate(s);
		scan.close();
	}

}
