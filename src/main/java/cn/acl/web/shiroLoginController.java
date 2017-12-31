package cn.acl.web;

import javax.servlet.http.HttpServletRequest;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.acl.entity.t_users;

@Controller
@RequestMapping(value = "/")
public class shiroLoginController {
	
	@RequestMapping(value = "/logins",method = RequestMethod.GET)
    public String login(){
        return "user/logins";
    }
	
	@RequestMapping(value = "/logins",method = RequestMethod.POST)
	public String login(Model model,HttpServletRequest request,t_users user){
		Subject subject=SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(user.getUserName(),user.getUserPassword(),"xx");
		try {
			subject.login(token);
			Session session=subject.getSession();
			session.setAttribute("msg", "   ");
			return "redirect:/admin/user/indexa";
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("user", user);
			request.setAttribute("msg", "抱歉，用户名或者密码错误");
			return "user/logins";
		}
	}
	
}
