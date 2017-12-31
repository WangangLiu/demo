package cn.acl.services;

import java.util.List;

import cn.acl.entity.Qpinformation;



public interface IQpinformationService {
	List<Qpinformation> select();
	
	int delete(Qpinformation p);

	int insert(Qpinformation p);

    int update(Qpinformation p);
   
    Qpinformation getById(Qpinformation p);
}
