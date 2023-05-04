// 1. 대입연산 
// 2. 산술연산 

public class CalExample01 {

	public static void main(String args[]) {
		
		int a = 10; // 좌측에 있는 공간에 우측에 있는 값을 할당(대입)한다.
					// 좌측은 변수/상수 우측은 값 혹은 연산식 
		
		int b = a + 3; // 죄측은 변수 우측은 연산식 
		
		int x = 10;
		int y = 20; 
		int z = ( x + y ) * 10 / 20; // 연산자의 우선순위는 인간과
									 // 똑같습니다. 
		
		// 곱셈 
		int x1 = 10; 
		int y1 = 20; 
		int z1 = x1 * y1; // 컴퓨터의 x 곱하기는 * 
		System.out.println(x1 + " x " + y1 + "=" + z1);
		
		// 나눗셈 
		int x2 = 10;
		int z2 = x2 / 2; 
		System.out.println(x2 + " / 2 = " + z2 );
		
		// 나머지
		int x3 = 10;
		int y3 = 7; 
		System.out.println(x3 + " % " + y3 + "=" + (x3 % y3)); 
		
	}
	
}
