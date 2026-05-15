package java013_api;

//1. 기본자료형을 클래스로 정의해 놓은 것을 Wrapper라 한다.
//char		-> Character
//byte		-> Byte
//short		-> Short
//int		-> Integer
//long		-> Long
//float		-> Float
//double	-> Double
//boolean	-> Boolean
//
//2. 메모리에 저장된 값을 다른 자료형으로 변환해주는 메소드를 제공하기 위해서
//Wrapper클래스를 제공한다.
//
//3. auto boxing 과 auto unboxing은 jdk5.0에서 추가된 기능이다.
//auto boxing => 스택 -> 힙 영역에 복사
//auto unboxing => 힙 -> 스택 영역에 복사

public class Java150_Wrapper {
	public static void main(String[] args) {
		int a = 10;
		Integer it = new Integer(10);
		System.out.println(it.floatValue());
		
		it = a;
		System.out.println(it.floatValue());
	}

}
