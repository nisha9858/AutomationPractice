package NonStaticglobalVariable;

public class NonStaticLocalGlobal9 {

	int empId = 25;
	
	void display() {

		int empId = 45; // it will take value near to method

		System.out.println("I am local empId    " + empId);

		System.out.println("I am Global empId    " + empId);
		
		System.out.println("I am Global empId    " +this. empId);
	}
	

	public static void main(String[] args) {

		NonStaticLocalGlobal9 r = new NonStaticLocalGlobal9();

		r.display();

	}

	

}
