package com.board.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.board.domain.MemberDTO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static String namespace = "com.board.mappers.member";
	
	@Override
	public MemberDTO login(MemberDTO dto) throws Exception {

		return sqlSession.selectOne(namespace + ".login", dto);
	}

}
