package kh.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import kh.spring.service.ManagerService;

@Controller
@RequestMapping("/manager/")
public class ManagerController {

	@Autowired
	private ManagerService serv;
	
	@RequestMapping("goAdmin")
	public String goAdmin(Model model) throws Exception {
		
		serv.selectNomal(model);
		return "/manager/managerMain";
	}
	
	@RequestMapping("ceoMember")
	public String managerCEO(Model model) throws Exception{
		
		serv.selectCEO(model);
		return "/manager/managerCEO";
	}
	
	@RequestMapping("delete")
	public String managerCEO(String id) throws Exception{
		
		serv.delete(id);
		return "/manager/managerMain";
	}
	
	@ExceptionHandler //예외 공동 처리
	public String exceptionHandler(Exception e) {//NumberFormatException.class, SQLException.class
		e.printStackTrace();
		return "error";
	}
}
