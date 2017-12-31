package cn.acl.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.acl.dao.QpinterviewMapper;
import cn.acl.entity.Qpinterview;
import cn.acl.services.IQpinterviewService;


 

@Service("QpinterviewService")
public class QpinterviewService implements IQpinterviewService{

	@Resource
	QpinterviewMapper q ;

	@Override
	public List<Qpinterview> select() {
		// TODO Auto-generated method stub
		return q.select();
	}

	@Override
	public int delete(Qpinterview p) {
		// TODO Auto-generated method stub
		return q.delete(p);
	}

	@Override
	public int insert(Qpinterview p) {
		// TODO Auto-generated method stub
		return q.insert(p);
	}

	@Override
	public int update(Qpinterview p) {
		// TODO Auto-generated method stub
		return q.update(p);
	}

	@Override
	public Qpinterview getById(Qpinterview p) {
		// TODO Auto-generated method stub
		return q.getById(p);
	}

 
}
