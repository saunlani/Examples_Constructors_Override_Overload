package com.examplestopresent.overriding.restaurant;

// (Overriding & Polymorphism)

//  The benefit of overriding is: ability to define a behavior that's specific to the subclass type, which means 
//  a subclass can implement a parent class method based on its requirement. In object-oriented terms, 
//  overriding means to override the functionality of an existing method.
//
//  Restaurant Example.
//  Classes: Food (Pizza and Wings) and Customer.
//
// *Subclasses can only extend from one Superclass:
//  Pizza and Wings are both extending from Food.
//
//  The methods arguments (or lack thereof) and return type must be identical while overriding methods from a Superclass:
//  eat() takes no arguments and returns a string for Food, Pizza and Wings.

//  The reason we enforce this uniformity is so that we can have access to all of the methods that are being inherited from
//  the SuperClass.

//  -> See Main Arg.
abstract public class Food {
	
	void eat() {}

}
