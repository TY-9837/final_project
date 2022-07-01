package kh.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kh.spring.dao.NoticeDAO;
import kh.spring.dto.QuestionDTO;

@Service
public class NoticeService {
	@Autowired
	private NoticeDAO dao;
	
	public List<QuestionDTO> selectAll() throws Exception{
		return dao.selectAll();
		
	}
}
