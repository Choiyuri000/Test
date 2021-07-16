package co.comp.board.vo;

import java.sql.Date;

public class BoardVO {
	private String boardId;
	private String writer;
	private String title;
	private String subject;
	private Date enterdate;
	private int hit;

	public BoardVO() { // 생성자

	}

	public String getBoardId() {
		return boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getEnterdate() {
		return enterdate;
	}

	public void setEnterdate(Date enterdate) {
		this.enterdate = enterdate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	@Override
	public String toString() {
		return "ID: " + boardId + "| 작성자: " + writer + " | 제목: " + title + " | 내용: " + subject
				+ " | 작성일: " + enterdate + " | 조회수: " + hit + "]";
	}

	
}
