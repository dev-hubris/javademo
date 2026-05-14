package java002_statements;

//30 : 4, 6, 9, 11
//31 : 1, 3, 5, 7, 8, 10, 12
//28 or 29 : 2

//[윤년 조건]
//첫번째 조건 : 년도를 4나누어서 나머지가 0이면 되고 년도를 100나누어서 나머지가 0이 되면 안된다.
//두번째 조건 : 년도를 400나누어서 나머지가 0이면 된다.
//위 두개의 조건중 한개이상 만족하면 된다.

public class Java022_switch {
	public static void main(String[] args) {

		int year = 2025; // 년도
		int month = 2; // 월
		int lastDay; // 마지막일
		

		switch (month) {

		// 31일
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDay = 31;
			break;

		// 30일
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30;
			break;

		// 2월
		case 2:

			// 윤년 판별
			if ((year % 4 == 0 && year % 100 != 0)
					|| (year % 400 == 0)) {

				lastDay = 29;

			} else {

				lastDay = 28;
			}

			break;

		default:
			lastDay = 0;
			System.out.println("잘못된 월입니다.");
		}

		System.out.printf("%d년 %d월의 마지막 일은 %d일입니다.\n",
				year, month, lastDay);

	}

}
