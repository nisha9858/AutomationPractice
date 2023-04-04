package TotalRecap;

class Chicken {
	
	void eat() {
		
		System.out.println("yummyyy");
	}
}

class Lollipop extends Chicken{
	
	void eat() {
		
		System.out.println("Well cooked lollipop");
	}
	
	void crunch() {
		
		System.out.println("Its crunchy");
	}
}

class Tandoori extends Chicken{
	
	void smoky() {
		
		System.out.println("Smoked tandoor");
	}
	
	void eat() {
		
		System.out.println("Masaledar Tandoori");
	}
}

public class Polymorphism1 {
	
	public static void main(String[] args) {
		
		
		Tandoori t1=new Tandoori();
		
		t1.eat();
		t1.smoky();
		
	//	t1.crunch();
		System.out.println("*********************");
		
		
		Lollipop l1=new Lollipop();
		
		l1.eat();
		l1.crunch();
		System.out.println("*****************************");
		
		
		Chicken ch=new Chicken ();
		
		ch.eat();
		System.out.println("**********************");
		
		Chicken ch1=new Lollipop();
		
		ch1.eat();
		
		System.out.println("*************************8888888888");
        Chicken ch2=new Tandoori ();
        
        ch2.eat();
        
        System.out.println("**************************");
        
        
		Chicken ch3=l1;
		
		ch3.eat();
		
	}

}
