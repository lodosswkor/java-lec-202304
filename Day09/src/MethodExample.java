// 메서드(행위) 만들기 - 함수  
// (접근제한자) 리턴타입 메서드명( 매개변수 ) {  
//     .. 실행문 (메서드 정의부) 
// }


public class MethodExample {
	
	// 그림처럼 add 라는 메서드를 작성하겠다.
	int add(int x, int y) {
		return x + y; 
	}
	
	void bark(String name) {
		System.out.println("내 이름은 " + name + ", 왈왈");
		return; 
	}
	
	void sayMyName() {
		System.out.println("내 이름은 이종석이야.");
	}
	
	public static void main(String[] args) {
		
		MethodExample ex = new MethodExample(); 
		int result = ex.add(10, 11); 
//		System.out.println(10 + 11);
//		System.out.println(10 + 22);
		System.out.println(result);
		
		// int a = ex.bark("바둑이"); // 리턴값이 없으므로(void) 에러 
		ex.bark("바둑이");
	}

}
