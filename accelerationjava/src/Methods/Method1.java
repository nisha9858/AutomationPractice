package Methods;

public class Method1 {
	
	
	public static void displayInfo( String name,String prof,String location) {
		
		System.out.println(" I AM "+name);
		
		System.out.println(" I AM "+prof);
		
		System.out.println(" I AM FROM "+location);
		
		
	}
	
	public static void calling(int num) {
		
		
		System.out.println("Calling number "+num);
		
	}
	public static void main(String[] args) {
		
         Method1.    displayInfo( "Nisha","Manual trainer","Mumbai");
             
             displayInfo( "Shreya","History teacher","Pune");
             
             calling(987065 );     //int i=456788;    calling(i)
		
	}

}
