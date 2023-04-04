package InterfaceExample;

interface Drawable2{
	
	void draw();
	
	default void msg(){
		
		
	                    //below default keyword can be used only inside interface
		
		System.out.println("default method");
	}
	
	static int cube (int x) {          //  From jdk 8:  In interface we have complete /non abstract method also but those methods should be declare with default or static
		
		return x*x*x;                 
		
		}
	//default static int print() {
		

		private void test() {              //private methods are allow in jdk9
		
		System.out.println("private method");
	}
}

class Rectangle2  implements Drawable2{
	
	public void draw() {
		
		System.out.println("drawing rectangle");
		
		
	}
}

public class InterfaceDefaultStatic {
	
	public static void main(String[] args) {
		
	Drawable2  d =new Rectangle2();
	
	d.draw();
	d.msg();
	
	
	System.out.println(Drawable2.cube(3));
		
	}

}
