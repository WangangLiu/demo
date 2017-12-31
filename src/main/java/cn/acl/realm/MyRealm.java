package cn.acl.realm;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import cn.acl.entity.t_users;
import cn.acl.services.IUserRolePermissionService;

public class MyRealm extends AuthorizingRealm{

	 
	
	@Resource
	IUserRolePermissionService userRolePermissionService; 
	
	/**
	 * 为当前用户授予权限与角色
	 */
	/*@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName = (String) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
		authorizationInfo.setRoles(userService.getRoles(userName));
		authorizationInfo.setStringPermissions(userService.getPermissions(userName));
		return authorizationInfo;
	}*/
	
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName = (String) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
		authorizationInfo.setRoles(userRolePermissionService.getRolesByName(userName));
		authorizationInfo.setStringPermissions(userRolePermissionService.getPerByUserName(userName));
		return authorizationInfo;
	}

	/**
	 * 验证当前的登陆用户
	 */
	/*@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName = (String) token.getPrincipal();//获取当前身份信息
		User user=userService.getByUserName(userName);
		if(user!=null){
			AuthenticationInfo authInfo=new SimpleAuthenticationInfo(user.getUserName(),user.getPassword(),"xx");
			return authInfo;
		}else{
			return null;
		}
	}*/
	
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName = (String) token.getPrincipal();//获取当前身份信息
		t_users user = userRolePermissionService.getByName(userName);
		if(user!=null){
			AuthenticationInfo authInfo=new SimpleAuthenticationInfo(user.getUserName(),user.getUserPassword(),"xx");
			return authInfo;
		}else{
			return null;
		}
	}

}
