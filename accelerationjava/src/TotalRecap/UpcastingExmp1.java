package TotalRecap;

class X {
	
	int y=23;
	
	void print() {
		
		System.out.println("X is printable");
	}
	
	void show() {
		
		System.out.println("X is showable");
	
	}
}
class Y extends X{
	
	int y=78;
	
	void print() {
		
		System.out.println("Y is printable");
	}
	
	void color() {
		
		System.out.println("Y is multicolor");
	}
}

public class UpcastingExmp1 {
	
	public static void main(String[] args) {
		
		X x1=new X();
		
		x1.print();
		x1.show();
		System.out.println(x1.y);
		
	Y y1=new Y();
	
	y1.color();
	y1.print();
	y1.show();
	
	System.out.println(y1.y);
	
	
	//implicit upcasting
	
	X x2=new Y();
	
	x2.print();
	
	x2.show();
//	x2.color();
	
	
	//explicit upcasting
	
	X x3=(X)y1;
	
	x3.print();
	
	x3.show(); 
//	x3.color();
	

	
	//explicit downcasting
	
	Y  y2=(Y) x1;
	
	y2.color();
	
	y2.print();
	y2.show();
	
	
	
	
	
		
		
	}

}
