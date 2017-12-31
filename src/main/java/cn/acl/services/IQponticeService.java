package cn.acl.services;

import java.util.List;

import cn.acl.entity.Qpnotice;


public interface IQponticeService {
	List<Qpnotice> select();
	
	int delete(Qpnotice p);

	int insert(Qpnotice p);

    int update(Qpnotice p);
   
    Qpnotice getById(Qpnotice p);
}
