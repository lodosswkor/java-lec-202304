package acc;
import acc.data.Parent;

public class AccChild extends Parent{
	
	public AccChild() {
		
		this.publicName = "이종석"; // 접근가능/상속받음
		this.defaultName = "이종석"; // 접근불가/상속x(에러)
		this.protectedName = "이종석"; // 접근가능/상속받음
		this.privateName = "이종석"; // 접근불가/상속x(에러) 
		
	}

}
