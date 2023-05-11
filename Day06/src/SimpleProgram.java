import java.util.*; 

public class SimpleProgram {

	public static void main(String[] args) {

		int command = 0; 
		
		do {
			
			System.out.print("명령어를 코드를 입력. (종료 5): "); 
			Scanner scan = new Scanner(System.in); 
			command = scan.nextInt();
			System.out.println("입력된 명령어는 " + command + "입니다."); 
			
		} while(command != 5);
		
		
		// esc 키를 누르면 프로그램 종료 
//		Scanner scan = new Scanner(System.in); 
//		char co = scan.nextLine().charAt(0);
//		System.out.println((int)co); 
//		
//		while(true) {
//			
//			
//		}
		
		System.out.println("프로그램 종료");
		
	}
	
}
