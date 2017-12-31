package cn.acl.services.impl;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.acl.dao.QpuserMapper;
import cn.acl.entity.Qpuser;
import cn.acl.services.IQpuserService;

@Service("/qpuserService")
public class QpuserService implements IQpuserService{

	@Resource
	QpuserMapper user;

	@Override
	public List<Qpuser> listQP1() {
		// TODO Auto-generated method stub
		return user.listQP1();
	}

	@Override
	public int deleteQP1(Qpuser qp) {
		// TODO Auto-generated method stub
		return user.deleteQP1(qp);
	}

	@Override
	public int insertQP1(Qpuser qp) {
		// TODO Auto-generated method stub
		return user.insertQP1(qp);
	}

	@Override
	public int updateQP1(Qpuser qp) {
		// TODO Auto-generated method stub
		return user.updateQP1(qp);
	}

	@Override
	public Qpuser getById1(Integer id) {
		// TODO Auto-generated method stub
		return user.getById1(id);
	}
	
	


}
