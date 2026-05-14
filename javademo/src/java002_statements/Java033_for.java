package java002_statements;

/*
 * 1 2 3 4 5
 * 1 2 3 4 5 
 * 1 2 3 4 5 
 * 1 2 3 4 5 
 */
public class Java033_for {

	public static void main(String[] args) {
		// 행
		for (int i = 1; i <= 5; i++) {

			// 열
			for (int j = 1; j <= 5; j++) {

				System.out.print(j + " ");
			}

			System.out.println();
		}
	}
}
