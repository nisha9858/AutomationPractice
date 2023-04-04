package Blocks;

public class Blocks3 {
	
	Blocks3(){
		
		System.out.println("Zero parameter");
	}
	
	Blocks3(int i){
		System.out.println("int parameter");
	}
	
	{
		System.out.println("Running nonstatic block of class blocks3");  //non static block
	}
	
	public static void main(String[] args) {
		
		System.out.println("main() method");
		
		Blocks3 g1=new Blocks3 ();
		
		System.out.println("##############");
		
		Blocks3 f1=new Blocks3 (18);
		
		System.out.println("main () ends");
	}
	



}


