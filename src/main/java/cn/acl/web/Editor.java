package cn.acl.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Editor {

	@RequestMapping("/ed")
	public String ceshi(HttpServletRequest request){
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		String content=request.getParameter("content");
		System.out.println(name+"==="+pwd+"===="+content);
		return "logins";
	}
}
