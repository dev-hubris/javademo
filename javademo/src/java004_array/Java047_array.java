package java004_array;

//[데이터]
//홍길동   90  85 40
//이영희  100  35 75
//
//[출력결과]
//홍길동   90  85 40 215 71.7
//이영희  100  35 75 210 70.0

public class Java047_array {
	public static void main(String[] args) {

		// 이름 배열
		String[] name = { "홍길동", "이영희" };

		// 점수 배열
		int[][] score = { { 90, 85, 40 }, { 100, 35, 75 } };

		// 출력
		for (int i = 0; i < score.length; i++) {

			int sum = 0;

			System.out.print(name[i] + "\t");

			// 과목 점수 출력 및 합계 계산
			for (int j = 0; j < score[i].length; j++) {

				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
			}

			// 평균 계산
			double avg = (double) sum / score[i].length;

			// 합계와 평균 출력
			System.out.printf("%d\t%.1f\n", sum, avg);
		}
//		// 출력
//		for (int i = 0; i < score.length; i++) {
//
//			int sum = 0;
//
//			// 총점 계산
//			for (int j = 0; j < score[i].length; j++) {
//				sum += score[i][j];
//			}
//
//			// 평균 계산
//			double avg = (double) sum / score[i].length;
//
//			// 출력
//			System.out.printf("%s\t", name[i]);
//
//			for (int j = 0; j < score[i].length; j++) {
//				System.out.printf("%d\t", score[i][j]);
//			}
//
//			System.out.printf("%d\t%.1f\n", sum, avg);
//		}
	}

}
