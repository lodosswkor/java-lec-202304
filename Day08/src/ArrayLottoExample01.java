// lotto 6/45 
// lotto 6/x 

public class ArrayLottoExample01 {

	public static void main(String args[]) {
		
		/*
		if(args.length == 0 || args.length > 1) {
			System.out.println
			("사용법 : java ArrayLottoExample <최대숫자>");
		} 
		*/
		
		int[] lotto = new int[6]; // 로또 숫자는 6개니까.
		
		//-- 로또번호 방에 넣기 
		for(int x=0; x < lotto.length; x++) {
			// 랜덤한 값을 집어넣습니다. 
			int num = (int)(Math.random() * 45) + 1;
			lotto[x] = num; 
		}
		
		//-- 로또번호 출력하기 
		System.out.println("생성된 로또번호");
		for(int x = 0; x < lotto.length; x++) {
			System.out.print(lotto[x] + "\t");
		}
		
		System.out.println("프로그램을 종료합니다.");
		
	}
	
}
