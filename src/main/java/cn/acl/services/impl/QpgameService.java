package cn.acl.services.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.acl.dao.QpgameMapper;
import cn.acl.entity.Qpgame;
import cn.acl.services.IQpgameService;

@Service("QpgameService")
public class QpgameService implements IQpgameService{

	@Resource
	QpgameMapper qpgame ;

	@Override
	public List<Qpgame> select() {
		// TODO Auto-generated method stub
		return qpgame.select();
	}

	@Override
	public int delete(Qpgame p) {
		// TODO Auto-generated method stub
		return qpgame.delete(p);
	}

	@Override
	public int insert(Qpgame p) {
		// TODO Auto-generated method stub
		return qpgame.insert(p);
	}

	@Override
	public int update(Qpgame p) {
		// TODO Auto-generated method stub
		return qpgame.update(p);
	}

	@Override
	public Qpgame getById(Qpgame p) {
		// TODO Auto-generated method stub
		return qpgame.getById(p);
	}

	 
 
}
