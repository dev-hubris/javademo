package java009_inheritance.part03;

public class SubConst extends SuperConst {

	public SubConst(int x, int y) { // 2
		super(x, y); // 3
	}
	
	/* overriding 오버라이딩*/
	// 메소드의 선언부는 그대로 사용하고, 메소드의 구현부만 재정의한다.
	// 단, 메소드의 접근제어자는 확장이 가능하다. protected => protected, public
	
	// 개발자들을 위한 안전장치를 걸어준 게 Override 어노테이션
	// 내가 이걸 Override해서 사용할 건데 잘못적어서 의도와 다르게 안되었을 경우를 대비해 마련해둔 장치
	@Override
	public String toString() {
		return String.format("x=%d, y=%d", x, y);
	}
	
	public void display() {
		System.out.println(super.toString());
		System.out.println(this.toString());
	}
}
