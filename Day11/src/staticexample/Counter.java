package staticexample;

// 웹 어플리케이션의 카운터 
public class Counter {

	// static 키워드는 
	// 맴버변수, 메서드
	 int dynamicCounter = 0;  // 인스턴스 변수(객체변수) 
	 static int staticCounter = 0; // 정적변수 
	 
	 // 인스턴스 메서드(객체 메서드) = 동적  
	 public void plusDynamicCounter() {
		 dynamicCounter ++; 
	 }
	 
	 // 정적 메서드 = 정적( MethodArea 에 한번만 할당 ) 
	 public static void plusStaticCounter() {
		 staticCounter ++; 
	 }
	 
}
