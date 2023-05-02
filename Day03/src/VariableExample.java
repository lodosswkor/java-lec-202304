
public class VariableExample {

	
	
	public static void main(String args[]) {
		
		// 자료형 변수명
		int   age; // <-- 변수 선언
	 	age = 40; // <-- 변수 초기화(변수 대입) 
		
	 	
	 	int age2 = 20; // <-- 변수 선언과 동시에 초기화
	 	//int age; // 같은 이름의 변수는 선언할 수 없어요. (컴파일에러)
	 	
	 	//-- 변수를 사용한 부분
	 	int ageSum = age + age2; 
	 	System.out.println("age + age2 = " + ageSum); 
	 	
	 	/* 
	 	 * 자바 예약어는 변수명으로 쓸수없다.
	 	int if; 
	 	int for;
	 	int break; 
	 	*/ 
	}
	
}
