package cn.acl.dao;

import cn.acl.entity.Qpnotice;
import java.util.List;

public interface QpnoticeMapper {
	/**
	 * 
	 * @paramt查询所有对象
	 * @return
	 */
	List<Qpnotice> select();
	/**
	 * 
	 * @paramt通过ID删除对象
	 * @return
	 */
	int delete(Qpnotice p);
	/**
	 * 
	 * @paramt添加对象
	 * @return
	 */
	int insert(Qpnotice p);
	/**
	 * 
	 * @paramt通过ID修改对象
	 * @return
	 */
    int update(Qpnotice p);
    /**
	 * 
	 * @paramt通过ID查询对象
	 * @return
	 */
    Qpnotice getById(Qpnotice p);
}