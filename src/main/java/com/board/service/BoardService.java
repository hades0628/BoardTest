package com.board.service;

import java.util.List;

import com.board.domain.BoardDTO;

public interface BoardService {
	public List list() throws Exception;
	
	public int regi(BoardDTO dto) throws Exception;
	
	public BoardDTO view(int seq) throws Exception;
	
	public int update(BoardDTO dto) throws Exception;
	
	public int delete(int seq) throws Exception;
}
