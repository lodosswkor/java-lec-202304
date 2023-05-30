package ex;

/* 실행시킬 Application */

public class App {

	public static void main(String[] args) {
		
		Parent parent = new Parent("name인자"); // new 클래스생성자() 
		Child child = new Child(); // new 클래스생성자() 
		
		parent.밥먹다();  // parent 객체의 밥먹다() 호출
		child.밥먹다();  // child 객체의 밥먹다를() 호출 
		child.부모님밥먹다(); 
		//--> child 객체의 부모님밥먹다() -> super(부모객체)의 밥먹다(); 
	}
	
}
