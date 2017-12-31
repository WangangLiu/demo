package cn.acl.services.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.acl.dao.IUserRoleDao;
import cn.acl.dao.IUserRolePermission;
import cn.acl.entity.t_role_user;
import cn.acl.entity.t_roles;
import cn.acl.entity.t_users;
import cn.acl.services.IUserRolePermissionService;

@Service("/UserRolePermissionService")
public class UserRolePermissionService implements IUserRolePermissionService{

	@Autowired
	IUserRolePermission userRolePermission;
	
	@Autowired
	IUserRoleDao useRoleDao;

	@Override
	public t_users getByName(String userName) {
		// TODO Auto-generated method stub
		return userRolePermission.getByName(userName);
	}

	@Override
	public Set<String> getRolesByName(String userName) {
		// TODO Auto-generated method stub
		return userRolePermission.getRolesByName(userName);
	}

	@Override
	public Set<String> getPerByRoleName(String roleName) {
		// TODO Auto-generated method stub
		return userRolePermission.getPerByRoleName(roleName);
	}

	@Override
	public Set<String> getPerByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRolePermission.getPerByUserName(userName);
	}

	@Override
	public void updateUser(t_users user) {
		// TODO Auto-generated method stub
		userRolePermission.updateUser(user);
	}

	@Override
	public void addUser(t_users users) {
		// TODO Auto-generated method stub
		userRolePermission.addUser(users);
	}

	@Override
	public void deleteUser(t_users users) {
		// TODO Auto-generated method stub
		userRolePermission.deleteUser(users);
	}

	@Override
	public List<t_users> listUser() {
		// TODO Auto-generated method stub
		return userRolePermission.listUser();
	}

	@Override
	public void updateRole(t_role_user ru) {
		// TODO Auto-generated method stub
		userRolePermission.updateRole(ru);
	}

	@Override
	public List<t_roles> listRole() {
		// TODO Auto-generated method stub
		return userRolePermission.listRole();
	}

	@Override
	public t_role_user getById(Integer id) {
		// TODO Auto-generated method stub
		return useRoleDao.getById(id);
	}

	@Override
	public void addRU(t_role_user ru) {
		// TODO Auto-generated method stub
		useRoleDao.addRU(ru);
	}

	@Override
	public Integer countUser() {
		// TODO Auto-generated method stub
		return userRolePermission.countUser();
	}

	@Override
	public Integer countUR() {
		// TODO Auto-generated method stub
		return useRoleDao.countUR();
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		useRoleDao.deleteById(id);
	}
}
