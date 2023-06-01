package military;

public class 공군 extends 군대{

	//-- 어디소속() 일반메서드(구현이 이미 부모클래스에서 정의) 
	//-- 재정의를 해주건, 해주지 않건 여러분의 자유 
	@Override 
	void 어디소속() {
		System.out.println("공군 17 전투비행단 소속");
	}
	
	//-- 부모클래스의 추상메서드이므로 재정의(구현)을 안해주면 
	//-- 컴파일 에러 (강제성)
	@Override
	void 복무기간출력() {
		// TODO Auto-generated method stub	
		System.out.println("공군은 30개월"); 
	}

}
