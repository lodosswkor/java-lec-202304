// 클래스 정의 및 객체 생성 

//class 클래스명 {}
// Human 클래스 정의부 
class Human {
	
	// 필드(속성) - 객체 자신을 표현하는 속성 / 상태 
	// 메소드(행위) - 그 객체의 행동 
	//                 - 자기자신을 생성하는 행위 (생성자)
	
	// Human 클래스의 멤버가 뭐가 있니? 
	// "맴버"필드(속성)은 뭐뭐가 있고요
	// "맴버"메서드(행위)는 뭐뭐가 있어요.
	// 그리고 생성자는 뭐뭐뭐 있어요. 
	
	String name; // 이름 
	
	void sayMyName() {
		System.out.println("제 이름은 " + name + "입니다.");
	}
	
	
	// 메소드 오버로딩(중첩)
	// 리턴타입이 다르거나, 인자가 다르거나
	void 외치다() {
		System.out.println("아아아악");
	}
	
	String 외치다(String userName, String status) {
		System.out.println("뇽");
		return "으으으으";
	}
	
	void 외치다(String name) {
		System.out.println("야이 " + name);
	}
	
	//-- JVM 해석방식 
	// 외치다는 
	// void 외치다() 
	// String 외치다(String) 
	// void 외치다(String) 
	
	
	
	
}


public class ClassExample {

	public static void main(String[] args) {
	    // 변수선언 
		// 데이터타입 변수명 = 값; 
		
		//int age = 40; 
		//int age = 50; 
		
		Human human = new Human(); // 객체가 생성됩니다.
		Human human2 = new Human(); // 객체 생성2
		Human human3 = human; // 참조(주소값) 입력 
		
		human.name = "이종석";
		human.sayMyName();
		human.외치다();
		human.외치다("이종석");
		
		human2.name = "김희원";
		human2.sayMyName();
		
		human3.sayMyName();

		if(human == human3) {
			System.out.println("h, h3는 이종석을 가르치는 참조변수.(같다)");
		}
			
			
		// human 변수와 human2 변수는 같은 객체를 "참조"하고 있는가?
		if(human != human2) { // h, h2가 같지 않으면 true 
			System.out.println("h, h2는 다른객체이다.");
		}
		// '사람'이라는 클래스에서 생성된 이종석과 김희원 객체를 다르다. 
		
		// 이종석과 김희원은 '사람'이냐? ( 이종석과 김희원은 Human 클래스에서 생성된 객체냐? )
		if(human instanceof Human && human2 instanceof Human) {
			System.out.println("이종석과 김희원은 사람입니다.");
		}
		
	}
	
}
