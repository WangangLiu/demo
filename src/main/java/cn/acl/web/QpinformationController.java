package cn.acl.web;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import cn.acl.dao.QpinformationMapper;
import cn.acl.entity.Qpinformation;

@Controller
@RequestMapping("admin/pinformation")
public class QpinformationController {
	
	@Resource
	QpinformationMapper pinformation;

	// 查询用户信息
	@RequestMapping("/select5")
	public String select(Model model) {
		List<Qpinformation> gets = pinformation.select();
		model.addAttribute("gets", gets);
		return "pinformation/design5";
	}

	// 跳转提交页面
	@RequestMapping("/insert5")
	public String insert1() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("普通管理员") || subject.hasRole("超级管理员")) {
			return "pinformation/insert5";
		}
		return "unauthor";
	}

	// 接收用户提交的文件上传数据，进行指定地址存储路径并保存
	@RequestMapping(value = "/add5", method = RequestMethod.POST)
	public String add(@Validated Qpinformation p, BindingResult bindingResult, @RequestParam MultipartFile map,
			HttpServletRequest request) {
		String a = request.getSession().getServletContext().getRealPath("/statics/upload");
		try {
			/* for(MultipartFile b: wenjian){ */
			if (!a.isEmpty()) {
				File saveFile = new File(a + File.separator + map.getOriginalFilename());
				FileUtils.copyInputStreamToFile(map.getInputStream(), saveFile);
				System.out.println(saveFile + " ===== " + map.getOriginalFilename());
			}
			/* } */
		} catch (IOException e) {
			e.printStackTrace();
		}
		pinformation.insert(p);
		return "redirect:/admin/pinformation/select5";

	}

	// 删除
	@RequestMapping(value = "/delete5")
	public String delete(Qpinformation p) {
		// 判断当前用户的身份
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("超级管理员")) {
			pinformation.delete(p);
			return "redirect:/admin/pinformation/select5";
		}
		return "unauthor";
	}

	// 接收用户提交信息通过ID查询对象并返回至修改页面进行取值
	@RequestMapping(value = "/update5")
	public String update(Qpinformation p, Model model) {
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("普通管理员") || subject.hasRole("超级管理员")) {
			Qpinformation f = pinformation.getById(p);
			model.addAttribute("f", f);
			return "pinformation/update5";
		}
		return "unauthor";
	}

	// 接收用户提交文件，通过MultipartFile对象接收获得文件名进行指定路径存储
	@RequestMapping(value = "/update5.do", method = RequestMethod.POST)
	public String update1(@Validated Qpinformation p, BindingResult bindingResult, @RequestParam MultipartFile map,
			HttpServletRequest request) {
		// 指定上传路径
		String a = request.getSession().getServletContext().getRealPath("/statics/upload");
		try {
			if (!a.isEmpty()) {
				File saveFile = new File(a + File.separator + map.getOriginalFilename());
				FileUtils.copyInputStreamToFile(map.getInputStream(), saveFile);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		p.setMap(map.getOriginalFilename());
		pinformation.update(p);
		return "redirect:/admin/pinformation/select5";
	}
}
