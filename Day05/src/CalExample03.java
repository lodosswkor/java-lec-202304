
public class CalExample03 {

	public static void main(String args[]) {
		
		// bit 연산 ( bitwise 연산 ) 
		// 1. bit연산자는 논리연산자와 똑같다. And, Or, XOR, Not
		
		byte x = 5; 
		byte y = 10; 
		System.out.println(" x = 0" + Integer.toBinaryString(x));
		System.out.println(" y = " + Integer.toBinaryString(y)); 
		System.out.println(" x & y = " + (x & y));
		System.out.println(" x | y = " + (x | y));
		System.out.println(" x ^ y = " + (x ^ y));
		
		System.out.println(" ~x = " + ~x); // -6 
		// 5 = 0000 0101
		// ~5 = 1111 1010 -> -6 
		
		System.out.println(" x << 2 = " + (x << 2)); 
		System.out.println(" x >> 2 = " + (x >> 2)); 
		System.out.println(" ~x >> 2 = " + (~x >> 2)); 
		System.out.println(" ~x >>> 2 = " + (~x >>> 2)); 
		
		///-- EX 
		System.out.println(2*2*2*2*2*2); 
		System.out.println(1 << 6);
		
		
		byte a = 10; 
		a += 10; // a = a + 10; 
		
		byte z = 10; 
		z = (byte)(z << 2);
		z <<= 2; // z = z << 2;
		
		
		System.out.println
		("안녕하세요 저는 " + 20 + 5 + "살 입니다.");

		System.out.println
		("안녕하세요 저는 " + (20 + 5) + "살 입니다.");
		
		

	}
	
	
}
