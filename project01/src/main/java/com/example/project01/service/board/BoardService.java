package com.example.project01.service.board;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.example.project01.model.board.dto.BoardDTO;

public interface BoardService {
	
	public void create(BoardDTO dto) throws Exception; //글쓰기
	public BoardDTO read(int bno) throws Exception; //글 하나 	불러오기
	public void update(BoardDTO dto) throws Exception; //글 수정
	public void delete(int bno) throws Exception; //글 삭제
	//글 목록 불어오기
	public List<BoardDTO> listAll(String search_option, String keyword,int start, int end) throws Exception; 
	//글 개수
	public int countArticle(String search_option, String keyword) throws Exception;
	public void deleteFile(String fullName); //첨부파일 삭제
	public List<String> getAttach(int bno); //첨부파일 목록 불러오기

}






