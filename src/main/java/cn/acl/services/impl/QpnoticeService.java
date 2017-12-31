package cn.acl.services.impl;

import java.util.List;
import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.acl.dao.QpnoticeMapper;
import cn.acl.entity.Qpnotice;
import cn.acl.services.IQponticeService;

@Service("QpnoticeService")
public class QpnoticeService implements IQponticeService{

	@Resource
	QpnoticeMapper qpnotice ;

	@Override
	public List<Qpnotice> select() {
		// TODO Auto-generated method stub
		return qpnotice.select();
	}

	@Override
	public int delete(Qpnotice p) {
		// TODO Auto-generated method stub
		return qpnotice.delete(p);
	}

	@Override
	public int insert(Qpnotice p) {
		// TODO Auto-generated method stub
		return qpnotice.insert(p);
	}

	@Override
	public int update(Qpnotice p) {
		// TODO Auto-generated method stub
		return qpnotice.update(p);
	}

	@Override
	public Qpnotice getById(Qpnotice p) {
		// TODO Auto-generated method stub
		return qpnotice.getById(p);
	}
 
 
}
