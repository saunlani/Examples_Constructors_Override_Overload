package com.examplestopresent.overloading;

// (Overloading)

// Overloaded methods are methods that possess slightly different characteristics, but have the same name and live within 
// the same class.
// These slightly different characteristics could be a different number of parameters or different types of parameters.

// So, Overloaded methods live in the same class, have the same name, but take different arguments or return different types.
// The Maths class is here to perform some number comparison methods for us.

public class Maths {
	
	// This method is great, until we need to compare two doubles.
	public static int maxValue(int x, int y) {
		System.out.println("int, int method called");
		int maxValue = 0;
		if (x>y) {
			maxValue = x;
		}
		if (y>x) {
			maxValue = y;
		}
		return maxValue;
	}
	
	// This method is now overloading the first method, if maxValue 
	// is called when any of the arguments are a double.

	public static double maxValue(double x, double y) {
		System.out.println("double, double method called");
		double maxValue = 0;
		if (x>y) {
			maxValue = x;
		}
		if (y>x) {
			maxValue = y;
		}
		return maxValue;
	}
	
	// Another overloaded method, if maxValue is called when the first argument is double and
	// the second is int.
	
	public static double maxValue(int x, double y) {
		System.out.println("double, int method called");
		double maxValue = 0;
		if (x>y) {
			maxValue = x;
		}
		if (y>x) {
			maxValue = y;
		}
		return maxValue;
	}
}
	


	
