package cn.acl.entity;

/**
 * TODO 角色用户联系表
 * @author lwg
 *
 */
public class t_role_user {

	private Integer userRoleId;
	private Integer userId;
	private Integer roleId;
	
	public t_role_user() {
		super();
	}
	

	public t_role_user(Integer userId, Integer roleId) {
		super();
		this.userId = userId;
		this.roleId = roleId;
	}


	public t_role_user(Integer userRoleId, Integer userId, Integer roleId) {
		super();
		this.userRoleId = userRoleId;
		this.userId = userId;
		this.roleId = roleId;
	}

	public Integer getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	
	
}
