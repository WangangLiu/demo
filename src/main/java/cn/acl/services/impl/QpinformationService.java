package cn.acl.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.acl.dao.QpinformationMapper;
import cn.acl.entity.Qpinformation;
import cn.acl.services.IQpinformationService;

 


 

@Service("QpinformationService")
public class QpinformationService implements IQpinformationService{

	@Resource
	QpinformationMapper pinformation ;

	@Override
	public List<Qpinformation> select() {
		// TODO Auto-generated method stub
		return pinformation.select();
	}

	@Override
	public int delete(Qpinformation p) {
		// TODO Auto-generated method stub
		return pinformation.delete(p);
	}

	@Override
	public int insert(Qpinformation p) {
		// TODO Auto-generated method stub
		return pinformation.insert(p);
	}

	@Override
	public int update(Qpinformation p) {
		// TODO Auto-generated method stub
		return pinformation.update(p);
	}

	@Override
	public Qpinformation getById(Qpinformation p) {
		// TODO Auto-generated method stub
		return pinformation.getById(p);
	}

	 
 
}
