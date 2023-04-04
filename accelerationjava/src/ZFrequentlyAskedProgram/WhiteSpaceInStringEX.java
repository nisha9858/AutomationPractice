package ZFrequentlyAskedProgram;

public class WhiteSpaceInStringEX {
	
	public static void main(String[] args) {
		
		String str="              Java      Is      Secure         Language       ";      
		
		System.out.println("after trim() string will be :"+str.trim());
		
		str=str.replaceAll("\\s", "");
		
		System.out.println("after replaceAll() string will be :"+str);
		
	}

}
//matches single white spaces character

// regex expression in java =\\s