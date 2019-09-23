package kr.co.itcen.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//@RequestMapping Type 단독 매핑
@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	@ResponseBody
	@RequestMapping
	public String list() {
		return "GuestbookController:list()";
	}
}
