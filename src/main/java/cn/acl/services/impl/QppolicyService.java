package cn.acl.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.acl.dao.QppolicyMapper;
import cn.acl.entity.Qppolicy;
import cn.acl.services.IQppolicyService;

 

@Service("QppolicyService")
public class QppolicyService implements IQppolicyService{

	@Resource
	QppolicyMapper q ;

	@Override
	public List<Qppolicy> select() {
		// TODO Auto-generated method stub
		return q.select();
	}

	@Override
	public int delete(Qppolicy p) {
		// TODO Auto-generated method stub
		return q.delete(p);
	}

	@Override
	public int insert(Qppolicy p) {
		// TODO Auto-generated method stub
		return q.insert(p);
	}

	@Override
	public int update(Qppolicy p) {
		// TODO Auto-generated method stub
		return q.update(p);
	}

	@Override
	public Qppolicy getFlowerById(Qppolicy p) {
		// TODO Auto-generated method stub
		return q.getFlowerById(p);
	}

 
}
