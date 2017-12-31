package cn.acl.dao;

import cn.acl.entity.Qpgame;

import java.util.List;

public interface QpgameMapper {
	/**
	 * 
	 * @paramt查询所有对象
	 * @return
	 */
	List<Qpgame> select();
	/**
	 * 
	 * @paramt通过ID删除对象
	 * @return
	 */
	int delete(Qpgame p);
	/**
	 * 
	 * @paramt添加对象
	 * @return
	 */
	int insert(Qpgame p);
	/**
	 * 
	 * @paramt通过ID修改对象
	 * @return
	 */
    int update(Qpgame p);
    /**
	 * 
	 * @paramt通过ID查询对象
	 * @return
	 */
    Qpgame getById(Qpgame p );
}