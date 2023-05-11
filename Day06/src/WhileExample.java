import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		
		System.out.println("숫자를 1에서부터 몇 까지 출력할까요? :");
		Scanner sc = new Scanner(System.in);
		int maxNum = sc.nextInt();
		int startNum = 1; 
		
		//-- while(조건식) 에서 조건식이 true 일때(까지 - false) 
		//-- { } 내 실행문을 반복 실행시킨다 
		
		while(maxNum >= startNum) { // 조건부터 true 인지 검증 
			System.out.print((startNum ++) + "\t");
		}
		
		//-- do while 
		startNum = 1; 
		
		do {
			System.out.println("최소 한번은 실행합니다.");
			System.out.print((startNum ++) + "\t");
		} while(maxNum >= startNum);
		
		
	}
	
}
