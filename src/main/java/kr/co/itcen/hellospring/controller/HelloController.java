package kr.co.itcen.hellospring.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	//POJO
	@RequestMapping("/hello")
	public String hello() {
		return "/WEB-INF/views/hello.jsp";
	}
	@RequestMapping("/hello2")
	public ModelAndView hello2() {
		String data = "Hello world2";
		ModelAndView mav = new ModelAndView();
		mav.addObject("data",data);
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}
	@RequestMapping("/hello3")
	public String hello3(Model model) {
		String data = "Hello world3";
		model.addAttribute("data",data);
		return "/WEB-INF/views/hello.jsp";
	}
	@RequestMapping("/hello4")
	public String hello4(String email,Model model) {
		model.addAttribute("email",email);
		return "/WEB-INF/views/hello.jsp";
	}
	@RequestMapping("/hello5")
	public String hello5(
			@RequestParam("e") String email,
			Model model) {
		model.addAttribute("email",email);
		return "/WEB-INF/views/hello.jsp";
	}
	@RequestMapping("/hello6")
	public String hello6(
			@RequestParam(value="e",required=false,defaultValue="") String email,//값이 없어도 에러가 안난다.,default값을 ""으로 세팅
			Model model) {
		model.addAttribute("email",email);
		return "/WEB-INF/views/hello.jsp";
	}
	@RequestMapping("/hello7")
	public String hello7(
			@RequestParam(value="email",required=false,defaultValue="") String email,//값이 없어도 에러가 안난다.,default값을 ""으로 세팅
			@RequestParam(value="age",required=false,defaultValue="0") int age,
			Model model) {
		model.addAttribute("email",email);
		model.addAttribute("age",age);	
		return "/WEB-INF/views/hello.jsp";
	}
	@RequestMapping("/hello8")
	public String hello8(
			@ModelAttribute User user,
			Model model) {
		System.out.println(user);
		model.addAttribute("email",user.getEmail());
		model.addAttribute("age",user.getAge());
		
		return "/WEB-INF/views/hello.jsp";
	}
	
//	@RequestMapping("/hello9") //안좋은 코드 예
//	public void hello9(
//			@ModelAttribute User user,
//			HttpServletRequest request,	
//			HttpServletResponse response,
//			Writer out,
//			Model model) throws IOException,ServletException {
//		System.out.println(user);
//		request.getRequestDispatcher("/WEB-INF/views/hello.jsp").forward(request, response);
//		out.write("<h1>안됨</h1>");
//	}
	
	@ResponseBody
	@RequestMapping("/hello9") //안좋은 코드 예
	public String hello9() {
		return "<h1>OK</h1>";//out과 같은 동작을 해준다.
	}
}
	
