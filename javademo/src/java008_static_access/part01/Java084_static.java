package java008_static_access.part01;

//static
//1. class loader일때 method area에 저장이 된다.
//2. 같은 클래스로 생성된 객체끼리 공유해서 사용한다.
//3. static키워드가 선언된 메소드에서 this, super키워드를 사용할 수 없다.
//
//https://velog.io/@jupiter-j/Java-2.-Inheritance-AbstractMethod

//java Java084_static
public class Java084_static {

	public static void main(String[] args) {
		// static이 붙어있는 멤버변수를 사용하려면 그냥 앞에 클래스를 붙여서 쓰는 게 가독성 면에서도 좋다.
		System.out.printf("StaticEx.y=%d\n", StaticEx.y); 
		// System.out.print("StaticEx.x=%d\n", StaticEx.x);

		StaticEx se = new StaticEx(); //se.x = 5, se.y = 10
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y);

		StaticEx ss = new StaticEx(); //ss.x = 5, ss.y = 10
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x, ss.y);

		se.x = 20; //se.x = 20, se.y = 10
		se.y = 30; //se.x = 20, se.y = 30
		System.out.printf("se.x=%d, se.y=%d\n", se.x, se.y); //se.x = 20, se.y = 30
		System.out.printf("ss.x=%d, ss.y=%d\n", ss.x, ss.y); //ss.x = 5, ss.y = 30

	} // end main()

}// end class
