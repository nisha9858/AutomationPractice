package NonstaticMethod;

public class Example2 {

	public int addTwoNum(int a, int b) {

		int res = a + b;

		System.out.println("Number 1:    " + a);
		
		System.out.println("Number 2:     " + b);

		return res;

	}

	int multiplyTwoNUm(int n1, int n2) {

		int res1 = n1 * n2;
		
		int finalValue = res1 + 100;
		
		System.out.println("Result 1 :" +  res1);
		
		return finalValue;
	}

	public static void main(String[] args) {

		Example2 y = new Example2();

		y.addTwoNum(34, 45);

		System.out.println("Result is  :" + y.addTwoNum(67, 23));

		y.multiplyTwoNUm(2, 4);
	

		System.out.println("The finalvalue  is  :" + y.multiplyTwoNUm(45, 11));

	}

}
