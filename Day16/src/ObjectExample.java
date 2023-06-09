import java.lang.*; // -- 이게 없어도 자바는 기본적으로 java.lang 패키지는 import 

public class ObjectExample { // extends Object { 기본적으로 자바클래스는 Object의 
											  // 상속을 받습니다. 

	public static void main(String args[]) {
		
		String s1 = "이종석"; 
		String s2 = "이종석"; 
		System.out.println(" s1 == s2 = " + (s1 == s2));
		// 상수 Pool ( String pool ) 
		System.out.println(s1.hashCode()); // 객체당 
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s1)); // 참조변수당
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("------------------------------------");
		
		String s3 = new String("이종석");
		String s4 = new String("이종석");
		System.out.println(" s3 == s4 = " + (s3 == s4));
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		System.out.println(" s3.equals(s4) = " + s3.equals(s4)); 
		System.out.println("이종석".toString()); 
		
		Student std = new Student("이종석", 1); 
		System.out.println(std); // System.out.println(std.toString());
		
	}
	
}


class Student {
	
	String name; 
	int grade; 
	
	//-- 생성자 
	Student(String name, int grade) {
		this.name = name; 
		this.grade = grade; 
	}
	
	//-- 오버라이딩(Object클래스에 있는 메소드를) 
	@Override
	public String toString() {
		return "class Student { name = " + name + ", grade = " + grade + "}";
	}
}




