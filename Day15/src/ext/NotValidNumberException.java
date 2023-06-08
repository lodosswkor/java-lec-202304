package ext;

// 넘어오는 숫자가 100이 넘으면 예외
public class NotValidNumberException extends Exception {
	//NotValidNumberException() 
	NotValidNumberException(String msg) {
		super(msg);
	}
}
