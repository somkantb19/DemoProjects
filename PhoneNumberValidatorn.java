package com.codedeveloper.demo1;


import java.util.*;
import java.util.regex.*;

public class PhoneNumberValidatorn {
	private static boolean validate(String str) {
		Pattern p = Pattern.compile("[(][1-9]{3}[)]-[0-9]{3}-[0-9]{4}");
		Matcher m = p.matcher(str);
        boolean result;
		if (m.find() && m.group().equals(str)) {
			result = true;

		} else {
			// System.out.println("invalid number");
			result = false;

		}
	
		return result;
	}
	public static void display() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a valid phone number afresh: ");
		String s = scan.next();
		
		if(validate(s)) {
			
			System.out.println("valid number: "+s);
			
		}
		else {
			/*Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a valid phone number: ");
			String s = scan.next();*/
			display();
		}
		
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
		boolean trigger = validate(s);
		while (trigger) {
			System.out.println("You have entered a valid number: "+s);
			break;
		
		}
		while(!trigger) {
		/*System.out.println("Please enter a valid number again: ");
		 s = scan.next();*/
		 //trigger =validate(s);
		display();
		break;
		}
		scan.close();
	}

}
