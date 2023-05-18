// 다차원 배열 
public class MultipleArrayExample {

	public static void main(String[] args) {
		
		//1. 1차원 배열
		//1-1. 선언  
		int[] a; 
		//1-2. 선언과 (빈)방만들기 
		int[] a1 = new int[3]; // 방 3개 짜리 1층 건물을 만드세요/ 
		//1-3. 선언과 동시에 방 갯수 + 값까지 채우기
		int[] a2 = {1,2,3}; 
		//1-4. for문으로 전체 출력 
		for(int x = 0; x < a2.length; x++) {
			System.out.println(a2[x]);
		}
		
		//2. 2차원 배열 
		//2-1. 선언
		int[][] b; // 층/방
		//2-2. 선언과 (빈)방만들기 ( 방3개짜리 2층 집 )
		int[][] b1 = new int[2][3]; 
		//2-3. 선언과 동시에 방 갯수 + 값 까지 채우기 
		int[][] b2 = { 
						{1,2,3} , // 한 층에 방3개  
						{3,4,5} 
			         }; 
		//2-4. For문으로 전체 출력
		System.out.println("2차원 배열 출력하기");
		
		for(int y = 0; y < b2.length ; y ++) { // 층으로 접근 
			for( int x = 0; x < b2[y].length; x ++) { // 방으로 접근 
				System.out.println(b2[y][x]);
			}
		}
		
		
	}
	
}
