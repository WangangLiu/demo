package cn.acl.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.acl.dao.QpsurveyMapper;
import cn.acl.entity.Qpsurvey;
import cn.acl.services.IQpsurveyService;
 

@Service("QpsurveyService")
public class QpsurveyService implements IQpsurveyService{

	 @Autowired
	QpsurveyMapper survey ;

	@Override
	public List<Qpsurvey> select() {
		// TODO Auto-generated method stub
		return survey.select();
	}

	@Override
	public int delete(Qpsurvey p) {
		// TODO Auto-generated method stub
		return survey.delete(p);
	}

	@Override
	public int insert(Qpsurvey p) {
		// TODO Auto-generated method stub
		return survey.insert(p);
	}

	@Override
	public int update(Qpsurvey p) {
		// TODO Auto-generated method stub
		return survey.update(p);
	}

	@Override
	public Qpsurvey getById(Qpsurvey p) {
		// TODO Auto-generated method stub
		return survey.getById(p);
	}

	 
}
