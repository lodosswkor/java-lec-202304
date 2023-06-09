// 비교연산 
public class CalExample03 {

	public static void main(String args[]) {
	

	// 같다, 작다, 크다, 작거나 같다, 크거나 같다, 같지 않다.
	// A = B (인간) -> A == B
	// A < B , A > B , A <= B, A >= B 
	// A != B !는 not을 의미합니다. != -> not equal
    // 비교연산은 2항 
    // ( 값 비교연산자 값, 값 비교연산자 연산식, 연산식 비교연산자 연산식 ) 
		
	int x = 10;
	int y = 20;
	int z = 3; 
	
	boolean result = x >= y; 
	boolean result2 = 10 == (x * 2 / y);
	boolean result3 = 10 != 1; 
	
	System.out.println(x + " >= " + y + " = " + ( x >= y )); 
	System.out.println(x + " >= " + y + " = " + result); 
	System.out.println("result2 = " + result2); 
	System.out.println("result3 = " + result3); 
	
	
	// x는 2이상, 20미만인 값  
	// 2 <= x < 20 <-- 인간은 계산가능 
	// boolean result4 = 2 <= x < 20; <-- 에러가 납니다. 
	// 논리연산으로 위의 식을 대체합니다. 
	int x1 = 10; 
	int y1 = 20; 
	boolean result4 = 2 <= x & x < 20;
	boolean result5 = x1 > 10 && y1 <= 20 && y1 > x1; 
	// false && true && true = false; ( AND )
	boolean result6 = x1 > 10 || y1 <= 20 | y1 > x1; 
	// false || true || true = true ( OR ) 
	boolean result7 = x1 > 10 ^ y1 <= 20 ^ y1 > x1; 
	// false ^ true ^ true = false (XOR)
	boolean result8 = result5 ^ result6 || result7 && true; 
	// false ^ true || false && true
	boolean result9 = result5 ^ (result6 || result7) && true;
	// false ^ (true || false) && true
	
	
	}
}
