package NonstaticMethod;

public class Example4 {

	int getAscii(char c1) {

		return c1;
		
	}

	public static void main(String[] args) {

		Example4 f = new Example4();
		
		System.out.println("Value of ASCII  :"+f.getAscii('e') );

	}

}
