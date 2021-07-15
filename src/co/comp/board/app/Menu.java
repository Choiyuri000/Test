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
		System.out.println("==000 전체  목록 000==");
		System.out.println("==0   1. 글 조회   0==");
		System.out.println("==0   2. 글 쓰기   0==");
		System.out.println("==0   3. 글 삭제   0==");
		System.out.println("==000 종      료 000==");
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
		// TODO 글 쓰기
		BoardVO vo = new BoardVO();
		System.out.println("ID 입력");
		vo.setBoardId(sc.next()); sc.nextLine();
		System.out.println("작성자 입력");
		vo.setWriter(sc.next()); sc.nextLine();
		System.out.println("제목 입력");
	}

	private void boardSelect() {
		// TODO 글 조회
		BoardVO vo = new BoardVO();
		System.out.println("ID 검색");
		vo.setBoardId(sc.next());
		sc.nextLine();
		 
		vo = dao.boardSelect(vo);
		vo.toString();
		
	}

	private void boardList() {
		// TODO 게시판 전체 목록 상시 노출
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
