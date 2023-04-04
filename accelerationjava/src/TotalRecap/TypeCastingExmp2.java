package TotalRecap;

class Primitive{
	
	void show(int d) {
		
		System.out.println("value in double");
	}
	
	void show(double t) {
		
		System.out.println("Value in int");
	}
}

public class TypeCastingExmp2 {
	
	public static void main(String[] args) {
		
	
	Primitive p1=new Primitive();
	
	p1.show(23.4);
	
	p1.show(45);
	
	
	
	}	

}
