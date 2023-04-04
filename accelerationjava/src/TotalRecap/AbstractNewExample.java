package TotalRecap;


 abstract class Vehicle{
	int age =45;
	abstract void speed();
	
	void Type() {
		
		System.out.println("Sudan type or Xuv type");
		}
}
 
 
 class Car extends Vehicle{
	int age=56; 
	

	 void speed() {
		 
		 System.out.println("speed of car is max or min");
	 }
	 
	 void Type() {
		 
		 System.out.println("Sudan Type");
	 }
	 
	 void color() {
		 
		 System.out.println("color is white ");
		 
		 System.out.println(age);
		 
		 System.out.println(super.age);
	 }
	 
 }

public class AbstractNewExample {
	
	public static void main(String[] args) {
		
		
		Car c1=new Car();
		
		c1.speed();
		c1.Type();
		c1.color();
		
		
	}

}
