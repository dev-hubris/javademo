package java008_static_access.part02;

public class Java005_static {

	public static void main(String[] args) {
		// System.out.println("OrderStatic.y=" + OrderStatic.y);
		// System.out.println("OrderStatic.z=" + OrderStatic.z);
		OrderStatic.process();
		
		// OrderStatic os = new OrderStatic();
		// os.display();
		
//		OrderStatic os = new OrderStatic();
//		os.process();
		
		// non=static 자원은 static 메소드에서 호출할 수 없다.
		// 메모리에 생성되는 시점이 다르다.
		// cal(); // main문은 static이라서 메모리에 생성되자마자 올라가야하는데 cal()을 부를 경우 메모리에 생성된 게 없으니 오류난다
		
		Java005_static js = new Java005_static();
		js.cal();
	}
	
	public void cal() {
		System.out.println("cal");
		plus();
	}
	
	public void plus() {
		System.out.println("plus");
	}
}
