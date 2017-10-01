//Declaring Class with name AbstractDemo
public class AbstractDemo {

	// Declaring main method for class AbstractDemo
	public static void main(String [] args) {
	      // initializing the object of salary class with calling Constructor
	      Salary objSalary = new Salary("Satish", "Bengaluru", 2, 350000.00);
	      // initializing the object of salary class with calling Constructor
	      Employee objEmployee = new Salary("Ramesh ", "Bengaluru", 3, 250000.00);
	      
	      // Displaying the message
	      System.out.println("Call mailCheck using Salary reference --");
	      // calling method using Salary Constructor
	      objSalary.mailCheck();
	      System.out.println();
	      // Displaying method
	      System.out.println("Call mailCheck using Employee reference--");
	      //calling method using Employee Constructor
	      objEmployee.mailCheck();
	   }
}
