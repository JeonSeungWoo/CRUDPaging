package org.spring.woo.service;

import javax.inject.Inject;

import org.spring.woo.dao.BoardDAO;
import org.spring.woo.domain.BoardVO;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService{
	@Inject
	private BoardDAO dao;
	@Override
	public void insert(BoardVO vo) throws Exception {
		dao.insert(vo);
	}
	@Override
	public BoardVO read(int bno) throws Exception {
		return dao.read(bno);
	}
	@Override
	public void update(BoardVO vo) throws Exception {
		dao.update(vo);
	}
	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}
}
