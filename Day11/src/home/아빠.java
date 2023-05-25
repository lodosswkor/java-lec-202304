package home;


// class는 protected 가 안됨 
public class 아빠 {

	
	//public int walletBalance = 30000; // 지갑에 들어있는 돈 
	private int walletBalance = 30000; // 지갑에 들어있는 돈 
	
	public void sayMyName() {
		System.out.println("난 종석이 아빠야."); 
	}
	
	/*
	protected int 용돈주세요() {
	    return 1000; 
	}
	*/
	
	public int 용돈주세요() {
		
		if(walletBalance < 25000) {
			System.out.println(">> 돈없어 이세꺄.");
			return 0; 
		}
		
		int 용돈 = 1000; 
		walletBalance -= 용돈; 
		System.out.println(">> 여기있다 용돈 " + 용돈 + "원");
		return 용돈; 
	}
	
	
	//-- 가족이(특히 엄마) 돈 내놔 하면 아버지 지갑 싹 털림.
	protected int 돈내놔() {
		int 돈 = walletBalance; 
		walletBalance = 0; 
		return 돈; //-- 남은돈 모두를 바친다. 
	}
	
	
    void 청소하기() {
    	System.out.println("집안 청소 쓱쓱쓱"); 
    }
	
}
