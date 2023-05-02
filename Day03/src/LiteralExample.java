/*
 * 이름 : 이종석 
 * 사는곳 : 서울 금천구  
 * 직장 : 서울 금천구 
 * "안녕하세요" 
 */
public class LiteralExample {
	public static void main(String args[]) {
		
		// 상수 
		double pi = 3.14;
		pi = 3.15; // 오류가 나지 않음 ( pi 는 변수니까 ) 
		
		final double PI = 3.14; 
		//PI = 3.15; <-- 불변인 상수를 중간에 수정하고자 하면 컴파일 에러 
		
		final double MAX_AGE; 
		MAX_AGE = 10; //-- 오류는 아니지만 지양해야함.
		
		
		// 리터럴은 \n, \t, \" 등 문자열을 출력/저장하고 싶을때 사용하는 
		// 규칙 (escape sequence) 
		System.out.print("이름 : 이종석\n");
		System.out.print("사는곳 : 서울 금천구\n");
		System.out.print("직장 : 서울 금천구\n");
		System.out.print("\"안녕하세요\"");
		
		
	}
}
