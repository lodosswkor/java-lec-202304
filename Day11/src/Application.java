//import home.이종석;
import home.*;
import staticexample.Counter; 

public class Application  {

	
	public static void main(String[] args) {
		
		int 지갑 = 0; 
		
		이종석 a = new 이종석(); 
		a.sayMyName();
		a.sayMotherName();
		
		아빠 b = new 아빠(); 
		b.sayMyName(); //-- public 누구나 부를 수 있다. 
		지갑 += b.용돈주세요(); 
		지갑 += b.용돈주세요(); 
		지갑 += b.용돈주세요(); 
		지갑 += b.용돈주세요(); 
		지갑 += b.용돈주세요(); 
		지갑 += b.용돈주세요(); 
		지갑 += b.용돈주세요(); 
		지갑 += b.용돈주세요(); 
		
		System.out.println("이종석 아빠한테 삥뜯음");
		System.out.println("내 지갑에는 " + 지갑 + "원이 있어요.");
		
		//b.용돈주세요(); //-- protected 상속관계에서만 호출가능 
		//b.청소(); //-- default 는 같은방(패키지)에 있는 가족만 호출가능 
		
		//b.walletBalance = 1000; 
		// 아빠 지갑이 public 이기 때문에 누구든 접근해서
		// 값을 변경할 수 있는 상태 
		//System.out.println("아빠 지갑에는 " + b.walletBalance + "원이 있어요");
		
		/*new Application().용돈주세요(); 
		new Application().청소(); */
		
		//a.sayMyAge(); 
		
		//엄마 b = new 엄마(); 
		
		Counter.plusStaticCounter();
		Counter.plusStaticCounter();
		
		
	}
	
}
