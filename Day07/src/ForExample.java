
public class ForExample {

	public static void main(String args[]) {
		
		// 1~100까지 출력하세요 
		
		for( int i = 1; i <= 100; i++ ) {
			System.out.println(i);
		}
		
		// for문 내부의 값들 (초기화;비교;증감) 
		// 부분은 필수가 아니다. 
		int i = 1;
		
		for(;i<=100;i++) {
			System.out.println(i); 
		}
		
		i = 1; 
		for(;i<=100;) {
			System.out.println(i++);
		}
		
		
		for(;;) {
			
		}
		
		
	}
	
}
