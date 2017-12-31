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

import cn.acl.entity.Qpuser;
import cn.acl.services.IQpuserService;

@Controller
@RequestMapping(value = "admin/qpuser")
public class QPuserController {

	@Autowired
	IQpuserService service;

	@RequestMapping("/select0")
	public String select(Model model) {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		List<Qpuser> gets = service.listQP1();
		session.setAttribute("gets", gets);
		model.addAttribute("gets", gets);
		return "qpuser/design6";/* 赛事管理管理主界面 */
	}

	@RequestMapping("/insert6")
	public String insert1() {
		// 判断当前用户的身份
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("普通管理员") || subject.hasRole("超级管理员")) {
			return "qpuser/insert6";/* 赛事管理新增的页面 */
		}
		return "unauthor";
	}

	@RequestMapping(value = "/add0", method = RequestMethod.POST)
	public String add1(Qpuser qp) {
		int insert = service.insertQP1(qp);
		System.out.println("添加的条数：" + insert);
		return "redirect:/admin/qpuser/select6";/* 添加完成后，，返回赛事管理主界面 */
	}

	@RequestMapping(value = "/delete0")
	public String delete(Qpuser qp) {
		// 判断当前用户的身份
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("超级管理员")) {
			int delete = service.deleteQP1(qp);
			if (delete > 0) {
				System.out.println("删除成功的条数" + delete);
			} else {
				System.out.println("删除失败~~~");
			}
			return "redirect:/admin/qpuser/select6";/*design页面进行删除，，返回赛事管理主界面*/
		}
		return "unauthor";
	}

	@RequestMapping(value = "/update0")
	public String update(Qpuser qp, Model model) {
		// 判断当前用户的身份
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("普通管理员") || subject.hasRole("超级管理员")) {
			Session session = subject.getSession();
			Qpuser f = service.getById1(qp.getKeyid());
			session.setAttribute("f", f);
			model.addAttribute("f", f);
			return "qpuser/update6";/* design页面点击修改，，跳到修改页面 */
		}
		return "unauthor";
	}

	@RequestMapping(value = "/update0.do")
	public String update1(Qpuser qp) {
		int update = service.updateQP1(qp);
		System.out.println("修改的条数==================:" + update);
		return "redirect:/admin/qpuser/select6";/* 页面提交修改，，返回棋牌文化管理主界面 */
	}
}
