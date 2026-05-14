package java010_abstract_interface.part01;

// 위로 올라갈수록 추상적 아래로 내려갈수록 구체적
public class SendaAbs extends CarAbs {
	public SendaAbs() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void work() {
		System.out.println("센다는 사람의 이동수단을 돕습니다.");
	}
}
