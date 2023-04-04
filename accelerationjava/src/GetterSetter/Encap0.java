package GetterSetter;

class Demo {

	private int empID = 1000;

	private double salary = 45000;

	// generate getter for empID and salary

	public int getEmpID() {

		return empID;

	}

	public double getSalary() {

		return salary;
	}

	// generate setter for empID and salary

	public void setEmpID(int id) {

		empID = id;
	}

	public void setSalary(double salary) {

		this.salary = salary;
	}

}

public class Encap0 {

	public static void main(String[] args) {

		Demo d1 = new Demo();

		System.out.println(
				" Accessing private data members outside the class using getter concept -empID:  " + d1.getEmpID());

		System.out.println(
				"Accessing private data members outside the class using getter concept -salary:  " + d1.getSalary());

		d1.setEmpID(2002);

		d1.setSalary(55000);

		System.out.println(" Update Accessing private data members outside the class using getter concept -empID:  "
				+ d1.getEmpID());

		System.out.println("Update Accessing private data members outside the class using getter concept -salary:  "
				+ d1.getSalary());

		System.out.println("*********************************");

		Demo d2 = new Demo();

		System.out.println(
				" Accessing private data members outside the class using getter concept -empID:  " + d2.getEmpID());

		System.out.println(
				"Accessing private data members outside the class using getter concept -salary:  " + d2.getSalary());

	}

}
