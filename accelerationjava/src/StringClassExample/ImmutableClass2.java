package StringClassExample;


final class Testing{
	
	final int age;
	final String name;
	
	final double salary;
	Testing(int a,double b,String c){
		
		age=a;
		salary=b;
		name=c;
		
		}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void display() {
		
		System.out.println(age);
		System.out.println(salary);
		
		System.out.println(name);
	}
	
}

public class ImmutableClass2 {
	
	public static void main(String[] args) {
		
		Testing t1=new  Testing(25,357869.0,"Pune");
		
		t1.display();
		
	}

}
