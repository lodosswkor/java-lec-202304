// 컴파일 에러를 발생시키는 기초 문법
//1. 자바는 클래스이름과 파일명이 같아야합니다.
//2. 자바는 대소문자를 구분합니다. 
// ex) Java java -> 같지 않아요
//3. { } 중괄호로 문단,문장을 구분합니다. 
//4. 자바의 문장의 끝은 ; 을 사용합니다. 

public class JavaStructure 
{
	public static void main(String args[]) {
		//System.out.println("하악하악");
		
		//System.out.println("하악하악") <-- 오류
		// 문장의 끝에는; 이 필요해서 오류.
		
		System
		.out //<-- 에러 (문장이 중간에 끝났다) 
		.println("하악하악")
		;;;
		
		
		
	}

}
