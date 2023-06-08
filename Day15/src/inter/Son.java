package inter;

public class Son implements Father01, Father02{

	@Override
	public void sayMyName() {
		// TODO Auto-generated method stub
		System.out.println("이름이름"); 
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Son 이 먹는다.");
	}
	
	public void father01Eat() {
		//-- 인터페이스 Father01의 default 메서드인 eat()을 호출하겠다.
		Father01.super.eat();
	}
	
	public static void main(String args[]) {
			Son son = new Son(); 
			son.eat(); 
			son.father01Eat(); 
	}

}
