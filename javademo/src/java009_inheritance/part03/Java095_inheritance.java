package java009_inheritance.part03;

public class Java095_inheritance {

	public static void main(String[] args) {
		SubConst sc = new SubConst(10, 20); // 1
		System.out.printf("x=%d, y=%d\n", sc.x, sc.y); // 10
		
		//Object : 클래스@해쉬코드
		sc.display();
	}
}
