package java002_statements;

//	1	2	3	4
//	5	6	7 	8
//	9	10	11	12
public class Java032_for {

	public static void main(String[] args) {
		int num = 1;

		// 3행
		for (int i = 1; i <= 3; i++) {

			// 4열
			for (int j = 1; j <= 4; j++) {

				System.out.print(num + "\t");
				num++;
			}

			System.out.println();
		}
	}
}
