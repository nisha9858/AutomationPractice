package TotalRecap;



public class TypecastingExample {
	
	public static void main(String[] args) {
		
		
		int age=34;
		
		//implicit widening
		
		double Myage=age;
		
		float Myage1=age;
		
		System.out.println("Myage :"+Myage   +"\n Myage1:  "+Myage1);
		
		
		//explicit widening
		
		double d=(double)age;
		
		float f=(float)age;
		
		System.out.println("d : "+d+ "\nf  :"+f);
		
		double salary=56789.7;
		
		//expicit narrowing
		
		int i=(int )salary;
		
		float f1=(float)salary;
		
		byte by=(byte)salary;
		
		System.out.println("int salary  :"+i + "\nfloat salary :"+f1 + "\nbyte salary: "+by);
		
	}

}
