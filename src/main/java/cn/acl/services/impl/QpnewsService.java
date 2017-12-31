package cn.acl.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.acl.dao.QpnewsMapper;
import cn.acl.services.IQpnewsService;


@Service("QpnewsService")
public class QpnewsService implements IQpnewsService{

	@Resource
	QpnewsMapper Qpnews;

	@Override
	public List<cn.acl.entity.Qpnews> select() {
		// TODO Auto-generated method stub
		return Qpnews.select();
	}

	@Override
	public int delete(cn.acl.entity.Qpnews p) {
		// TODO Auto-generated method stub
		return Qpnews.delete(p);
	}

	@Override
	public int insert(cn.acl.entity.Qpnews p) {
		// TODO Auto-generated method stub
		return Qpnews.insert(p);
	}

	@Override
	public int update(cn.acl.entity.Qpnews p) {
		// TODO Auto-generated method stub
		return Qpnews.update(p);
	}

	@Override
	public cn.acl.entity.Qpnews getFlowerById(cn.acl.entity.Qpnews p) {
		// TODO Auto-generated method stub
		return Qpnews.getFlowerById(p);
	}

	@Override
	public List<cn.acl.entity.Qpnews> fenye(cn.acl.entity.Qpnews p) {
		// TODO Auto-generated method stub
		return Qpnews.fenye(p);
	}

	@Override
	public Integer countRow() {
		// TODO Auto-generated method stub
		return Qpnews.countRow();
	}

}
