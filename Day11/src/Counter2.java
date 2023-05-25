
public class Counter2 {
    
	int count = 0; 
	static int count2 = 0;  
    
	Counter2() {
		count++; 
		Counter2.count2++; 
		System.out.println("동적 변수 count = " + count);
		System.out.println("정적 변수 count2 = " + count2); 
	}
	
	public static void main(String args[]) {
		
		Counter2 a = new Counter2(); 
		Counter2 b = new Counter2(); 
		Counter2 c = new Counter2(); 
		Counter2 d = new Counter2(); 
		
	}
	
}
