package cn.acl.web;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.acl.dao.IUserRoleDao;
import cn.acl.entity.t_role_user;
import cn.acl.entity.t_users;
import cn.acl.services.IUserRolePermissionService;

@Controller
@RequestMapping(value = "/admin/user")
public class SysUserController {

	@Autowired
	IUserRolePermissionService userRolePermissionService;

	@Autowired
	IUserRoleDao userRoleDao;

	@RequestMapping("/indexa")
	public String show(Model model, HttpServletRequest request) {
		/*
		 * t_users users=(t_users) SecurityUtils.getSubject().getPrincipal();
		 * String userName = users.getUserName(); System.out.println(userName);
		 */
		return "user/indexa";
	}

	@RequestMapping("/select7")
	public String select(Model model) {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		List<t_users> gets = userRolePermissionService.listUser();
		session.setAttribute("role", subject.getPrincipals());
		session.setAttribute("gets", gets);
		model.addAttribute("gets", gets);
		return "user/listUser";/* 赛事管理管理主界面 */
	}

	@RequestMapping("/doUpdate")
	public String doUpdateUser(t_users user) {
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("超级管理员")) {
			return "user/updateUser";
		}
		return "unauthor";
	}

	@RequestMapping("/update")
	public String updateUser(t_users user, Model model) {
		model.addAttribute("user", user);
		userRolePermissionService.updateUser(user);
		return "user/listUser";
	}

	@RequestMapping(value = "/delete")
	public String delete(t_users users) {
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("超级管理员")) {
			userRoleDao.deleteById(users.getUserId());
			userRolePermissionService.deleteUser(users);
			return "redirect:/admin/user/select7";/* design页面进行删除，，返回赛事管理主界面 */
		}
		return "unauthor";
	}

	@RequestMapping(value = "/pers")
	public String updateRole(@ModelAttribute("userName") String userName) {
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("超级管理员")) {
			t_users users = userRolePermissionService.getByName(userName);
			Integer userId = users.getUserId();
			Session session = subject.getSession();
			t_role_user ur = userRoleDao.getById(userId);
			session.setAttribute("ur", ur);
			session.setAttribute("users", users);
			return "user/role";
		}
		return "unauthor";
	}

	@RequestMapping(value = "/ups")
	public String upSuccess(HttpServletRequest request) {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		int userRoleId = Integer.parseInt(request.getParameter("userRoleId"));
		int userId = Integer.parseInt(request.getParameter("userId"));
		int roleId = Integer.parseInt(request.getParameter("roleId"));
		t_role_user ru = new t_role_user(userRoleId, userId, roleId);
		userRolePermissionService.updateRole(ru);
		session.setAttribute("msgs", "权限修改成功~~~");
		return "user/listUser";
	}

	@RequestMapping("/insert")
	public String doAddUser() {
		Subject subject = SecurityUtils.getSubject();
		if (subject.hasRole("超级管理员")) {
			return "user/add";
		}
		return "unauthor";
	}

	@RequestMapping(value = "/add")
	public String AddUser(HttpServletRequest request,@Valid @ModelAttribute("userr") t_users userr,BindingResult error) {
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");
		if(error.hasErrors()){
			//判断是否有错误信息
			System.out.println("数据绑定出现了错误");
			return "user/add";
		}else{
			Integer i = userRolePermissionService.countUser();
			t_users users = new t_users(i + 1, userName, userPassword);
			userRolePermissionService.addUser(users);
			request.setAttribute("user", users);
			return "user/addRole";/* design页面进行删除，，返回赛事管理主界面 */
		}
	}

	@RequestMapping("/ok")
	public String updaRole(HttpServletRequest request) {
		Integer userRoleId = Integer.parseInt(request.getParameter("userRoleId"));
		Integer userId = Integer.parseInt(request.getParameter("userId"));
		Integer roleId = Integer.parseInt(request.getParameter("roleId"));
		userRolePermissionService.addRU(new t_role_user(userRoleId, userId, roleId));
		return "user/listUser";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model) {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		model.addAttribute("msg", "您已退出,欢迎再次登录");
		return "user/logins";
	}
}
