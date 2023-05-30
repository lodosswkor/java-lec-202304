
public class ExtendsExample {

	public static void main(String[] args) {
		
		Parents parents = new Parents(); 
		parents.밥먹다(); 
		
		Child child = new Child(); 
		child.밥먹다(); 
		
		Human human = new Parents();
		human.밥먹다(); 
		((Parents)human).담배를피다(); 
		
		Object object = new Child();
		((Child)object).밥먹다();
		
		/*
		그래픽카드 gc = new 지포스();  // 나는 지포스입니다.  
		gc.화면출력하다(); 
		gc = new 라데온(); 
		gc.화면출력하다(); 
		*/
	}
	
}

class Human {
	int 입개수 = 1; 
    int 눈개수 = 2; 
    void 밥먹다() {
    	System.out.println("Human 밥먹다.");
    }
}

class Parents extends Human {
	void 담배를피다() {
		System.out.println("닝겐 담배 뻑뻑");
	}
}

class Child extends Parents {
}
