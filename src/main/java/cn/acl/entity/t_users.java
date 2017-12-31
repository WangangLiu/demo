package cn.acl.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

/**
 * TODO 用户表
 * @author lwg
 *
 */
public class t_users {

	private Integer userId;
	
	@Length(min=1,message="{name.length}")
	private String userName;
	
	@Length(max=24,min=6,message="{pwd.length}")//添加jsr303验证
	private String userPassword;
	
	public t_users() {
		super();
	}
	

	public t_users(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}


	public t_users(Integer userId, String userName, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
}
