package cn.acl.services;

import java.util.List;

import cn.acl.entity.Qpsurvey;


public interface IQpsurveyService {
	List<Qpsurvey> select();
	
	int delete(Qpsurvey p);

	int insert(Qpsurvey p);

    int update(Qpsurvey p);
   
    Qpsurvey getById(Qpsurvey p);
}
