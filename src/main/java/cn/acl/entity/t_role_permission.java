package cn.acl.entity;

/**
 * TODO 角色权限表
 * @author lwg
 *
 */
public class t_role_permission {

	private Integer rolePermissionId;
	private Integer roleId;
	private Integer permissionId;
	
	public t_role_permission() {
		super();
	}

	public t_role_permission(Integer rolePermissionId, Integer roleId, Integer permissionId) {
		super();
		this.rolePermissionId = rolePermissionId;
		this.roleId = roleId;
		this.permissionId = permissionId;
	}

	public Integer getRolePermissionId() {
		return rolePermissionId;
	}

	public void setRolePermissionId(Integer rolePermissionId) {
		this.rolePermissionId = rolePermissionId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}
	
	
}
