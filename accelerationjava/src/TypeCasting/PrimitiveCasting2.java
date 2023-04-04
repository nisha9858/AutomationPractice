package TypeCasting;

public class PrimitiveCasting2 {

	public static void main(String[] args) {

		int salary = 30000;   

		double salaryDouble = (double) salary;  //  widening explicit

		float salaryFloat = (float) salary;      // widening explicit

		System.out.println(" ***************** explicit widening ************************");

		System.out
				.println("salary : " + salary + "\nsalaryDouble :  " + salaryDouble + "\nsalaryFloat : " + salaryFloat);

		System.out.println(" ***************** implicit widening ************************");

		double salaryDouble2 = salary;

		float salaryFloat2 = salary;

		System.out.println(
				"salary : " + salary + "\nsalaryDouble2 :  " + salaryDouble2 + "\nsalaryFloat2 : " + salaryFloat2);

		double salaryDb = 30000.35d;

		int salaryInt = (int) salaryDb;

		float salaryft = (float) salaryDb;

		System.out.println(" ***************** explicit narrowing ************************");

		System.out.println("salaryDb : " + salaryDb + "\nsalaryInt :  " + salaryInt + "\nsalaryFt : " + salaryft);

	}

}
