package co.comp.board.app;

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
		System.out.println("==000 ��      �� 000==");
	}
	
	private void mainMenu() {
		int selectNo;
		boolean b = false;
		
		do {
			menuTitle();
			switch (selectNo = sc.nextInt()) {
			case 1:
				boardList();
				break;
			case 2:
				boardSelect();
				break;
			case 3:
				boradInsert();
				break;
			case 4:
				boardDelete();
				break;
			}
		} while (!b);
	}

	private void boardDelete() {
		// TODO Auto-generated method stub
		
	}

	private void boradInsert() {
		// TODO �� ����
		BoardVO vo = new BoardVO();
		System.out.println("ID �Է�");
		vo.setBoardId(sc.next()); sc.nextLine();
		System.out.println("�ۼ��� �Է�");
		vo.setWriter(sc.next()); sc.nextLine();
		System.out.println("���� �Է�");
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

	private void boardList() {
		// TODO �Խ��� ��ü ��� ��� ����
		List<BoardVO> boards = new ArrayList<BoardVO>();
		boards = dao.boardList();
		for(BoardVO board : boards) {
			board.toString();
		}
	}
	
	public void run() {
		mainMenu();
		boardList();
		sc.close();
	}
}
