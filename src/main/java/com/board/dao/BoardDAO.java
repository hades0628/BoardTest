package com.board.dao;

import java.util.List;

import com.board.domain.BoardDTO;

public interface BoardDAO {
	
	public List list() throws Exception;
	
	public Integer getMaxSeq() throws Exception;
	
	public int regi(BoardDTO dto) throws Exception;
	
	public BoardDTO view(int seq) throws Exception;
	
	public void updateReadCount(int seq) throws Exception;
	
	public int update(BoardDTO dto) throws Exception;
	
	public int delete(int seq) throws Exception;

}
