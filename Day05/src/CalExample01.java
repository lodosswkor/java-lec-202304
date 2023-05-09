
public class CalExample01 {

	public static void main(String args[]) {
		
		int a = 10;
		int b = 20; 
		
		// && 
		System.out.println(a > 10 && a++ < 20); 
		System.out.println("a = " + a); // a = 20 
		
		// & 
		System.out.println(a > 10 & a++ < 20); 
		System.out.println("a = " + a); // a = 21 
		
		// ||
		System.out.println(b <= 20 || b-- < 20);
		System.out.println("b = " + b); // b = 20
		
		// | 
		System.out.println(b <= 20 | b-- < 20);
		System.out.println("b = " + b); // b = 19
		
		
	}
	
}
