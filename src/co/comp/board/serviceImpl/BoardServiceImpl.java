package co.comp.board.serviceImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.comp.board.dao.DAO;
import co.comp.board.service.BoardService;
import co.comp.board.vo.BoardVO;

public class BoardServiceImpl extends DAO implements BoardService {

	private PreparedStatement psmt; // DAO
	private ResultSet rs;

	@Override
	public List<BoardVO> boardList() {
		// TODO 전체 리스트 상시 노출
		List<BoardVO> list = new ArrayList<BoardVO>();
		BoardVO vo;
		String sql = "select * from member";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				vo = new BoardVO();
				vo.setBoardId(rs.getString("id"));
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setSubject(rs.getString("subject"));
				vo.setEnterdate(rs.getDate("enterdate"));
				vo.setHit(rs.getInt("hit"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int boardInsert(BoardVO vo) {
		// TODO 글 쓰기
		int n = 0;
		String sql = "insert into board values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBoardId());
			psmt.setString(2, vo.getWriter());
			psmt.setString(3, vo.getTitle());
			psmt.setString(4, vo.getSubject());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int boardDelete(BoardVO vo) {
		// TODO 글 삭제
		int n = 0;
		String sql = "delete from board where id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBoardId());
			n = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}

	@Override
	public int boardId(BoardVO vo) {
		// 조회수 선택
		int n = 0;
		String sql = "select subject from board where boardid = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBoardId());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setSubject(rs.getString("subject"));
				hitUpdate(vo.getBoardId());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	private void hitUpdate(String boardid) {
		String sql = "update board set hit = hit + 1 where boardid = ?";
		try { 
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, boardid);
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public BoardVO boardSelect(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
}
