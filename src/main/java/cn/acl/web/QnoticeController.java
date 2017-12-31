package cn.acl.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import cn.acl.dao.QpnoticeMapper;
import cn.acl.entity.Qpnotice;

@Controller
@RequestMapping("admin/pnotice")
public class QnoticeController {
	
	@Resource
	QpnoticeMapper qnotice;

	// 查询所有信息
	@RequestMapping("/select6")
	public String select(Model model) {
		List<Qpnotice> gets = qnotice.select();
		model.addAttribute("gets", gets);
		return "pnotice/design6";
	}

	// 跳转添加页面
	@RequestMapping("/insert6")
	public String insert1() {
		// 判断当前用户的身份
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("普通管理员") || subject.hasRole("超级管理员")) {
			return "pnotice/insert6";
		}
		return "unauthor";
	}

	//
	@RequestMapping(value = "/add6", method = RequestMethod.POST)
	public String add(@Validated Qpnotice p) {
		// 为用户添加信息自动添加系统当前时间
		SimpleDateFormat sj = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		p.setPublictime(sj.format(date));
		qnotice.insert(p);
		return "redirect:/admin/pnotice/select6";
	}

	// 通过接收页面传的ID进行删除
	@RequestMapping(value = "/delete6")
	public String delete(Qpnotice p) {
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("超级管理员")) {
			qnotice.delete(p);
			return "redirect:/admin/pnotice/select6";
		}
		return "unauthor";
	}

	// 接收页面传的ID进行ID查询单个对象，并把对象信息用Model传值到update6页面
	@RequestMapping(value = "/update6")
	public String update(Qpnotice p, Model model) {
		// 判断当前用户的身份
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("普通管理员") || subject.hasRole("超级管理员")) {
			// 通过ID查询
			Qpnotice f = qnotice.getById(p);
			model.addAttribute("f", f);
			return "pnotice/update6";
		}
		// 身份不匹配则跳转至该页面
		return "unauthor";
	}

	// POST请求接收用户i提交的数据进行修改
	@RequestMapping(value = "/update6.do", method = RequestMethod.POST)
	public String update1(@Validated Qpnotice p) {
		// 执行删除
		qnotice.update(p);
		return "redirect:/admin/pnotice/select6";

	}
}
