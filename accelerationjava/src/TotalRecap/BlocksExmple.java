package TotalRecap;

public class BlocksExmple {
	
	
	static {
		
		System.out.println("I am static block");
	}
	
	{
		System.out.println("I am non ststic block");
	}
	
	{
		System.out.println("I am non static block2");
		
	}

	
	public static void main(String[] args) {
		
		System.out.println("Programs starts");
		
		BlocksExmple b=new BlocksExmple();
		
		System.out.println("Program ends");
		
	}

}
