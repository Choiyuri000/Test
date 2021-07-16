package co.comp.board.app;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.comp.board.service.BoardService;
import co.comp.board.serviceImpl.BoardServiceImpl;
import co.comp.board.vo.BoardVO;

public class Menu {
	private Scanner sc = new Scanner(System.in);
	private BoardService dao = new BoardServiceImpl();

	private void menuTitle() {
		System.out.println("==000 ��ü  ��� 000==");
		System.out.println("==0   1. �� ��ȸ   0==");
		System.out.println("==0   2. �� ����   0==");
		System.out.println("==0   3. �� ����   0==");
		System.out.println("==000 4.��    �� 000==");
		System.out.println(" >> �׸� ���� ");

	}

	
	private void mainMenu() {
		int selectNo;
		boolean b = false;
		do {
			menuTitle();
			switch (selectNo = sc.nextInt()) {

			case 1:

				boardSelect();
				break;
			case 2:
				boradInsert();
				break;
			case 3:
				boardDelete();
				break;
			case 4:
				b = true;
				System.out.println(">> ���α׷� ���� <<");
				break;
			}
		} while (!b);
	}

	private void boardDelete() {
		// TODO �� ����
		BoardVO vo = new BoardVO();
		System.out.println("������ ID �Է�");
		vo.setBoardId(sc.next());

		int n = dao.boardDelete(vo);
		if (n != 0) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}

	}

	private void boradInsert() {
		// TODO �� ����
		BoardVO vo = new BoardVO();
		System.out.println("ID �Է�");
		vo.setBoardId(sc.next());
		sc.nextLine();
		System.out.println("�ۼ��� �Է�");
		vo.setWriter(sc.next());
		sc.nextLine();
		System.out.println("���� �Է�");
		vo.setTitle(sc.next());
		sc.nextLine();
		System.out.println("���� �Է�");
		vo.setSubject(sc.nextLine());

		int n = dao.boardInsert(vo);
		if (n != 0) {
			System.out.println("�Է� ����");
		} else {
			System.out.println("�Է� ����");
		}

	}

	private void boardSelect() {
		// TODO �� ��ȸ
		BoardVO vo = new BoardVO();
		System.out.println("ID �˻�");
		vo.setBoardId(sc.next());
		sc.nextLine();

		vo = dao.boardSelect(vo);
		vo.toString();

	}

	public void boardList() {
		// TODO �Խ��� ��ü ��� ��� ����
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = dao.boardList();
		for (BoardVO board : boards) {
			board.toString();
		}
	}

	public void run() {
		mainMenu();
		sc.close();
	}
}
