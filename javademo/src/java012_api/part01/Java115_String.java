package java012_api.part01;

import java.util.Iterator;

//import java.lang.String;

//public final class String << class에 final이 붙으면 상속을 못한다.
//https://docs.oracle.com/javase/8/docs/api/
//java api document 구글링
public class Java115_String {

	public static void main(String[] args) {
		String str = new String("KoREa,jsp,java");
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.charAt(0));
		String[] arr = str.split(",");
		for (String line : arr) {
			System.out.println(line);
		}
		
		char[] data = {'1', '2', '3'};
		String sn = String.valueOf(data);
		System.out.println(sn);
		
	}
}
