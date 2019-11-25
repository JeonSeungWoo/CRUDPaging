package org.spring.woo.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spring.woo.domain.BoardVO;
import org.spring.woo.domain.Paging;
import org.spring.woo.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller     //��Ʈ�ѷ� ������̼�
@RequestMapping("/board/*")   //��� ���� �޼ҵ� (board������ ���� ��� �����ȴ�.)
public class BoardController {
	//logger.info��� (sysout�����Ŵ�.{�⺻ ��Ʈ�ѷ��� �̹� �Ǿ� �ִ�.})
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	//service ��������
	@Inject
	private BoardService service;
	
	//insertPage����.(view.board.insertPage�� ��ΰ� ���� �Ǿ� �ִ�.)
	//web.xmp���� Ȯ�� ����.
	@RequestMapping(value = "/insertPage", method = RequestMethod.GET)
	public void insertPage() throws Exception {
	}
	
	//insert ��� redirect�� �� ��η� �̵��ϰ� �ȴ�.
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(Model model, BoardVO vo) throws Exception {
		service.insert(vo);
		return "redirect:/board/listPage?page=1";
	}
	//read��� bno�� �Ķ���ͷ� �����;� �Ѵ�.
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public void readPage(Model model, @RequestParam("bno") int bno) throws Exception {
		model.addAttribute("vo", service.read(bno));
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(Model model, BoardVO vo) throws Exception {
		logger.info("update Test ::   ");
		service.update(vo);
		return "redirect:/board/listPage?page=1";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public String delete(Model model, int bno) throws Exception {
		service.delete(bno);
		return "redirect:/board/listPage?page=1";

	}

	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public void listPage(Model model,int page,Paging paging) throws Exception {
		
		model.addAttribute("list",service.list(paging));
		model.addAttribute("Paging", new Paging(page, service.listCount()));
	}

	

		
}
