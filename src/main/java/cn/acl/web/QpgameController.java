package cn.acl.web;

import java.util.List;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import cn.acl.entity.Qpgame;
import cn.acl.services.IQpgameService;

 
@Controller
@RequestMapping("admin/qpgame")
public class QpgameController {
	
	@Autowired
	IQpgameService service;
	
	@RequestMapping("/select9")
	public String select(Model model) {
		List<Qpgame> gets = service.select();
		model.addAttribute("gets", gets);
		return "qpgame/design5";/*赛事管理管理主界面*/
	}
	
	@RequestMapping("/insert9")
	public String insert1() {
		Subject subject=SecurityUtils.getSubject();
		if(subject.hasRole("普通管理员")||subject.hasRole("超级管理员")){
			return "qpgame/insert5";/*赛事管理新增的页面*/
		}
		return "unauthor";/*赛事管理新增的页面*/
	}
	
	@RequestMapping(value = "/add9", method = RequestMethod.POST)
	public String add1(Qpgame qp) {
		int insert = service.insert(qp);
		System.out.println("添加的条数："+insert);
		return "redirect:/admin/qpgame/select9";/*添加完成后，，返回赛事管理主界面*/
	}
	
	@RequestMapping(value = "/delete9")
	public String delete(Qpgame qp) {
		Subject subject=SecurityUtils.getSubject();
		if(subject.hasRole("超级管理员")){
		 service.delete(qp);
		 return "redirect:/admin/qpgame/select9";/*design页面进行删除，，返回赛事管理主界面*/
		}
		return "unauthor"; 
	}
	
	@RequestMapping(value = "/update9")
	public String update(Qpgame p, Model model) {
		Subject subject = SecurityUtils.getSubject();
		if(subject.hasRole("普通管理员")||subject.hasRole("超级管理员")){
			Session session = subject.getSession();
			Qpgame f = service.getById(p);
			session.setAttribute("f", f);
			model.addAttribute("f", f);
			return "qpgame/update5";/*design页面点击修改，，跳到修改页面*/
		}
		return "unauthor"; 
	}
	
	@RequestMapping(value = "/update9.do")
	public String update1(Qpgame qp) {
		int update = service.update(qp);
		System.out.println("修改的条数==================:"+update);
		return "redirect:/admin/qpgame/select9";/*页面提交修改，，返回棋牌文化管理主界面*/
	}
	
	//详情页的请求。
	@RequestMapping(value = "/view9")
	public String view(Qpgame p , Model model) {
		Qpgame f = service.getById(p);
		model.addAttribute("f",f);
		return "qpgame/view9";
	}
}
