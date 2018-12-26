import com.examplestopresent.overloading.Maths;
import com.examplestopresent.overriding.restaurant.Customer;
import com.examplestopresent.overriding.restaurant.Pizza;
import com.examplestopresent.overriding.restaurant.Wings;
import com.examplestopresent.constructor.Tenant;

public class Examples {
	
	public static void main(String[] args) {
		
		// (Overloading Example) 	
		
		// Console will print 6, as an integer, utilizing the (integer, integer) method.
		System.out.println(Maths.maxValue(6,2));
	
	
		// Console will print 6.0, as a double,  utilizing the (double, double) method.
		System.out.println(Maths.maxValue(6.0,2.0));
	
	
		// Console will print 6.0, as a double, utilizing the (double, integer) method. 
		System.out.println(Maths.maxValue(6.0,2));

	
		// *Automatic Type Conversion and Ambiguous Overloading*
		// If there is no exact match for parameters, Java will try automatic type conversions (i.e. integer to double).
		// Console will print 6.0, as a double, utilizing the (double, double) method. 
		// Java doesn't want to utilize the (int, double) method, as it runs the risk of losing data by doing the conversion.
		System.out.println(Maths.maxValue(2.0,6));
		
		
		
		

		
		// (Overriding Example)
		
		// Instantiated two objects here, Pizza and Wings, both are inherited from the Food class, and as a result, inherit
		// the "eat()" method.
		// -> Pizza & Wings -> Main Argument.
		// *Note: By making deliberately making Food abstract, we cannot call Food's eat method directly.	
		
		Pizza Pepperoni = new Pizza();
		Wings Buffalo = new Wings();
		
		Customer.Digest(Pepperoni);

		
		
		
	
		
		
		// (Constructor Example)
		
		// Instantiate new Tenant class here, providing an ID of 1 and TenantTaxnmyName of "Careful Care".
		Tenant Tenant1 = new Tenant(6543654, "Careful Care");
		
		System.out.println("The Tenant ID is: " + Tenant1.getID());
		System.out.println("The Tenant Cost Per Member is: " + Tenant1.getCostPerMember());
	}
}
