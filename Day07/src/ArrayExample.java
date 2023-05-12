
public class ArrayExample {

	public static void main(String args[]) {
		
		// 1. 선언과 공간할당하는 법 
		
		//-- 선언과 공간할당(방)를 따로따로 
		//-- 배열을 선언 
		int odd[]; 
		//-- 초기화 방법 
		odd = new int[4]; // [방의 갯수]
		
		//-- 선언과 동시에 공간할당(방)을 만들어 주는 방식 
		int odd2[] = new int[4]; 
		
		int a[][][] = new int[3][100][3];
		// a[0][1][2];
		// php c -> arr["종석점수"]["2023"]["중간고사"]["수학"] = 100;
		// arr[0][0][1][0]= 100;
		
		
		// 2. 각 방에 값을 넣어주는 것 
		odd2[0] = 1;
		odd2[1] = 3;
		odd2[2] = 5;
		odd2[3] = 7; 
		
		// 3. 선언과 동시에 방을 생성하면서, 값까지 넣어주는 방법
		int odd3[] = {1,3,5,7};
		for(int i = 0; i < odd3.length; i++) {
			System.out.println(odd2[i]); 
		}
		
		//!) 10개짜리 방을 만들고, 이 안에 홀수를 다 채우고싶어요
		int[] odd4 = new int[10];
		int idx = 0; //-- 배열의 호실 
		for(int x = 1; x <= 100; x++) {
			if(idx > 9) {
				break;
			}
			if(x % 2 == 0) {
				continue; 
			}
			
			System.out.println
			("배열의 idx(호실) : " + idx + " 들어간 값 : " + x);
			odd4[idx++] = x; 
		}
			
		
		
	}
	
}
