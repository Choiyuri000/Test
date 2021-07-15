package co.yedam;

import java.util.Scanner;

public class MainApplication {

	static Scanner scn = new Scanner(System.in);
	private static String string;
	Student student [] = new Student[10];

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int select = scn.nextInt();

		menu();
		boolean run = true;
		while (run) {
			if (select == 1) {
				insert();
			} else if (select == 2) {
				update();
			} else if (select == 3) {
				delete();
			} else if (select == 4) {
				list();
			} else if (select == 5) {
				info();
			} else if (select == 6) {
				analysis();
			} else if (select == 7) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");

	} // end of main

	public static void analysis() {
		System.out.println("점수분석 ..");
		
	
	}

	public static void info() {
		System.out.print("조회할 학번입력 >> ");
		
		
	}

	public static void list() {
		
	}

	public static void delete() {
		System.out.println("학번입력 >> ");
	}

	public static void update() {
		System.out.println("학번입력 >> ");

	}

	public static void insert() {

		Scanner scn = new Scanner(System.in);

		System.out.print("학번입력 >> ");
		scn.nextLine();
		System.out.print("이름입력 >> ");
		scn.nextLine();
		System.out.print("영어점수입력 >> ");
		scn.nextInt();
		System.out.print("수학점수입력 >> ");
		scn.nextInt();
		
		System.out.println("새 정보가 입력되었습니다.");
	}



	public static void menu() {
		System.out.println("============= 학 생 정 보 시 스 템 =============");
		System.out.println("1.입력 2.수정 3.삭제 4.리스트 5.단건조회 6.분석 7종료");
		System.out.println("=============================================");
		System.out.println("선택 >>> ");
	}

} // end of class
