package SwitchCase;

public class Switch3 {
	
	public static void main(String[] args) {
		
		char ch='i';
		
		switch(ch) {
		

		case 'e':
			System.out.println("Value matched -e, a vowel");
		break;
			
		case 'a':
			System.out.println("Value matched -a, a vowel");
			break;
		case 'i':
			System.out.println("Value matched -i, a vowel");
			break;
		case 'o':
			System.out.println("Value matched -o, a vowel");
			break;
		case 'u':
			System.out.println("Value matched -u, a vowel");
			break;
		default:
			System.out.println("Value not matched ");
			break;
		}
		
	}

}
