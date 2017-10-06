/**
 * File Name: LoopsApp.java<br>
 * Jiadi, Wu<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: 2017Äê10ÔÂ4ÈÕ
 */
package com.sqa.daisy.fun;

import java.util.*;

import com.sqa.daisy.helpers.*;

/**
 * LoopsApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Jiadi, Wu
 * @version 1.0.0
 * @since 1.0
 */
public class LoopsApp {

	private static String appName = "Fun with Loops";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		doForLoopExercise();
		doWhileLoopExercise();
		evalGradeAverage();
		AppBasics.farewellUser(name, appName);
	}

	/**
	 * Write a Java program which prints out a count from 1 to 100, than prints
	 * the numbers 200-100, and finally prints 10-1000 with only numbers evenly
	 * divided by 10. Use the for loop to do these and do not use the %
	 * operator.
	 */
	private static void doForLoopExercise() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			if (i < 100) {
				System.out.println(",");
			}
		}
		System.out.println("\n");
		for (int i = 200; i >= 100; i--) {
			System.out.println(i);
			if (i > 100) {
				System.out.println(",");
			}
		}
		System.out.println("\n");
		for (int i = 10; i <= 1000; i += 10) {
			System.out.println(i);
			if (i < 1000) {
				System.out.println(",");
			}
		}
		System.out.println("\n");
		System.out.println("Print 1-?:");
		int userNum = AppBasics.requestInt("What number do you want to count to ?");
		for (int i = 1; i <= userNum; i++) {
			System.out.println(i);
			if (i < userNum)
				System.out.print("");
		}
	}

	/**
	 * Write a Java program which prints all even number from 1 to 100, then all
	 * odd numbers between 300-400, and finally prints 30-333 with only numbers
	 * evenly divided by 3 . Use a while loop for this exercise. You will also
	 * want to use an if condition and use the % operator to check if a number %
	 * 2 is equal to 0 and print it if that is the case.
	 */
	private static void doWhileLoopExercise() {
		int i = 1;
		System.out.println("print even number from 1 to 100:");
		while (i <= 100) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		int j = 300;
		System.out.println("print odd number from 300 to 400:");
		while (j <= 400) {
			if (j % 2 != 0) {
				System.out.println(j);
			}
			j++;
		}
		int p = 30;
		System.out.println("print numbers evenly divided by 3 from 30 to 300");
		while (p <= 333) {
			if (p % 3 == 0) {
				System.out.println(p);
			}
			p++;
		}
	}

	/**
	 * Write a method which prints the grade average for a user based on a user
	 * supplied set of grade values. Repeat execution until user has no more
	 * items to be graded. Use a do while for this exercise. You will also have
	 * to use two variables to hold the current accumulated grade points as well
	 * as the total number of grades entered so that the average will be
	 * totalGradePoints / numTotalGrades. Other things covered in this exercise:
	 * Scanner, Integer.parseInt.
	 */
	private static void evalGradeAverage() {
		Scanner scanner = new Scanner(System.in);
		int numTotalGrades = 0;
		int totalGradePoints = 0;
		do {
			System.out.println("Please enter an integer from 0-100:");
			String input = scanner.nextLine();
			int num = Integer.parseInt(input);
			totalGradePoints += num;
			numTotalGrades++;
		} while (numTotalGrades <= 10);
		System.out.println("Average:" + (totalGradePoints / numTotalGrades));
	}
}