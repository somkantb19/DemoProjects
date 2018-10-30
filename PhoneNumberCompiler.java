package com.codedeveloper.demo1;


import java.util.*;
import java.util.regex.*;

public class PhoneNumberCompiler {
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
		System.out.println("Please enter a valid phone number afresh, in the correct format (xxx)-xxx-xxxx:  ");
		String s = scan.next();
		
		
		
		if(validate(s)) {
			
			System.out.println("valid number: "+s);
			
		}
		else {
			
			Pattern q = Pattern.compile("[1-9][0-9]{9}");
			Matcher n = q.matcher(s);
			
			if (n.find()&&n.group().equals(s)){
				
				String l1=s.substring(0, 3);
				String l2=s.substring(3, 6);
				String l3=s.substring(6, 9);
				System.out.println("converted to correct format : "+"("+l1+")"+"-"+l2+"-"+l3);
				
			
			} else
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
		System.out.println("Please enter a valid phone number: \n");
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
			Pattern q = Pattern.compile("[1-9][0-9]{9}");
			Matcher n = q.matcher(s);
			
			if (n.find()&&n.group().equals(s)){
				
				String l1=s.substring(0, 3);
				String l2=s.substring(3, 6);
				String l3=s.substring(6, 9);
				System.out.println("converted to correct format : "+"("+l1+")"+"-"+l2+"-"+l3);
				
				
			}
			else {
		display();
			}
		break;
		}
		scan.close();
	}

}
