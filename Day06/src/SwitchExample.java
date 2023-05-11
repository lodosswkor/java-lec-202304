import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		// 1-7
		// 1 월 2 화 3 수 4 목 5 금 6 토 7 일 
		
		Scanner scan = new Scanner(System.in); 
		System.out.print("1-7 범위내의 숫자를 넣어주세요 : ");
		int dayCode = scan.nextInt();
		
		switch(dayCode) {
			default : // else 랑 같은 의미
				System.out.println("범위는 1~7 입니다.");
				break;
			case 2 :
				System.out.println("화요일");
				break;
			case 1 : 
				System.out.println("월요일"); 
				break;
			case 3 :
				System.out.println("수요일"); 
				break;
			case 4 :
				System.out.println("목요일");
				break; 
			case 5 :
				System.out.println("금요일");
				break; 
			case 6 : 
				System.out.println("토요일"); 
				break;
			case 7 :
				System.out.println("일요일");
				break; 
		}
		
		// 위의 switch문을 if else if else 로 바꿔보세요
		
		
		if( !(dayCode >= 1 && dayCode <= 7) ) { 
			System.out.println("범위는 1~7까지 입니다.");
		} else if( dayCode == 1) {
			System.out.println("월요일"); 
		} else if( dayCode == 2 ) {
			System.out.println("화요일"); 
		} else if( dayCode == 3 ) {
			System.out.println("수요일"); 
		} else if( dayCode == 4 ) {
			System.out.println("목요일"); 
		} else if( dayCode == 5 ) {
			System.out.println("금요일"); 
		} else if( dayCode == 6 ) {
			System.out.println("토요일"); 
		} else if( dayCode == 7 ) {
			System.out.println("일요일"); 
		} 
		/*else {
			System.out.println("범위는 1 ~ 7 까지 입니다."); 
		}*/
		
		// 중첩 IF 문 
		if( dayCode >= 1 && dayCode <= 7) { 
			
			if( dayCode == 1) {
				System.out.println("월요일"); 
			} else if( dayCode == 2 ) {
				System.out.println("화요일"); 
			} else if( dayCode == 3 ) {
				System.out.println("수요일"); 
			} else if( dayCode == 4 ) {
				System.out.println("목요일"); 
			} else if( dayCode == 5 ) {
				System.out.println("금요일"); 
			} else if( dayCode == 6 ) {
				System.out.println("토요일"); 
			} else if( dayCode == 7 ) {
				System.out.println("일요일"); 
			} 
			
		} else {
			System.out.println("범위는 1~7 까지 입니다."); 
		}
		 
		System.out.println("종료");
		
		
	}
	
}
