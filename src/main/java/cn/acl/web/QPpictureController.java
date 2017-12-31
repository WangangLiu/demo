package cn.acl.web;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

import cn.acl.dao.IQPpictureDao;
import cn.acl.entity.QPpicture;
import cn.acl.entity.Qpnews;
import cn.acl.entity.Qppolicy;
import cn.acl.services.IQpnewsService;
import cn.acl.services.IQppolicyService;

@Controller
@RequestMapping("admin/picture")
public class QPpictureController {

	@Autowired
	IQppolicyService qppolicy;

	@Autowired
	IQpnewsService a;

	@Resource
	IQPpictureDao qPpicture;

	@RequestMapping("/select")
	public String select(Model model) {
		// ͨ��Service��ʵ���������÷�װ�ĵײ㷽�����в�ѯ��
		List<Qppolicy> gets = qppolicy.select();
		// ����һ�����϶���ͨ��Model���󴫵�designҳ�����ȡֵ
		model.addAttribute("gets", gets);
		return "picture/design"; // �ض�����model��ֵ�ض�ʧ��
	}

	@RequestMapping("/insert1")
	public String insert1() {
		// �жϵ�ǰ�û������
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("��ͨ����Ա") || subject.hasRole("��������Ա")) {
			return "picture/insert1";
		}
		return "unauthor";
	}

	@RequestMapping("/insert")
	public String insert() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("��ͨ����Ա") || subject.hasRole("��������Ա")) {
			return "picture/insert";
		}
		return "unauthor";
	}

	@RequestMapping("/select1")
	public String select1(Model model) {
		List<Qpnews> gets = a.select();
		model.addAttribute("gets", gets); // �ض�����model��ֵ��ʧ�ܡ�
		return "picture/design1";
	}
	
	
	
	@RequestMapping(value="/fenye")
	public String fenye(Qpnews qpnews,HttpSession session,HttpServletRequest request,Model model){
		boolean flag=false;
			qpnews.setPageSize(5);
		
		String s_pageNo=null;
		Integer rows = a.countRow();
		
		//������ҳ��
		int totalPage=rows%qpnews.getPageSize()==0?rows/qpnews.getPageSize():rows/qpnews.getPageSize()+1;
		
		if(request.getParameter("pageNo")==null){
			s_pageNo="1";
		}else{
			s_pageNo=request.getParameter("pageNo");
		}
		int pageNo=Integer.parseInt(s_pageNo);
		if(pageNo<1){
			pageNo=1;
		}else if(pageNo>totalPage){
			pageNo=totalPage;
		}
		qpnews.setPageNo(pageNo);
		
		//���õ�ǰҳ
		qpnews.setCurrentPage((pageNo-1)*qpnews.getPageSize());
		List<Qpnews> list=a.fenye(qpnews);  
		if(list!=null){
			session.setAttribute("list", list);
			session.setAttribute("totalPage", totalPage);
			session.setAttribute("pageNo", pageNo);
			flag=true;
		}
		if(flag){
			return "picture/fenye";
		}else{
			return "redirect:/admin/picture/select1";
		}
	}
	

	
	
	// �û���ת���������
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(Qpnews p) {
		// Ϊ�û������Ϣʱ���Զ����ϵͳ��ǰʱ�䡣
		SimpleDateFormat sj = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		p.setNtime(sj.format(date));
		a.insert(p);
		return "redirect:/admin/picture/select1";
	}

	@RequestMapping(value = "/add1", method = RequestMethod.POST)
	public String add1(Qppolicy p) {
		// �жϵ�ǰ�û������
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("��ͨ����Ա") || subject.hasRole("��������Ա")) {
			// Ϊ�û������Ϣʱ���Զ����ϵͳ��ǰʱ�䡣
			SimpleDateFormat sj = new SimpleDateFormat("yyyy-MM-dd");
			Date date = new Date();
			p.setPublictime(sj.format(date));
			qppolicy.insert(p);
			return "redirect:/admin/picture/select";
		}
		return "unauthor";
	}

	// ���մ����û�ɾ��������
	@RequestMapping(value = "/delete")
	public String delete(Qppolicy p) {
		// �жϵ�ǰ�û������
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("��������Ա")) {
			qppolicy.delete(p);
			return "redirect:/admin/picture/select";
		}
		return "unauthor";
	}

	// ���մ����û�ɾ��������
	@RequestMapping(value = "/delete1")
	public String delete1(Qpnews p) {
		// �жϵ�ǰ�û������
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("��������Ա")) {
			a.delete(p);
			return "redirect:/admin/picture/select1";
		}
		return "unauthor";
	}

	@RequestMapping(value = "/update")
	public String update(Qppolicy p, Model model) {
		// �жϵ�ǰ�û������
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("��ͨ����Ա") || subject.hasRole("��������Ա")) {
			Qppolicy f = qppolicy.getFlowerById(p);
			model.addAttribute("f", f);
			return "picture/update";
		}
		return "unauthor";
	}

	@RequestMapping(value = "/update.do")
	public String update1(Qppolicy p) {
		qppolicy.update(p);
		return "redirect:/admin/picture/select";
	}

	@RequestMapping(value = "/update1")
	public String update2(Qpnews p, Model model) {
		// �жϵ�ǰ�û������
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("��ͨ����Ա") || subject.hasRole("��������Ա")) {
			// ��ֵ�Ķ��ַ�ʽ
			/*
			 * Subject subject=SecurityUtils.getSubject(); Session
			 * session=subject.getSession();
			 */
			Qpnews f = a.getFlowerById(p);
			/* session.setAttribute("f", f); */
			model.addAttribute("f", f);
			return "picture/update1";
		}
		return "unauthor";
	}

	// ���ղ������û��޸ĵ����󣬲��ض�������ѯҳ�档
	@RequestMapping(value = "/update1.do")
	public String update3(Qpnews p) {
		a.update(p);
		return "redirect:/admin/picture/select1";
	}

	// ����ҳ������
	@RequestMapping(value = "/view")
	public String view(Qppolicy p, Model model) {
		Qppolicy f = qppolicy.getFlowerById(p);
		model.addAttribute("f", f);
		return "picture/view1";
	}

	@RequestMapping(value = "/view2")
	public String view2(Qpnews p, Model model) {
		Qpnews f = a.getFlowerById(p);
		String[] j = f.getImg().split("&");
		model.addAttribute("f", f);
		model.addAttribute("j", j);
		return "picture/view2";
	}

	@RequestMapping("/select7")
	public String selec(Model model) {
		List<QPpicture> gets = qPpicture.getList();
		model.addAttribute("gets", gets); // ��ת��ʽΪ�ض����ʱ����model��ֵ�ض�ʧ�ܡ����о�
		return "ppicture/design7";
	}

	@RequestMapping("/insert7")
	public String inser() {
		// �жϵ�ǰ�û������
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("��ͨ����Ա") || subject.hasRole("��������Ա")) {
			return "ppicture/insert7";
		}
		return "unauthor";
	}

	@RequestMapping(value = "/add7", method = RequestMethod.POST)
	public String add(@Validated QPpicture p, BindingResult bindingResult, @RequestParam MultipartFile picture,
			HttpServletRequest request) {
		String a = request.getSession().getServletContext().getRealPath("/statics/upload");
		try {
			/* for(MultipartFile b: wenjian){ */
			if (!a.isEmpty()) {
				File saveFile = new File(a + File.separator + picture.getOriginalFilename());
				FileUtils.copyInputStreamToFile(picture.getInputStream(), saveFile);
				System.out.println(saveFile + " ===== " + picture.getOriginalFilename());
			}
			/* } */
		} catch (IOException e) {
			e.printStackTrace();
		}
		qPpicture.insert(p);
		return "redirect:/admin/picture/select7";
	}

	@RequestMapping(value = "/delete7")
	public String delete(QPpicture p) {
		// �жϵ�ǰ�û������
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("��������Ա")) {
			qPpicture.delete(p);
			return "redirect:/admin/picture/select7";
		}
		return "unauthor";
	}

	@RequestMapping(value = "/update7")
	public String update(QPpicture p, Model model) {
		// �жϵ�ǰ�û������
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("��ͨ����Ա") || subject.hasRole("��������Ա")) {
			QPpicture f = qPpicture.getById(p);
			model.addAttribute("f", f);
			return "ppicture/update7";
		}
		return "unauthor";
	}

	@RequestMapping(value = "/update7.do", method = RequestMethod.POST)
	public String update1(@Validated QPpicture p, BindingResult bindingResult, @RequestParam MultipartFile picture,
			HttpServletRequest request) {
		String a = request.getSession().getServletContext().getRealPath("/statics/upload");
		try {
			/* for(MultipartFile b: wenjian){ */
			if (!a.isEmpty()) {
				File saveFile = new File(a + File.separator + picture.getOriginalFilename());
				FileUtils.copyInputStreamToFile(picture.getInputStream(), saveFile);
				System.out.println("�ϴ��ɹ���·��Ϊ��" + saveFile + " ===== " + picture.getOriginalFilename());
			}
			/* } */
			p.setPicture(picture.getOriginalFilename());
		} catch (IOException e) {
			e.printStackTrace();
		}
		qPpicture.update(p);
		return "redirect:/admin/picture/select7";
	}
}
