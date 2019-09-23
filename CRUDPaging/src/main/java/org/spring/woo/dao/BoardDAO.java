package org.spring.woo.dao;

import org.spring.woo.domain.BoardVO;

public interface BoardDAO {
	//BoardVO�� �Ķ���ͷ� �ѱ��.
	public void insert(BoardVO vo) throws Exception;
    //int bno�� �Ķ���ͷ� �ް� VO�� �����Ѵ�.
	public BoardVO read(int bno) throws Exception;
	public void update(BoardVO vo) throws Exception;
	public void delete(int bno) throws Exception;

}
