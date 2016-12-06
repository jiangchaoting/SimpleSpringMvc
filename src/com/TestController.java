package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@RequestMapping("/")
	public String home(Model model){
		model.addAttribute("time", "123");
		return "home";
	}
	
	@RequestMapping("/hello1")
	@ResponseBody
	public void hello(String id){
		System.out.println(id);
	}
	
	@RequestMapping("/hello2")
	@ResponseBody
	public void hello(HttpServletRequest request){
		String id=request.getParameter("id");
		System.out.println(id);
	}
}
