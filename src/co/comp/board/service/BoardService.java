package co.comp.board.service;

import java.util.ArrayList;
import java.util.List;

import co.comp.board.vo.BoardVO;

public interface BoardService {
	List<BoardVO> boardList();  // ����Ʈ

	BoardVO boardSelect(BoardVO vo);  // �� �ϳ� ��ȸ

	int boardInsert(BoardVO vo); // �� �߰�

	int boardDelete(BoardVO vo); // �� ����

	
	
	

}
