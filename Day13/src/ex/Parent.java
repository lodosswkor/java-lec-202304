package ex;

public class Parent {

	// 기본 생성자를 "정의"
//	public Parent() {
//		
//	}
	
	// Parent 생성메서드(생성자)에 인자로 name을 받게 만듬.
	public Parent(String name) {
		System.out.println("Parent 객체 생성."); 
	}
	
	void 밥먹다() {
		System.out.println("부모님이 밥을 먹는다.");
	}
	
}
