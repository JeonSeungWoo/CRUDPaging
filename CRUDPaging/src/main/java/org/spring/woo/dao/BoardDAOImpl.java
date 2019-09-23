package org.spring.woo.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.spring.woo.domain.BoardVO;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements BoardDAO{
    
	//sql factory �������� inject awtowired���� ����
	@Inject
	private SqlSession session;
	String name = "board.";	
	
	@Override
	public void insert(BoardVO vo) throws Exception {
		//��ϱ�� mapper�� ��θ� ���ش�.
		session.insert(name+"insert",vo);
	}
	@Override
	public BoardVO read(int bno) throws Exception {
		//select ������ 1���� ���� ������ ���.
		return session.selectOne(name+"read",bno);
	}
	@Override
	public void update(BoardVO vo) throws Exception {
		session.update(name+"update",vo);
	}
	@Override
	public void delete(int bno) throws Exception {
		session.delete(name+"delete",bno);
	}

}
