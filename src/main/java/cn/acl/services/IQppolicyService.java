package cn.acl.services;

import java.util.List;

import cn.acl.entity.Qppolicy;


public interface IQppolicyService {
	List<Qppolicy> select();
	
	int delete(Qppolicy p);

	int insert(Qppolicy p);

    int update(Qppolicy p);
    Qppolicy getFlowerById(Qppolicy p);
}
