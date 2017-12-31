package cn.acl.services;

import java.util.List;
import java.util.Set;

import cn.acl.entity.t_role_user;
import cn.acl.entity.t_roles;
import cn.acl.entity.t_users;

public interface IUserRolePermissionService {

	/**
	 * TODO 通过用户名查询用户信息
	 * @param userName
	 * @return t_users
	 */
	public t_users getByName(String userName);
	
	/**
	 * TODO 通过用户名查询角色信息
	 * @param userName
	 * @return String
	 */
	public Set<String> getRolesByName(String userName);
	
	/**
	 * TODO 通过jue名查询权限信息
	 * @param userName
	 * @return String
	 */
	public Set<String> getPerByRoleName(String roleName);
	
	/**
	 * TODO 通过用户名查询权限信息
	 * @param roleName
	 * @return String
	 */
	public Set<String> getPerByUserName(String userName);
	
	/**
	 * TODO　修改用户密码信息
	 * @param user
	 */
	public void updateUser(t_users user);
	
	/**
	 * TODO 用户显示列表
	 * @return
	 */
	public List<t_users> listUser();
	public List<t_roles> listRole();
	
	/**
	 * TODO　添加用户信息
	 * @param users
	 */
	public void addUser(t_users users);
	
	/**
	 * TODO 删除用户信息
	 * @param users
	 */
	public void deleteUser(t_users users);
	
	/**
	 * TODO 更新角色信息
	 */
	public void updateRole(t_role_user ru);
	
	/**
	 * TODO 通过更改id来改权限
	 * @return t_role_user
	 */
	public t_role_user getById(Integer id);
	
	/**
	 * TODO　添加quan xian关系
	 * @param ru
	 */
	public void addRU(t_role_user ru);
	
	/**
	 * TODO 获取当前用户的数量
	 * @return
	 */
	public Integer countUser();
	
	/**
	 * TODO 获取当前关系用户的数量
	 * @return
	 */
	public Integer countUR();
	
	/**
	 * TODO 根据roleid删除用户角色信息
	 * @param id
	 */
	public void deleteById(int id);
	
}
