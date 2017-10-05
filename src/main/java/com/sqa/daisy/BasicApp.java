/**
 * File Name: BasicApp.java<br>
 * Jiadi, Wu<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: 2017Äê10ÔÂ2ÈÕ
 */
package com.sqa.daisy;

import com.sqa.daisy.helpers.*;

/**
 * BasicApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Jiadi, Wu
 * @version 1.0.0
 * @since 1.0
 */
public class BasicApp {

	private static String appName = "Basic App";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		doSomething();
		AppBasics.farewellUser(name, appName);
	}

	/**
	 *
	 */
	private static void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("Doing something...");
	}
}
