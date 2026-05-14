package java002_statements;

//2개의 주사위를 던졌을 때 합계가 5가 되는 경우의 수를 구하시오.
//(1,4),(2,3),(3,2),(4,1)

public class Java034_for {

	public static void main(String[] args) {

		int count = 0;

		// 첫 번째 주사위
		for (int i = 1; i <= 6; i++) {

			// 두 번째 주사위
			for (int j = 1; j <= 6; j++) {

				// 합이 5인 경우
				if (i + j == 5) {

//					System.out.println(i + " + " + j + " = 5");
					System.out.print("(" + i + "," + j + ") ");
					count++;
				}
			}
		}
		System.out.println();
		System.out.println("경우의 수 : " + count);
	}
}
