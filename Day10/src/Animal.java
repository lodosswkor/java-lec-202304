
public class Animal {

	String name; // 이름 
	String type;  // 종
	
	// 기본 생성자
	// 생성자 "오버로딩(중첩)" 
	Animal() {
		System.out.println("생성자 Animal() 호출");
		name = "동물";
		type = "포유류";
	}
	
	Animal(String pName) {
		name = pName; 
	}
	
	Animal(String pName, String pType) {
		name = pName;
		type = pType;
	}
	
	//내가 누군지 소개하는 메서드 
	void whoIam() {
		System.out.println("전 " + type + "이고,");
		System.out.println("제 이름은 " + name + "입니다.");
	}
	
}
