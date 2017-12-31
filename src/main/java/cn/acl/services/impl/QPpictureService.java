package cn.acl.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.acl.dao.IQPpictureDao;
import cn.acl.entity.QPpicture;
import cn.acl.services.IQPpictureService;

@Service("QPpictureService")
public class QPpictureService implements IQPpictureService{

	@Resource
	IQPpictureDao QPpicture;

	@Override
	public List<cn.acl.entity.QPpicture> getList() {
		// TODO Auto-generated method stub
		return QPpicture.getList();
	}

	@Override
	public int delete(cn.acl.entity.QPpicture p) {
		// TODO Auto-generated method stub
		return QPpicture.delete(p);
	}

	@Override
	public int insert(cn.acl.entity.QPpicture p) {
		// TODO Auto-generated method stub
		return QPpicture.insert(p);
	}

	@Override
	public int update(cn.acl.entity.QPpicture p) {
		// TODO Auto-generated method stub
		return QPpicture.update(p);
	}

	@Override
	public cn.acl.entity.QPpicture getById(QPpicture p) {
		// TODO Auto-generated method stub
		return QPpicture.getById(p);
	}
 
}
