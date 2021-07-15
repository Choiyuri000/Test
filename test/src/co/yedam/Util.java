package co.yedam;

import java.util.Scanner;

public class Util {

	static Scanner scn = new Scanner(System.in);

	public static String readString(String prompt) {
		System.out.println(prompt);
		return readString();

	}

	public static String readString() {
	 String msg = null;
	 try {
		 msg = scn.nextLine();
	 } catch (Exception e) {
		 System.out.println("해당 항목이 없습니다.");
	 }
	 return msg;
 }
}
