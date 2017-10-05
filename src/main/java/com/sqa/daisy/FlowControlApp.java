/**
 * File Name: FlowControlApp.java<br>
 * Jiadi, Wu<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: 2017Äê10ÔÂ2ÈÕ
 */
package com.sqa.daisy;

import java.util.*;

import com.sqa.daisy.helpers.*;

/**
 * FlowControlApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Jiadi, Wu
 * @version 1.0.0
 * @since 1.0
 */
public class FlowControlApp {

	/**
	 */
	private static String appName = "Flow Control App";

	private static Scanner sc;

	private static Scanner input;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		evalNumberAgainst10();
		determineMonthBasedOnInt();
		evalGrade();
		AppBasics.farewellUser(name, appName);
	}

	/**
	 * Write a program that prints the name of month using switch statement
	 * given a number from the user. *You will need to use the
	 * Integer.parseInt() method to convert a user supplied string to a number
	 * type variable that can be evaluated.
	 */
	private static void determineMonthBasedOnInt() {
		String month;
		int num;
		sc = new Scanner(System.in);
		System.out.println("Please supply a number representing month in a year!");
		month = sc.nextLine();
		num = Integer.parseInt(month);
		switch (num) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Febuary");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		}
	}

	/**
	 * Write a program that can ask the user for a grade value and print the
	 * associated grade letter.
	 */
	private static void evalGrade() {
		int grade;
		input = new Scanner(System.in);
		System.out.println("Enter an integer grade value from 0 to 100!");
		grade = input.nextInt();
		if (grade >= 90) {
			System.out.println("Your grade  is A ");
		} else if (grade < 90 && grade >= 80) {
			System.out.println("Your grade  is B ");
		} else if (grade < 80 && grade >= 70) {
			System.out.println("Your grade  is C ");
		} else if (grade < 70 && grade >= 60) {
			System.out.println("Your grade  is D ");
		} else {
			System.out.println("Your grade  is F");
		}
	}

	/**
	 * Write a function which takes a int parameter and print the message on
	 * screen that ¡°number is greater than 10¡± otherwise it should print ¡°number
	 * is smaller than 10¡± (Can you support if parameter is equal to 10)
	 */
	private static void evalNumberAgainst10() {
		sc = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		int num = sc.nextInt();
		if (num > 10) {
			System.out.println("number is greater than 10");
		} else if (num < 10) {
			System.out.println("number is smaller than 10");
		} else {
			System.out.println("number equals to 10");
		}
	}
}
