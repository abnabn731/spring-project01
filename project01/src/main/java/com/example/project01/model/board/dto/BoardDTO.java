package com.example.project01.model.board.dto;

import java.util.Date;

public class BoardDTO {
	
	private int bno; //게시글 고유 번호
	private String id; // 사용자 id
	private String title;
	private String content;
	private Date regdate; //java.util.Date
	private int bookmark; //즐겨찾는 글 1 or 0
	private String[] files; //첨부파일 이름 배열

	//getter,setter
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getBookmark() {
		return bookmark;
	}
	public void setBookmark(int bookmark) {
		this.bookmark = bookmark;
	}
	public String[] getFiles() {
		return files;
	}
	public void setFiles(String[] files) {
		this.files = files;
	}

}
