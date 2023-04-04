package WrapperClassExample;

public class UnBoxingOperation2 {
	
	
	public static void main(String[] args) {
		
		Double doubleObj=25.2566;//primitive type double is getting converted into Double class object//implicit boxing
		
		System.out.println("doubleObj: "+doubleObj);
		
		//un-boxing
		double salary=doubleObj.doubleValue();//  explicit unboxing
		
		System.out.println(salary);
		
		System.out.println(doubleObj==salary);//
		
		Boolean b=true;//
		
		boolean b1=b.booleanValue();//
		
		System.out.println(b1);
		
		
		Character c1=new Character('a');//
		
		char c2=c1.charValue();//
		
		System.out.println(c2);
		
		
		Integer i=25; //implicit boxing
		
		double d=i.intValue();
		
		System.out.println(d);
	}
}


