package cn.acl.entity;

/**
 * TODO　权限表
 * @author lwg
 *
 */
public class t_permissions {

	private Integer permissionId;
	private String permissionName;
	
	public t_permissions() {
		super();
	}

	public t_permissions(Integer permissionId, String permissionName) {
		super();
		this.permissionId = permissionId;
		this.permissionName = permissionName;
	}

	public Integer getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	
	
}
