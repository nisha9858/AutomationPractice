package NonAccessModifier;

abstract class Main {
	
	public String fname = "John";
	public int age =45;

	public abstract void study(); // abstract method
}

// Subclass (inherit from Main)
class Student extends Main {
	
	public int graduationYear = 2018;
	
          int age= 24;
	public void study() { // the body of the abstract method is provided here
		System.out.println("Studying all day long");
	}
}
// End code from filename: Main.java
// Code from filename: AbstractKeyword.java

public class AbstractKeyword {

	public static void main(String[] args) {
		// create an object of the Student class (which inherits attributes and methods
		// from Main)
		Student myObj = new Student();

		System.out.println("Name: " + myObj.fname);
		System.out.println("Age: " + myObj.age);
		myObj.study();

	}
}
// variable cannot be ovveridden