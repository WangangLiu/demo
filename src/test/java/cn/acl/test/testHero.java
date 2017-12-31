package cn.acl.test;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import cn.acl.entity.QPpicture;
import cn.acl.entity.Qpculture;
import cn.acl.entity.Qpnews;
import cn.acl.entity.Qppolicy;
import cn.acl.entity.Qpsurvey;
import cn.acl.services.IQPpictureService;
import cn.acl.services.IQpcultureService;
import cn.acl.services.IQpnewsService;
import cn.acl.services.IQppolicyService;
import cn.acl.services.IQpsurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * Created by 刘万刚 on 2016/12/8.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class testHero {
    
    @Autowired
    IQPpictureService service;
    @Autowired
    IQpcultureService  IQpculture;
    @Autowired
    IQppolicyService   IQppolicy;
    @Autowired
	IQpnewsService a;
    
    @Autowired
	IQpsurveyService  psurvey;
    @Test
    public void test111(){
    	Qpsurvey p= new Qpsurvey();
    	p.setKeyid(13);
    	p.setTitle("555");
    	p.setPublictime("444");
    	int update = psurvey.update(p);
    	System.out.println(update);
    }
    
    @Test
    public void test1(){
    
    	List<QPpicture> aaa =  service.getList();
    	for (QPpicture q : aaa) {
			System.out.println(q.getKeyid()+"    "+q.getPtype()+" "+q.getPicture()+"==========IQPpictureService");
		}
    	System.out.println("******************************************************");
    	List<Qpculture> b =  IQpculture.select();
    	for (Qpculture q : b) {
			System.out.println(q.getKeyid()+"   "+q.getTitle()+"=============  IQpculture");
		}
    	
    	System.out.println("***********************************************************");
    	List<Qppolicy> c =  IQppolicy.select();
    	for (Qppolicy q : c) {
			System.out.println(q.getKeyid()+"   "+q.getTitle()+" ============= IQppolicyService  ");
		}
     	List<Qpnews> h = a.select();
    	for (Qpnews u : h) {
			System.out.println(u.getTitle());
		}
    }
    
    /*@Test
    public void testGetByName(){
    	User user = userService.getByUserName("lwg");
    	System.out.println(user.getPassword());
    }

    @Test
    public void testGetInfo(){
    	User user = userService.getInfo(1);
    		System.out.println(user.getUserName());
    		System.out.println(user.getRole().getRolename());
    		System.out.println(user.getRole().getPermission().getPermissionName());
		
    }
      @Test
    public void testCon(){
    	String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
		String dbURL="jdbc:sqlserver://192.168.18.115:1433;DatabaseName=qipai"; 
		String userName="qipai"; 
		String userPwd="7A41FFC2kjA9391D4_1_DDA47EFBA9709";
		try {
			Class.forName(driverName);
			Connection dbCon=DriverManager.getConnection(dbURL,userName,userPwd);
			System.out.println("连接成功");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("连接失败");
		}
    }
    
    @Test
  public void testget(){
  	QPpicture a = service.getById(1);
    	System.out.println(a.getKeyId()+"==="+a.getPtype()+"==="+a.getPicture());
    }*/
}
