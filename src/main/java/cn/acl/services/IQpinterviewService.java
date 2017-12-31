package cn.acl.services;

import java.util.List;

import cn.acl.entity.Qpinterview;


public interface IQpinterviewService {
	List<Qpinterview> select();
	
	int delete(Qpinterview p);

	int insert(Qpinterview p);

    int update(Qpinterview p);
    Qpinterview getById(Qpinterview p);
}
