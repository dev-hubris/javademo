package java011_casting.part02;

public class java113_binding {

	public static void main(String[] args) {
		LgTv lgTv = new LgTv("LG");
		process(lgTv);
		
		SamsungTv ssTv = new SamsungTv("SAMSUNG");
		process(ssTv);
		
		HomeTv hstv = new SamsungTv("SS");
		process(hstv);
	}
	
	//업캐스팅
	public static void process(HomeTv tv) {
		tv.turnOff();
		if (tv instanceof LgTv) {
			LgTv lgTv = (LgTv) tv; //다운캐스팅
			lgTv.call();
			//((LgTv) tv).call();
		} else if (tv instanceof SamsungTv) {
			SamsungTv ssTv = (SamsungTv) tv; //다운캐스팅
			ssTv.move();
			//((SamsungTv) tv).move();
		}
	}
	
	// 밑에 껄로 사용할 경우 LgTv만 사용가능한 메서드이기 때문에 결합도가 매우 높다.
	// 그래서 부모클래스로 오도록 매개변수를 바꿀 경우 결합도(의존도)를 낮출 수 있다.
	// 비용절감을 위해서 비슷한 것들을 업캐스팅 해서 묶여서 사용하려고 나옴
	// 유지보수 차원에서도 좋고, 반복사용 시 코드 재사용성 부분에서도 좋다.
//	public static void process(LgTv lg) {
//		lg.turnOff();
//	}
}
