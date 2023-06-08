package saram;

public class App {
		
	public static void main(String args[]) {
	
		한국인 person = new 한국인("이종석");
		
		직장 workplace = new 직장(person);
		집 home = new 집(person);
		
		workplace.생활();
		home.생활(); 
		
		
		충청도인 ch = new 충청도인("이종석2");
		
		// 1. 사람클래스에서 상속/재정의한 메서드인 배채우다() 
		// 메서드에 접근할수 있는가?
		ch.배채우다(); 
		
		// 2. 아버지 인터페이스(형제)의 얘랑놀아주다(); 메서드가 상속되는가.
		ch.얘랑놀아주다();
		
		// 3. 직장인 인터페이스(형제)의 출근(); 메소드는 상속되는가? 
		ch.출근();
		
		// 익명구현객체 
		직장인인터페이스 worker = new 직장인인터페이스() {

			@Override
			public void 출근() {
				// TODO Auto-generated method stub
				System.out.println("임시구현객체 출근();");
			}

			@Override
			public void 퇴근() {
				// TODO Auto-generated method stub
				System.out.println("임시구현객체 퇴근();");
			}
			
		}; 
		
		worker.출근();
		

		// 한국인을 직장인으로 Casting 형변환을 하면. 
		직장인인터페이스 worker1 = new 한국인("이종석3"); 
		
		worker1.출근();
		worker1.퇴근(); 
		
		((한국인)worker1).배채우다(); 
		((아버지인터페이스)worker1).얘랑놀아주다(); 
		
	}
	
}

class 직장 {
	
	직장인인터페이스 worker; 
	
	//-- 생성자 
	직장(직장인인터페이스 worker) {
		this.worker = worker; 
	}
	
	public void 생활() {
		worker.출근(); 
		worker.퇴근();
	}
}

class 집 {
	
	아버지인터페이스 father; 
	
	집(아버지인터페이스 father) {
	   this.father = father; 	
	}
	
	public void 생활() {
		father.얘랑놀아주다();
	}
	
}
