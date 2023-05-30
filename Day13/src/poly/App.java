package poly;

public class App {

	public static void main(String args[]) {
	
		// 1. 공장을 만들고 
		Factory f = new Factory(); 
		
		// 2. 채용을 함. (4명 채용) 
		/*f.채용(new 사람("이종석")); 
		f.채용(new 사람("박은진")); 
		f.채용(new 사람("김진수")); 
		f.채용(new 사람("이지우"));  */ 
		
		f.채용(new 생산직("이종석", "설계")); 
		f.채용(new 생산직("박은진", "조립")); 
		f.채용(new 생산직("김진수", "QC")); 
		f.채용(new 생산직("이지우", "상품화"));  
		
		// 3. 일을 시키자!! 
		f.생산하다();
		
	}
	
	
}
