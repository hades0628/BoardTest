package com.board.dao;

import com.board.domain.MemberDTO;

public interface MemberDAO {
	
	public MemberDTO login(MemberDTO dto) throws Exception;
}
