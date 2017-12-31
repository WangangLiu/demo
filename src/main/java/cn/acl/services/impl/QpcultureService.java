package cn.acl.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.acl.dao.QpcultureMapper;
import cn.acl.services.IQpcultureService;

@Service("QpcultureService")
public class QpcultureService implements IQpcultureService{

	@Resource
	QpcultureMapper Qpculture ;

	@Override
	public List<cn.acl.entity.Qpculture> select() {
		// TODO Auto-generated method stub
		return Qpculture.getList();
	}

	 
 
	 
}
