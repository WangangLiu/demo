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
import cn.acl.entity.Qpsurvey;
import cn.acl.services.IQpsurveyService;

@Controller
@RequestMapping("admin/psurvey") // 加上身份验证
public class QsurveyController {

	@Autowired
	IQpsurveyService psurvey;

	@RequestMapping("/select4")
	public String select(Model model) {
		List<Qpsurvey> gets = psurvey.select();
		model.addAttribute("a", gets); // 重定向时用model传值必定失败。
		return "psurvey/design4";
	}

	// 单纯的跳转到添加页面
	@RequestMapping("/insert4")
	public String insert1() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("普通管理员") || subject.hasRole("超级管理员")) {
			return "psurvey/insert4";
		}
		return "unauthor";
	}

	// 添加的方法 -附带文件上传
	@RequestMapping(value = "/add4", method = RequestMethod.POST)
	public String add(@Validated Qpsurvey p, BindingResult bindingResult, @RequestParam MultipartFile img,
			HttpServletRequest request) {
		// 指定上传路径
		String a = request.getSession().getServletContext().getRealPath("/statics/upload");
		try {
			if (!a.isEmpty()) {
				// 拼接上传文件全路径名
				File saveFile = new File(a + File.separator + img.getOriginalFilename());
				FileUtils.copyInputStreamToFile(img.getInputStream(), saveFile);
				System.out.println(a + File.separator + img.getOriginalFilename());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		//
		p.setImg(a + File.separator + img.getOriginalFilename());
		// 用户添加信息时，自动添加系统当前时间
		SimpleDateFormat sj = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		p.setPublictime(sj.format(date));
		psurvey.insert(p);
		return "redirect:/admin/psurvey/select4";
	}

	// 删除对象
	@RequestMapping(value = "/delete4")
	public String delete(Qpsurvey p) {
		// 判断当前用户的身份
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("超级管理员")) {
			psurvey.delete(p);
			return "redirect:/admin/psurvey/select4";
		}
		return "unauthor";
	}

	// 获得修改对象的Id，传值到修改页面
	@RequestMapping(value = "/update4")
	public String update5(Qpsurvey p, Model model) {
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("普通管理员") || subject.hasRole("超级管理员")) {
			Qpsurvey f = psurvey.getById(p);
			model.addAttribute("f", f);
			return "psurvey/update4";
		}
		return "unauthor";
	}

	@RequestMapping(value = "/view4")
	public String view(Qpsurvey p, Model model) {
		Qpsurvey f = psurvey.getById(p);
		model.addAttribute("f", f);
		return "psurvey/view4";
	}

	// POST接收修改页面传的值调用Service层update方法进行修改
	@RequestMapping(value = "/update4.do", method = RequestMethod.POST)
	public String dsfs(Qpsurvey p) {
		psurvey.update(p);
		return "redirect:/admin/psurvey/select4";
	}

	// 单纯的跳转主页面的请求
	@RequestMapping("/indexa")
	public String show2() {
		return "user/indexa";
	}
}
