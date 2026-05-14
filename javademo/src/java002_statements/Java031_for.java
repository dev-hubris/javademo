package java002_statements;

/*
 * 1~10사이의 값 중 3의 배수만 제외하는 프로그램 구현
 * 1
 * 2
 * 4
 * 5
 * 7
 * 8
 * 10
 */

public class Java031_for {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {

			// 3의 배수가 아닐 때만 출력
			if (i % 3 != 0) {
				System.out.println(i);
			}
		}
//		for (int i = 1; i <= 10; i++) {
//
//			// 3의 배수이면 제외
//			if (i % 3 == 0) {
//				continue;
//			}
//
//			System.out.println(i);
//		}
	}
}
