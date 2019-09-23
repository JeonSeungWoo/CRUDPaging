package org.spring.woo.service;

import org.spring.woo.domain.BoardVO;

public interface BoardService {
	public void insert(BoardVO vo) throws Exception;
	public BoardVO read(int bno) throws Exception;
	public void update(BoardVO vo) throws Exception;
	public void delete(int bno) throws Exception;
}
