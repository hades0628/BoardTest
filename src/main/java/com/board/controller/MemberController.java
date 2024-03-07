package com.board.controller;

import java.util.Locale;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.board.domain.MemberDTO;
import com.board.service.MemberService;

@Controller
public class MemberController {
	
	@Inject
	private MemberService service;
	
	@RequestMapping(value = "/" , method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		return "/member/login";
	}
	
	@ResponseBody
	@RequestMapping(value="/memberlogin", method = RequestMethod.POST)
	public String regi(Locale locale, Model model, MemberDTO dto, HttpSession session)throws Exception{
		MemberDTO dto2 = service.login(dto);
		
		if(dto != null) {
			session.setAttribute("id", dto2.getId());
			return "Y";
		}else {
			return "N";
		}
	}
}
	
