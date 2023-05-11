/*
 * 1. if  
 * 2. if else 
 * 3. if - else if
 */


public class Control01 {

	public static void main(String[] args) throws InterruptedException {
		
		// 1. if 
		int age = 20; 
		age = 35; 
		
	    System.out.println("신청자 나이: " + age); 
	    
	    System.out.println("심사중......");
	    Thread.sleep(2000);
		
		// 청년저축가입 나이 제한 
		if(age < 40) {
			System.out.println("청년저축 가입 가능합니다."); 
		}
		
		// 청년저축 가입 나이는 19세 이상이고(and), 39세 이하인 사람만 
		// 청년저축 가입 나이는 19세 이상이거나(or), 39세 이하이거나 한 사람들은 
		// 가입가능합니다. 
		// 가입할 수 있다. 
		// 19 <= age <= 39 
		// age = 40 
		
		
		if( age >= 19 && age <= 39 ) {
			System.out.println("19세 이상, 39세 이하인 분이시군요");
			System.out.println("진행시켜");
		}
		
		if ( age > 39 || age < 19) {
			System.out.println("자기는 가입대상이 아녀.");
		}
		
		// 2. if ~ else
		Thread.sleep(2000);
		
		System.out.println("if ~ else 문" );
		
		if( age >= 19 && age <= 39 ) { // 조건식이 참이면 실행
			System.out.println("나이 : " + age); 
			System.out.println("진행시켜.");
		} else { // 조건식이 거짓이면 실행 
			System.out.println("집에가.");
		}
		
		// if ~ (else if) ~ (else) 
		// 19세 이상, 39세 이하 = 청년저축 대상자
		// 40세 이상, 60세 이하 = 중장년 카운슬링 대상자 
		// dsadas
		// dsadas
		
		if( age >= 19 && age <= 39 ) { // 청년 저축 대상자. 
			System.out.println("자기는 청년이구만! 훌륭해 가입가능");
		} else if( age >= 40 && age <= 60) { // 중장년 카운슬링 대상자.
			System.out.println("나네? 중장년 카운슬링 고");
		//} else if() { else if는 무한정 생성 가능 
		} else {
			System.out.println("자기는 19미만이거나 60초과 / 안돼");
		}
		
		
		System.out.println("프로그램 종료.");
		
	}
	
}
