


public class StringEx {

	public static void main(String args[]) {
	
		String str1 = "이종석";
		String str2 = "만세";
		System.out.println("str1 = " + System.identityHashCode(str1)); 
		str1 = str1 + str2 + "하악하악";
		System.out.println("str1 = " + System.identityHashCode(str1)); 
		System.out.println(str1);
		
		StringBuffer str3 = new StringBuffer("이종석"); 
		System.out.println("str3 = " + System.identityHashCode(str3));
		
		str3.append(str2).append("하악하악");
		
		System.out.println("str3 = " + System.identityHashCode(str3));
		System.out.println(str3);
		System.out.println("str1 == str3 " + (str1.equals(str3)));
		
		
	}
	
}
