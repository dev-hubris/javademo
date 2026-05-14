package java010_abstract_interface.part03;

// extends --- implements ---, ---, --- class 상속 및 추상 클래스 상속 순서 지킬 것
public class Life extends Animal implements SampleA, SampleB {

	public Life() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void call() {
		System.out.println("call");
	}

	@Override
	public void prn() {
		System.out.println("prn");
	}

}
