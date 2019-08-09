package com.example.project01.controller.board;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project01.service.board.BoardService;

@Controller 
@RequestMapping("board/*") 
public class BoardController {
	
	@Inject 
	BoardService boardService;


}










