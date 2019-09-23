package org.spring.woo.dao;

import org.spring.woo.domain.BoardVO;

public interface BoardDAO {
	//BoardVO를 파라미터로 넘긴다.
	public void insert(BoardVO vo) throws Exception;
    //int bno를 파라미터로 받고 VO로 저장한다.
	public BoardVO read(int bno) throws Exception;
	public void update(BoardVO vo) throws Exception;
	public void delete(int bno) throws Exception;

}
