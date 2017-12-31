package cn.acl.test;

import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.acl.dao.IUserRoleDao;
import cn.acl.entity.t_role_user;
import cn.acl.entity.t_roles;
import cn.acl.entity.t_users;
import cn.acl.services.IUserRolePermissionService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class testUserRolePer {

	@Autowired
	IUserRolePermissionService userRolePermissionService;
	
	@Autowired
	IUserRoleDao userRoleDao;
	
	/*根据用户名：获得用户基本信息*/
	@Test
	public void testGetByName(){
		t_users byName = userRolePermissionService.getByName("lwg");
		System.out.println(byName.getUserPassword());
	}
	
	/*根据用户名：获得用户角色信息*/
	@Test
	public void testGetRolesByName(){
		Set<String> rolesByName = userRolePermissionService.getRolesByName("lwg");
		System.out.println(rolesByName);
	}
	
	/*根据jue名：获得用户权限信息*/
	@Test
	public void testGetPerByRoleName(){
		Set<String> perByRoleName = userRolePermissionService.getPerByRoleName("超级管理员");
		for (String string : perByRoleName) {
			System.out.println(string);
		}
	}
	
	/*根据用户名：查询权限信息 */
	@Test
	public void testGetPerByUserName(){
		Set<String> perByRoleName = userRolePermissionService.getPerByUserName("lwg");
		for (String string : perByRoleName) {
			System.out.println(string);
		}
	}
	
	@Test
	public void testListUser(){
		List<t_users> users = userRolePermissionService.listUser();
		for (t_users user : users) {
			System.out.println(user.getUserName()+"==="+user.getUserPassword());
		}
	}
	
	@Test
	public void testListRole(){
		List<t_roles> roles = userRolePermissionService.listRole();
		for (t_roles role : roles) {
			System.out.println(role.getRoleName()+"==="+role.getRoleId());
		}
	}
	
	@Test
	public void testAddUser(){
		userRolePermissionService.addUser(new t_users(6,"gangge", "321"));
	}
	
	@Test
	public void deleteUser(){
		userRolePermissionService.deleteUser(new t_users(6,"gangge", "321"));
	}
	
	@Test
	public void updateRole(){
		userRolePermissionService.updateRole(new t_role_user(2, 2, 2));
	}
	
	@Test
	public void testGet(){
		t_role_user byId = userRoleDao.getById(1);
		System.out.println(byId.getUserRoleId());
	}
	
	@Test
	public void testAddRu(){
		userRoleDao.addRU(new t_role_user(7,7,3));
	}
	
	@Test
	public void testCountUser(){
		Integer i = userRolePermissionService.countUser();
		System.out.println("当前的user数量："+i);
	}
	
	@Test
	public void testCountUR(){
		Integer i = userRoleDao.countUR();
		System.out.println("当前的ur数量："+i);
	}
}
