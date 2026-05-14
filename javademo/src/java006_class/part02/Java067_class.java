package java006_class.part02;

public class Java067_class {

	public static void main(String[] args) {
		Book bk = new Book(); // title=null, state = false
		bk.title = "칼의 노래"; // title = "칼의 노레", state = false
		bk.state = false; // title = "칼의 노레", state = false
		
		Book bs = new Book(); // title = null, state = false
		bs.title = "어두운 상점의 거리"; // title = "어두운 상점의 거리", state = false
		bs.state = true; // title = "어두운 상점의 거리", state = true
		
		bk.display();
		bs.display();
	}
}
