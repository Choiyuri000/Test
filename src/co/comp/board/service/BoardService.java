package co.comp.board.service;

import java.util.ArrayList;
import java.util.List;

import co.comp.board.vo.BoardVO;

public interface BoardService {
	List<BoardVO> boardList();  // 리스트

	BoardVO boardSelect(BoardVO vo);  // 글 하나 조회

	int boardInsert(BoardVO vo); // 글 추가

	int boardDelete(BoardVO vo); // 글 삭제

	
	
	

}
