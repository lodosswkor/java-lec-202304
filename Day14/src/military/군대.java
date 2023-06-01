package military;

public abstract class 군대 { // 추상클래스 
	
	int 복무기간 = 26; 
	
	void 어디소속() {
		System.out.println("군대소속");
	}
	
	abstract void 복무기간출력(); 
	
}
