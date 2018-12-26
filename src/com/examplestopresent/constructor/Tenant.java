package com.examplestopresent.constructor;

// (Constructor)

// A constructor is a block of executable code that's called when an instance of an object is created.
// Constructors allow us to setup our initial state.
// If we don't define a constructor, Java will automatically provide a no arugment constructor.
// We're not limited to one constructor; we can create multiple constructors, and each constructor 
// can take a different number of arguments.

// *Note: Constructors are not methods, and do not have return types (not even void).
// They are executable code which are sed to establish initial state and 
// they must have the same name as the class.

// Our options for generating a constructor and getters/setters:
// 1.) Manually.
// 2.) Automatically with Eclipse (Alt + Shift + S).
// 3.) Lombok.

// ++ Constructor Chaining:
// We can use access modifiers to control constructor visibility.
// This limits what code can perform specific creations. (See costPerMember)

public class Tenant {


	private int ID;
	private String TenantName;
	private double costPerMember;
	
	//Constructors
	public Tenant() {
	}

	public Tenant(int iD, String tenantName) {
		this(iD < 1000 ? 55.0d : 120d);
		ID = iD;
		TenantName = tenantName;
	}
	

	private Tenant(double costPerMember) {
		this.costPerMember = costPerMember;
	}
	

	//Getters and Setters

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTenantName() {
		return TenantName;
	}

	public void setTenantName(String tenantName) {
		TenantName = tenantName;
	}

	public double getCostPerMember() {
		return costPerMember;
	}

}