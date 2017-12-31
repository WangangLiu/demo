package cn.acl.web;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.acl.entity.Qpinterview;
import cn.acl.services.IQpinterviewService;

@Controller
@RequestMapping("admin/pinterview")
public class QpinterviewController {
	
	@Autowired
	IQpinterviewService qpinterview;

	@RequestMapping("/select3")
	public String select(Model model) {
		List<Qpinterview> gets = qpinterview.select();
		model.addAttribute("gets", gets);
		return "pinterview/design3";
	}

	@RequestMapping("/insert3")
	public String insert1() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("普通管理员") || subject.hasRole("超级管理员")) {
			return "pinterview/insert3";
		}
		return "unauthor";
	}

	@RequestMapping(value = "/add3", method = RequestMethod.POST)
	public String add(@Validated Qpinterview p, BindingResult bindingResult, @RequestParam MultipartFile img,
			HttpServletRequest request) {
		String a = request.getSession().getServletContext().getRealPath("/statics/upload");
		try {
			if (!a.isEmpty()) {
				File saveFile = new File(a + File.separator + img.getOriginalFilename());
				FileUtils.copyInputStreamToFile(img.getInputStream(), saveFile);
				System.out.println(saveFile + " ===== " + img.getOriginalFilename());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		p.setImg(img.getOriginalFilename());
		SimpleDateFormat sj = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		p.setPublictime(sj.format(date));
		qpinterview.insert(p);
		return "redirect:/admin/pinterview/select3";
	}

	@RequestMapping(value = "/delete3")
	public String delete(Qpinterview p) {
		// 判断当前用户的身份
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("超级管理员")) {
			qpinterview.delete(p);
			return "redirect:/admin/pinterview/select3";
		}
		return "unauthor";
	}

	@RequestMapping(value = "/update3")
	public String update(Qpinterview p, Model model) {
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("普通管理员") || subject.hasRole("超级管理员")) {
			Qpinterview f = qpinterview.getById(p);
			model.addAttribute("f", f);
			return "pinterview/update3";
		}
		return "unauthor";
	}

	@RequestMapping(value = "/view3")
	public String view3(Qpinterview p, Model model) {
		Qpinterview f = qpinterview.getById(p);
		model.addAttribute("f", f);
		return "pinterview/view3";
	}

	@RequestMapping(value = "/update3.do", method = RequestMethod.POST)
	public String update1(@Validated Qpinterview p, BindingResult bindingResult, @RequestParam MultipartFile img,
			HttpServletRequest request) {
		String a = request.getSession().getServletContext().getRealPath("/statics/upload");
		try {
			if (!a.isEmpty()) {
				File saveFile = new File(a + File.separator + img.getOriginalFilename());
				FileUtils.copyInputStreamToFile(img.getInputStream(), saveFile);
			}
			p.setImg(img.getOriginalFilename());
		} catch (IOException e) {
			e.printStackTrace();
		}
		qpinterview.update(p);
		return "redirect:/admin/pinterview/select3";
	}
}
