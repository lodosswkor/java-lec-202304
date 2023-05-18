
public class ScopeExample {

	public static void main(String args[]) {
		Cat cat = new Cat(); // 객체를 생성합니다. 
		cat.sayMyName(); // 니 이름이 뭐니? -- 지역변수 이종석 출력 
		cat.sayMyAge(); // 니 나이가 몇이니? -- 전역(클래스) 변수 야옹이 출력
	}
	
}


class Cat {
	
	//-- 클래스 맴버(필드/변수) 
	//-- 클래스 전역 변수 
	String name = "야옹이"; 
	//String name = "이종석"; 
	// 같은구역에 같은 이름을 가지는 변수명이 있다. = 에러 
	
	void sayMyName() {
		
		//-- 지역변수 
		int age = 10;  
		String name = "이종석";  
		//-- 우리동네에 name이라는 이름의 사람이 있어요(동명이인) 
		//-- 에러 아님 
		System.out.println(name);
	
	}
	
	void sayMyAge() {
		
		System.out.println(name);
		// int age는 sayMyName() 정의부 내에 존재하는 
		// '지역'변수 이기 때문에 접근 불가 
		// String name은 클래스 전역에서 접근하는 변수이기 때문에 
		// 접근 가능 
		// System.out.println("난 " + name + " 나이는 " + age); <-- 에러
	
	}
	
}



