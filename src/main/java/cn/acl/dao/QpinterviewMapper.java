package cn.acl.dao;

import cn.acl.entity.Qpinterview;
import java.util.List;

public interface QpinterviewMapper {
	/**
	 * 
	 * @paramt查询所有对象
	 * @return
	 */
	List<Qpinterview> select();
	/**
	 * 
	 * @paramt通过ID删除对象
	 * @return
	 */
	int delete(Qpinterview p);
	/**
	 * 
	 * @paramt添加对象
	 * @return
	 */
	int insert(Qpinterview p);
	/**
	 * 
	 * @paramt通过ID修改对象
	 * @return
	 */
    int update(Qpinterview p);
    /**
	 * 
	 * @paramt通过ID查询对象
	 * @return
	 */
    Qpinterview getById(Qpinterview p);
}