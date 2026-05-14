package java012_api.part01;

/*
 * [출력결과]
 * ip:127.0.0.1
 * port:8080
 */

public class Java116_String {

	public static void main(String[] args) {
		String sn = "127.0.0.1:8080";
		
		//소스코드를 볼땐 이런 저런 방법들이 많으니 다양한 방법들을 알아보는 게 좋다. 꼭 완벽한 정답은 없다.
		//성능은 후순위다. 로직이 처리되는 시간이라든가... method별로 시간을 잡아내서 확인한다.
		
		// 보통 index는 미만으로 친다.
		// DB에서는 갯수를 의미한다.
		int index = sn.indexOf(":"); //9
		System.out.println(index);
		System.out.println("ip:" + sn.substring(0, index));  // 127.0.0.1
		System.out.println("port:" + sn.substring(index + 1)); // 8080
		
		System.out.println("===================================");
		String[] data = sn.split(":");
		System.out.println("ip:" + data[0]);  // 127.0.0.1
		System.out.println("port:" + data[1]); // 8080


		
	}
}
