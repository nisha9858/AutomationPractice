package Encapsulation;

class encapsulationDemo {

	private int ssn;

	private int empAge;

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

}

public class Encap2 {

	public static void main(String[] args) {

		encapsulationDemo e1 = new encapsulationDemo();

		System.out.println("Employee SSN :  " + e1.getSsn());

		System.out.println("Employee Age :  " + e1.getEmpAge());

		System.out.println("*****************************************************************");

		e1.setSsn(112233);

		e1.setEmpAge(32);

		System.out.println("Employee SSN :  " + e1.getSsn());

		System.out.println("Employee SSN :  " + e1.getEmpAge());
	}

}
