package cn.acl.services;

import java.util.List;

import cn.acl.entity.Qpgame;

public interface IQpgameService {
	List<Qpgame> select();
	
	int delete(Qpgame p);

	int insert(Qpgame p);

    int update(Qpgame p);
    Qpgame getById(Qpgame p );
}
