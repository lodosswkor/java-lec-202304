package staticexample;

public class WebApp {

	public static void main(String args[]) {
		
		Counter counter = new Counter(); 
		//-- 이걸 만나는 순간 JVM의 execute engine이 
		//-- Heap영역에 데이터 할당 
		counter.plusDynamicCounter(); 
		counter.plusDynamicCounter(); 
		counter.plusDynamicCounter(); 
		System.out.println(counter.dynamicCounter); 
		//-- 3을 출력 
		
		Counter counter2 = new Counter(); 
		System.out.println(counter2.dynamicCounter);
		
		//-- static 은 어디에 할당? (Method Area) 
		
		Counter.plusStaticCounter();
		Counter.plusStaticCounter();
		Counter.plusStaticCounter();
		System.out.println(Counter.staticCounter);
		
		
	}
	
}
