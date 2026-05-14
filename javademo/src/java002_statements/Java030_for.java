package java002_statements;

//1~10까지 짝수, 홀수 누적을 계산하는 프로그램
//
//[출력결과]
//홀수누적:25
//짝수누적:30
//

public class Java030_for {

	public static void main(String[] args) {

		int oddSum = 0; // 홀수 누적
		int evenSum = 0; // 짝수 누적

		// 1~10 반복
		for (int i = 1; i <= 10; i++) {

			// 홀수
			if (i % 2 == 1) {
				oddSum += i;
			}
			// 짝수
			else {
				evenSum += i;
			}
		}

		System.out.println("홀수누적:" + oddSum);
		System.out.println("짝수누적:" + evenSum);
	}

}
