package TotalRecap;



class Practice{
	
	static int age=25;
	
	double salary=2345.6;
	
	 Practice(int a,int b){
		 
		 System.out.println(this.age);
		 
		age=a;
		
		salary=b;
		
		System.out.println(age);
		
		System.out.println(salary);
		
		System.out.println(this.age);
		
		System.out.println("*********************");
		}
	
	
	 Practice(int b,double a){
		
		this(5,78);
		
		age=b;
		
		salary=a;
		
         System.out.println(age);
         
         System.out.println(salary);
		
		System.out.println(this.age);
	}
	
	
	
	public static void GetM() {
		
		System.out.println("HIIII");
	}
	
	void SetM() {
		
		System.out.println("BYeeee");
	}
	
	public int addNumber(int s,int y) {
		
		return s+y;
	}
	
	public double addNumber(double r,int o) {
		
		return r+o;
	}
}

public class PracticeProgram1 {
	
	public static void main(String[] args) {
		
		 Practice d1=new  Practice(3,6);
		
		 Practice d2=new  Practice(7,8.9);
		
		 Practice.GetM();
		 
		 System.out.println("****************************");
		 
		 d1.SetM();
		 
		 d2.SetM();
	System.out.println("************************************");	
	
     System.out.println(  d1.addNumber(4, 5));   
     
     System.out.println("************************************");
         
        System.out.println( d1.addNumber(34.6, 8));
        
        System.out.println("***********************************");
        
        System.out.println( d2.addNumber(21,23));
        
        System.out.println("***********************************");
         
    System.out.println( d2.addNumber(45.7, 67));
    
    System.out.println("*****************************************");
		
	}
	
	
	

}
