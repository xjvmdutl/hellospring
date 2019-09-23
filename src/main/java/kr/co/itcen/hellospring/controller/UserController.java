package kr.co.itcen.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


//@RequestMapping 메소드 단독 매핑
@Controller
public class UserController {
	@ResponseBody
	@RequestMapping(value="/user/joinform" ,method = RequestMethod.GET)//이제는 파라미터를 주지않아도 된다 ->메핑이 되기 때문에
	public String joinForm() {
		return "UserController:joinForm";
	}
	@RequestMapping(value="/user/join" ,method = RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	@RequestMapping(value="/user/join" ,method = RequestMethod.POST)
	public String join(User user) {
		/* userDao.insert(user) */
		System.out.println(user);
		return "redirect:/hello";
	}
}
