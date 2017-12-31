package cn.acl.dao;

import cn.acl.entity.t_role_user;

public interface IUserRoleDao {

	/**
	 * TODO 通过更改id来改权限
	 * @return t_role_user
	 */
	public t_role_user getById(Integer id);
	
	/**
	 * TODO　添加关系
	 * @param ru
	 */
	public void addRU(t_role_user ru);
	
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
