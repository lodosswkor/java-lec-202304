
//-- 99단
//-- x * 1 = x, x * 2 = 2x .........

public class MultipleExample {

	public static void main(String[] args) {
		
		//-- 2단만 찍는겁니다. 
		for(int x = 2; x <= 9; x++) {		
			for(int y = 1; y <= 9; y++) {
				System.out.println(x + " x " + y + " = " + (x * y));
			}
		}
		
	}
	
}
